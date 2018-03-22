// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc.sync

@SerialVersionUID(0L)
final case class SlaveRequest(
    gradient: scala.collection.immutable.Map[_root_.scala.Int, _root_.scala.Double] = scala.collection.immutable.Map.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[SlaveRequest] with scalapb.lenses.Updatable[SlaveRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      gradient.foreach(gradient => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(grpc.sync.SlaveRequest._typemapper_gradient.toBase(gradient).serializedSize) + grpc.sync.SlaveRequest._typemapper_gradient.toBase(gradient).serializedSize)
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
      gradient.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(grpc.sync.SlaveRequest._typemapper_gradient.toBase(__v).serializedSize)
        grpc.sync.SlaveRequest._typemapper_gradient.toBase(__v).writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): grpc.sync.SlaveRequest = {
      val __gradient = (scala.collection.immutable.Map.newBuilder[_root_.scala.Int, _root_.scala.Double] ++= this.gradient)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __gradient += grpc.sync.SlaveRequest._typemapper_gradient.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, grpc.sync.SlaveRequest.GradientEntry.defaultInstance))
          case tag => _input__.skipField(tag)
        }
      }
      grpc.sync.SlaveRequest(
          gradient = __gradient.result()
      )
    }
    def clearGradient = copy(gradient = scala.collection.immutable.Map.empty)
    def addGradient(__vs: (_root_.scala.Int, _root_.scala.Double)*): SlaveRequest = addAllGradient(__vs)
    def addAllGradient(__vs: TraversableOnce[(_root_.scala.Int, _root_.scala.Double)]): SlaveRequest = copy(gradient = gradient ++ __vs)
    def withGradient(__v: scala.collection.immutable.Map[_root_.scala.Int, _root_.scala.Double]): SlaveRequest = copy(gradient = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => gradient.map(grpc.sync.SlaveRequest._typemapper_gradient.toBase)(_root_.scala.collection.breakOut)
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(gradient.map(grpc.sync.SlaveRequest._typemapper_gradient.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc.sync.SlaveRequest
}

object SlaveRequest extends scalapb.GeneratedMessageCompanion[grpc.sync.SlaveRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[grpc.sync.SlaveRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): grpc.sync.SlaveRequest = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc.sync.SlaveRequest(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[grpc.sync.SlaveRequest.GradientEntry]].map(grpc.sync.SlaveRequest._typemapper_gradient.toCustom)(_root_.scala.collection.breakOut)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[grpc.sync.SlaveRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc.sync.SlaveRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[grpc.sync.SlaveRequest.GradientEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(grpc.sync.SlaveRequest._typemapper_gradient.toCustom)(_root_.scala.collection.breakOut)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SyncProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SyncProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = grpc.sync.SlaveRequest.GradientEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.grpc.sync.SlaveRequest.GradientEntry
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc.sync.SlaveRequest(
  )
  @SerialVersionUID(0L)
  final case class GradientEntry(
      key: _root_.scala.Int = 0,
      value: _root_.scala.Double = 0.0
      ) extends scalapb.GeneratedMessage with scalapb.Message[GradientEntry] with scalapb.lenses.Updatable[GradientEntry] {
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
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): grpc.sync.SlaveRequest.GradientEntry = {
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
        grpc.sync.SlaveRequest.GradientEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Int): GradientEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Double): GradientEntry = copy(value = __v)
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
      def companion = grpc.sync.SlaveRequest.GradientEntry
  }
  
  object GradientEntry extends scalapb.GeneratedMessageCompanion[grpc.sync.SlaveRequest.GradientEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[grpc.sync.SlaveRequest.GradientEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): grpc.sync.SlaveRequest.GradientEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      grpc.sync.SlaveRequest.GradientEntry(
        __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
        __fieldsMap.getOrElse(__fields.get(1), 0.0).asInstanceOf[_root_.scala.Double]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[grpc.sync.SlaveRequest.GradientEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        grpc.sync.SlaveRequest.GradientEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Double]).getOrElse(0.0)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = grpc.sync.SlaveRequest.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = grpc.sync.SlaveRequest.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = grpc.sync.SlaveRequest.GradientEntry(
    )
    implicit class GradientEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, grpc.sync.SlaveRequest.GradientEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, grpc.sync.SlaveRequest.GradientEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[grpc.sync.SlaveRequest.GradientEntry, (_root_.scala.Int, _root_.scala.Double)] =
      _root_.scalapb.TypeMapper[grpc.sync.SlaveRequest.GradientEntry, (_root_.scala.Int, _root_.scala.Double)](__m => (__m.key, __m.value))(__p => grpc.sync.SlaveRequest.GradientEntry(__p._1, __p._2))
  }
  
  implicit class SlaveRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, grpc.sync.SlaveRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, grpc.sync.SlaveRequest](_l) {
    def gradient: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Int, _root_.scala.Double]] = field(_.gradient)((c_, f_) => c_.copy(gradient = f_))
  }
  final val GRADIENT_FIELD_NUMBER = 1
  @transient
  private val _typemapper_gradient: _root_.scalapb.TypeMapper[grpc.sync.SlaveRequest.GradientEntry, (_root_.scala.Int, _root_.scala.Double)] = implicitly[_root_.scalapb.TypeMapper[grpc.sync.SlaveRequest.GradientEntry, (_root_.scala.Int, _root_.scala.Double)]]
}
