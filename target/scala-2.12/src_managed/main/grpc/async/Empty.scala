// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc.async

@SerialVersionUID(0L)
final case class Empty(
    ) extends scalapb.GeneratedMessage with scalapb.Message[Empty] with scalapb.lenses.Updatable[Empty] {
    final override def serializedSize: _root_.scala.Int = 0
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): grpc.async.Empty = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case tag => _input__.skipField(tag)
        }
      }
      grpc.async.Empty(
      )
    }
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = throw new MatchError(__fieldNumber)
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = throw new MatchError(__field)
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc.async.Empty
}

object Empty extends scalapb.GeneratedMessageCompanion[grpc.async.Empty] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[grpc.async.Empty] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): grpc.async.Empty = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    grpc.async.Empty(
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[grpc.async.Empty] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc.async.Empty(
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AsyncProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AsyncProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc.async.Empty(
  )
  implicit class EmptyLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, grpc.async.Empty]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, grpc.async.Empty](_l) {
  }
}