package computations

import model.SparseNumVector
import utils.Label.Label
import utils.Types.{Counts, LearningRate}


case class SVM(stepSize: LearningRate = 0.1) {
  var weights: SparseNumVector = SparseNumVector(Map.empty.withDefaultValue(0d))

  def updateWeight(gradient: SparseNumVector): Unit = {
    gradient.values.keySet.foreach { k =>
      val w_k = weights.values(k) - stepSize * gradient.values(k)
      weights = SparseNumVector(weights.values + (k -> w_k))
    }
  }

  def loss(features: IndexedSeq[SparseNumVector], labels: IndexedSeq[Label], lambda: Double, tidCounts: Counts): Double = {
    require(features.size == labels.size)
    features.zip(labels)
      .map { case (f, l) =>
        val hinge = Math.max(0, 1 - (l.id * f.dotProduct(weights)))
        val reg = 0.5 * lambda * f.mapTo { (k, v) => Math.pow(weights.values.withDefaultValue(0d)(k), 2) / tidCounts(k) }.values.values.sum
        hinge + reg
      }.sum
  }

}

object SVM {
  def computeStochasticGradient(feature: SparseNumVector,
                                label: Label,
                                weights: SparseNumVector,
                                lambda: Double,
                                tidCounts: Counts): SparseNumVector = {
    val gradRightPart = SparseNumVector(
      feature.values.map { case (k, v) => k -> (lambda * weights.values.withDefaultValue(0d)(k) / tidCounts(k)) })
    if (label.id * feature.dotProduct(weights) >= 1) {
      gradRightPart
    } else {
      gradRightPart.pointWise(feature.mapTo((_, v) => v * (-label.id)), _ + _)
    }
  }

}
