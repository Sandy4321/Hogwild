package dataset

import model.SparseNumVector
import utils.Label.Label
import utils.Types.{Counts, TID}
import utils.{Label, Logger}

import scala.collection.mutable
import scala.io.Source
import scala.util.Random

case class Dataset(logger: Logger, dataPath: String) {

  lazy val inverseTidCountsVector = SparseNumVector(tidCounts.mapValues(1d / _))
  lazy val testSet: Seq[(SparseNumVector[Double], Label)] = logger.load(2)("test-set") {
    val testPath = dataPath + "lyrl2004_vectors_train.dat"
    for {
      line <- Source.fromFile(testPath).getLines
    } yield {
      val (did, vect) = parseLine(line)
      vect -> labels(did)
    }
  }.toList
  private lazy val tidCounts: Counts = logger.load(2)("tidCounts") {
    var counts = mutable.Map.empty[Int, Int]
    for {
      f <- filePaths
      line <- Source.fromFile(f).getLines
      (tid, _) <- parseTailLine(line.split(" ").map(_.trim).filter(_.nonEmpty).drop(1))
    } {
      val count = counts.getOrElse(tid, 0)
      counts.update(tid, count + 1)
    }
    counts.toMap
  }
  private lazy val labels: Map[Int, Label] = logger.load(2)("labels") {
    val labelPath = dataPath + "rcv1-v2.topics.qrels"
    val labelOfInterest = "CCAT"
    Source.fromFile(labelPath)
      .getLines
      .toStream
      .par
      .map { line =>
        line.split(" ").filterNot(_.isEmpty).take(2).toList match {
          case label :: id :: Nil => id.toInt -> (label == labelOfInterest)
          case _ => throw new IllegalStateException("label file is corrupted")
        }
      }
      .toList
      .groupBy(_._1)
      .mapValues { v => Label(v.exists(_._2)) }
  }
  private lazy val filePaths: List[String] = {
    (0 until 4).map(i => dataPath + filename(i)).toList
  }
  private lazy val randomSampling = logger.load(2)("samples") {
    new Iterator[(SparseNumVector[Double], Label)] {
      private var iterator: Iterator[Iterator[(SparseNumVector[Double], Label)]] = Nil.iterator
      private var group: Iterator[(SparseNumVector[Double], Label)] = Nil.iterator
      private var epoch = 0
      private val numPerFile = 200000
      private val groupSize = 40000
      private var isStart = true

      private def numDropAtStart = {
        if (isStart) {
          val nGroupToDrop = Random.nextInt(numPerFile / groupSize)
          isStart = false
          nGroupToDrop
        } else {
          0
        }
      }

      private def generateIterator = Random.shuffle(filePaths)
        .iterator
        .flatMap { path =>
          Source.fromFile(path)
            .getLines
            .grouped(groupSize)
        }
        .drop(numDropAtStart)
        .map { group =>
          group
            .par
            .map { line =>
              val (did, vect) = parseLine(line)
              vect -> labels(did)
            }
            .toIterator
        }

      override def next: (SparseNumVector[Double], Label) = {
        if (group.isEmpty) {
          if (iterator.isEmpty) {
            logger.log(1)(s"[DATA] dataset random sampling epoch $epoch")
            iterator = generateIterator
            epoch += 1
          }
          group = iterator.next
        }
        group.next
      }

      override def hasNext: Boolean = true
    }
  }
  val tids: Seq[TID] = 1 to 47236

  def getSample: (SparseNumVector[Double], Label) = randomSampling.next

  def getReady(loadTest: Boolean): Dataset = {
    logger.log(2)("Loading dataset")
    tidCounts
    labels
    randomSampling
    if (loadTest) {
      testSet
    }
    logger.log(2)("Dataset ready!!")
    logger.log(2)(s"Dataset loaded in ${logger.timeFromStart}")
    logger.resetStartingTime()
    this
  }

  private def filename(i: Int) = s"lyrl2004_vectors_test_pt$i.dat"

  private def parseLine(line: String): (Int, SparseNumVector[Double]) = {
    val lineSplitted = line.split(" ").map(_.trim).filter(_.nonEmpty)
    val did: Int = lineSplitted(0).toInt
    val vector = SparseNumVector(parseTailLine(lineSplitted.drop(1)).toMap)
    did -> vector
  }

  private def parseTailLine(lineSplitted: Array[String]): Array[(Int, Double)] = {
    lineSplitted.map { e =>
      val idx = e.indexOf(':')
      e.substring(0, idx).toInt -> e.substring(idx + 1).toDouble
    }
  }

}
