package grpc

import utils.Mode

trait GrpcRunnable[T <: Mode] {
  def run(mode: T): Unit
}