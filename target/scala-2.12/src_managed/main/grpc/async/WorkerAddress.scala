// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc.async

@SerialVersionUID(0L)
final case class WorkerAddress(
    address: _root_.scala.Predef.String = "",
    port: _root_.scala.Int = 0
    ) extends scalapb.GeneratedMessage with scalapb.Message[WorkerAddress] with scalapb.lenses.Updatable[WorkerAddress] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (address != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, address) }
      if (port != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(2, port) }
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
        val __v = address
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = port
        if (__v != 0) {
          _output__.writeUInt32(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): grpc.async.WorkerAddress = {
      var __address = this.address
      var __port = this.port
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __address = _input__.readString()
          case 16 =>
            __port = _input__.readUInt32()
          case tag => _input__.skipField(tag)
        }
      }
      grpc.async.WorkerAddress(
          address = __address,
          port = __port
      )
    }
    def withAddress(__v: _root_.scala.Predef.String): WorkerAddress = copy(address = __v)
    def withPort(__v: _root_.scala.Int): WorkerAddress = copy(port = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = address
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = port
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(address)
        case 2 => _root_.scalapb.descriptors.PInt(port)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc.async.WorkerAddress
}

object WorkerAddress extends scalapb.GeneratedMessageCompanion[grpc.async.WorkerAddress] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[grpc.async.WorkerAddress] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): grpc.async.WorkerAddress = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc.async.WorkerAddress(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[_root_.scala.Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[grpc.async.WorkerAddress] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc.async.WorkerAddress(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AsyncProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AsyncProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc.async.WorkerAddress(
  )
  implicit class WorkerAddressLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, grpc.async.WorkerAddress]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, grpc.async.WorkerAddress](_l) {
    def address: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.address)((c_, f_) => c_.copy(address = f_))
    def port: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.port)((c_, f_) => c_.copy(port = f_))
  }
  final val ADDRESS_FIELD_NUMBER = 1
  final val PORT_FIELD_NUMBER = 2
}
