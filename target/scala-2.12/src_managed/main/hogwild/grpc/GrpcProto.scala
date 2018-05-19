// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package hogwild.grpc

object GrpcProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    hogwild.grpc.WorkerRequest,
    hogwild.grpc.WorkerResponse,
    hogwild.grpc.Empty,
    hogwild.grpc.WorkersDetails,
    hogwild.grpc.WorkerAddress,
    hogwild.grpc.InformationRequest,
    hogwild.grpc.InformationResponse,
    hogwild.grpc.WorkerBroadcast
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CgpncnBjLnByb3RvEgdob2d3aWxkIo4BCg1Xb3JrZXJSZXF1ZXN0EkAKCGdyYWRpZW50GAIgAygLMiQuaG9nd2lsZC5Xb3JrZ
  XJSZXF1ZXN0LkdyYWRpZW50RW50cnlSCGdyYWRpZW50GjsKDUdyYWRpZW50RW50cnkSEAoDa2V5GAEgASgNUgNrZXkSFAoFdmFsd
  WUYAiABKAFSBXZhbHVlOgI4ASKeAQoOV29ya2VyUmVzcG9uc2USEAoDZGlkGAEgASgNUgNkaWQSPgoHd2VpZ2h0cxgCIAMoCzIkL
  mhvZ3dpbGQuV29ya2VyUmVzcG9uc2UuV2VpZ2h0c0VudHJ5Ugd3ZWlnaHRzGjoKDFdlaWdodHNFbnRyeRIQCgNrZXkYASABKA1SA
  2tleRIUCgV2YWx1ZRgCIAEoAVIFdmFsdWU6AjgBIgcKBUVtcHR5IlAKDldvcmtlcnNEZXRhaWxzEj4KDndvcmtlckFkcmVzc2VzG
  AEgAygLMhYuaG9nd2lsZC5Xb3JrZXJBZGRyZXNzUg53b3JrZXJBZHJlc3NlcyI9Cg1Xb3JrZXJBZGRyZXNzEhgKB2FkZHJlc3MYA
  SABKAlSB2FkZHJlc3MSEgoEcG9ydBgCIAEoDVIEcG9ydCIuChJJbmZvcm1hdGlvblJlcXVlc3QSGAoHYWRkcmVzcxgBIAEoCVIHY
  WRkcmVzcyIpChNJbmZvcm1hdGlvblJlc3BvbnNlEhIKBHBvcnQYASABKA1SBHBvcnQiwgEKD1dvcmtlckJyb2FkY2FzdBJRCg13Z
  WlnaHRzVXBkYXRlGAEgAygLMisuaG9nd2lsZC5Xb3JrZXJCcm9hZGNhc3QuV2VpZ2h0c1VwZGF0ZUVudHJ5Ug13ZWlnaHRzVXBkY
  XRlEhoKCHdvcmtlcklkGAIgASgNUgh3b3JrZXJJZBpAChJXZWlnaHRzVXBkYXRlRW50cnkSEAoDa2V5GAEgASgNUgNrZXkSFAoFd
  mFsdWUYAiABKAFSBXZhbHVlOgI4ATJbChFXb3JrZXJTZXJ2aWNlU3luYxJGCg1VcGRhdGVXZWlnaHRzEhYuaG9nd2lsZC5Xb3JrZ
  XJSZXF1ZXN0GhcuaG9nd2lsZC5Xb3JrZXJSZXNwb25zZSIAKAEwATLqAQoSV29ya2VyU2VydmljZUFzeW5jEk0KDklkZW50aWZpY
  2F0aW9uEhsuaG9nd2lsZC5JbmZvcm1hdGlvblJlcXVlc3QaHC5ob2d3aWxkLkluZm9ybWF0aW9uUmVzcG9uc2UiABI6CgVSZWFke
  RIWLmhvZ3dpbGQuV29ya2VyQWRkcmVzcxoXLmhvZ3dpbGQuV29ya2Vyc0RldGFpbHMiABJJCg1VcGRhdGVXZWlnaHRzEhguaG9nd
  2lsZC5Xb3JrZXJCcm9hZGNhc3QaGC5ob2d3aWxkLldvcmtlckJyb2FkY2FzdCIAKAEwAWIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}