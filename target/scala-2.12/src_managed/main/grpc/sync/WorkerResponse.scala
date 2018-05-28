// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc.sync

@SerialVersionUID(0L)
final case class WorkerResponse(
    weightsUpdate: scala.collection.immutable.Map[_root_.scala.Int, _root_.scala.Double] = scala.collection.immutable.Map.empty,
    stop: _root_.scala.Boolean = false
    ) extends scalapb.GeneratedMessage with scalapb.Message[WorkerResponse] with scalapb.lenses.Updatable[WorkerResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      weightsUpdate.foreach(weightsUpdate => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(grpc.sync.WorkerResponse._typemapper_weightsUpdate.toBase(weightsUpdate).serializedSize) + grpc.sync.WorkerResponse._typemapper_weightsUpdate.toBase(weightsUpdate).serializedSize)
      if (stop != false) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, stop) }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      weightsUpdate.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(grpc.sync.WorkerResponse._typemapper_weightsUpdate.toBase(__v).serializedSize)
        grpc.sync.WorkerResponse._typemapper_weightsUpdate.toBase(__v).writeTo(_output__)
      };
      {
        val __v = stop
        if (__v != false) {
          _output__.writeBool(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): grpc.sync.WorkerResponse = {
      val __weightsUpdate = (scala.collection.immutable.Map.newBuilder[_root_.scala.Int, _root_.scala.Double] ++= this.weightsUpdate)
      var __stop = this.stop
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __weightsUpdate += grpc.sync.WorkerResponse._typemapper_weightsUpdate.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, grpc.sync.WorkerResponse.WeightsUpdateEntry.defaultInstance))
          case 16 =>
            __stop = _input__.readBool()
          case tag => _input__.skipField(tag)
        }
      }
      grpc.sync.WorkerResponse(
          weightsUpdate = __weightsUpdate.result(),
          stop = __stop
      )
    }
    def clearWeightsUpdate = copy(weightsUpdate = scala.collection.immutable.Map.empty)
    def addWeightsUpdate(__vs: (_root_.scala.Int, _root_.scala.Double)*): WorkerResponse = addAllWeightsUpdate(__vs)
    def addAllWeightsUpdate(__vs: TraversableOnce[(_root_.scala.Int, _root_.scala.Double)]): WorkerResponse = copy(weightsUpdate = weightsUpdate ++ __vs)
    def withWeightsUpdate(__v: scala.collection.immutable.Map[_root_.scala.Int, _root_.scala.Double]): WorkerResponse = copy(weightsUpdate = __v)
    def withStop(__v: _root_.scala.Boolean): WorkerResponse = copy(stop = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => weightsUpdate.map(grpc.sync.WorkerResponse._typemapper_weightsUpdate.toBase)(_root_.scala.collection.breakOut)
        case 2 => {
          val __t = stop
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(weightsUpdate.map(grpc.sync.WorkerResponse._typemapper_weightsUpdate.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
        case 2 => _root_.scalapb.descriptors.PBoolean(stop)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc.sync.WorkerResponse
}

object WorkerResponse extends scalapb.GeneratedMessageCompanion[grpc.sync.WorkerResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[grpc.sync.WorkerResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): grpc.sync.WorkerResponse = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc.sync.WorkerResponse(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[grpc.sync.WorkerResponse.WeightsUpdateEntry]].map(grpc.sync.WorkerResponse._typemapper_weightsUpdate.toCustom)(_root_.scala.collection.breakOut),
      __fieldsMap.getOrElse(__fields.get(1), false).asInstanceOf[_root_.scala.Boolean]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[grpc.sync.WorkerResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc.sync.WorkerResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[grpc.sync.WorkerResponse.WeightsUpdateEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(grpc.sync.WorkerResponse._typemapper_weightsUpdate.toCustom)(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SyncProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SyncProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = grpc.sync.WorkerResponse.WeightsUpdateEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.grpc.sync.WorkerResponse.WeightsUpdateEntry
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc.sync.WorkerResponse(
  )
  @SerialVersionUID(0L)
  final case class WeightsUpdateEntry(
      key: _root_.scala.Int = 0,
      value: _root_.scala.Double = 0.0
      ) extends scalapb.GeneratedMessage with scalapb.Message[WeightsUpdateEntry] with scalapb.lenses.Updatable[WeightsUpdateEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (key != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, key) }
        if (value != 0.0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(2, value) }
        __size
      }
      final override def serializedSize: _root_.scala.Int = {
        var read = __serializedSizeCachedValue
        if (read == 0) {
          read = __computeSerializedValue()
          __serializedSizeCachedValue = read
        }
        read
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
        {
          val __v = key
          if (__v != 0) {
            _output__.writeUInt32(1, __v)
          }
        };
        {
          val __v = value
          if (__v != 0.0) {
            _output__.writeDouble(2, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): grpc.sync.WorkerResponse.WeightsUpdateEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __key = _input__.readUInt32()
            case 17 =>
              __value = _input__.readDouble()
            case tag => _input__.skipField(tag)
          }
        }
        grpc.sync.WorkerResponse.WeightsUpdateEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Int): WeightsUpdateEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Double): WeightsUpdateEntry = copy(value = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != 0) __t else null
          }
          case 2 => {
            val __t = value
            if (__t != 0.0) __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PInt(key)
          case 2 => _root_.scalapb.descriptors.PDouble(value)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = grpc.sync.WorkerResponse.WeightsUpdateEntry
  }
  
  object WeightsUpdateEntry extends scalapb.GeneratedMessageCompanion[grpc.sync.WorkerResponse.WeightsUpdateEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[grpc.sync.WorkerResponse.WeightsUpdateEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): grpc.sync.WorkerResponse.WeightsUpdateEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      grpc.sync.WorkerResponse.WeightsUpdateEntry(
        __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
        __fieldsMap.getOrElse(__fields.get(1), 0.0).asInstanceOf[_root_.scala.Double]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[grpc.sync.WorkerResponse.WeightsUpdateEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        grpc.sync.WorkerResponse.WeightsUpdateEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Double]).getOrElse(0.0)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = grpc.sync.WorkerResponse.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = grpc.sync.WorkerResponse.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = grpc.sync.WorkerResponse.WeightsUpdateEntry(
    )
    implicit class WeightsUpdateEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, grpc.sync.WorkerResponse.WeightsUpdateEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, grpc.sync.WorkerResponse.WeightsUpdateEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[grpc.sync.WorkerResponse.WeightsUpdateEntry, (_root_.scala.Int, _root_.scala.Double)] =
      _root_.scalapb.TypeMapper[grpc.sync.WorkerResponse.WeightsUpdateEntry, (_root_.scala.Int, _root_.scala.Double)](__m => (__m.key, __m.value))(__p => grpc.sync.WorkerResponse.WeightsUpdateEntry(__p._1, __p._2))
  }
  
  implicit class WorkerResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, grpc.sync.WorkerResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, grpc.sync.WorkerResponse](_l) {
    def weightsUpdate: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Int, _root_.scala.Double]] = field(_.weightsUpdate)((c_, f_) => c_.copy(weightsUpdate = f_))
    def stop: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.stop)((c_, f_) => c_.copy(stop = f_))
  }
  final val WEIGHTSUPDATE_FIELD_NUMBER = 1
  final val STOP_FIELD_NUMBER = 2
  @transient
  private val _typemapper_weightsUpdate: _root_.scalapb.TypeMapper[grpc.sync.WorkerResponse.WeightsUpdateEntry, (_root_.scala.Int, _root_.scala.Double)] = implicitly[_root_.scalapb.TypeMapper[grpc.sync.WorkerResponse.WeightsUpdateEntry, (_root_.scala.Int, _root_.scala.Double)]]
}