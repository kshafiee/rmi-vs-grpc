/*
 * Copyright 2015, gRPC Authors All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sapphire.grpc.example.invoker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import sapphire.grpc.example.BaseClass;
import sapphire.grpc.example.generated.Base;
import sapphire.grpc.example.generated.InvokeRequest;
import sapphire.grpc.example.generated.InvokeResponse;
import sapphire.grpc.example.generated.InvokerGrpc;


public class InvokerServerGRPC {
  private static final Logger logger = Logger.getLogger(InvokerServerGRPC.class.getName());

  private Server server;

  private void start() throws IOException {
    int port = 50051;
    server = ServerBuilder.forPort(port)
        .addService(new InvokerImpl())
        .build()
        .start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        InvokerServerGRPC.this.stop();
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  public static void main(String[] args) throws IOException, InterruptedException {
    final InvokerServerGRPC server = new InvokerServerGRPC();
    server.start();
    server.blockUntilShutdown();
  }

  static class InvokerImpl extends InvokerGrpc.InvokerImplBase {

    @Override
    public void invoke(InvokeRequest req, StreamObserver<InvokeResponse> responseObserver) {
      // logger.info("Invoked with request size " + req.getArg(1).getSerializedSize());
      List<Base> protoArgs = req.getArgList(); // Incoming protobuf arguments
      int argc = req.getArgCount();
      List<BaseClass> args = new ArrayList<>(argc); // Pack them into application arguments
      for (int i = 0; i < argc; i++) {
        args.add(BaseClass.fromProto(null, protoArgs.get(i)));
      }
      // Just to test, return the second argument as the response.
      InvokeResponse response = InvokeResponse.newBuilder().setReturnValue((Base.Builder)args.get(1).toProto()).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
  }
}
