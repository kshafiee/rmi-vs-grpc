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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import sapphire.grpc.example.BaseClass;
import sapphire.grpc.example.SubSubClass11;
import sapphire.grpc.example.SubSubClass22;
import sapphire.grpc.example.generated.Base;
import sapphire.grpc.example.generated.InvokeRequest;
import sapphire.grpc.example.generated.InvokeResponse;
import sapphire.grpc.example.generated.InvokerGrpc;


public class InvokerClientGRPC {
  private static final Logger logger = Logger.getLogger(InvokerClientGRPC.class.getName());

  private final ManagedChannel channel;
  private final InvokerGrpc.InvokerBlockingStub blockingStub;

  public InvokerClientGRPC(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        .usePlaintext(true)
        .build());
  }

  InvokerClientGRPC(ManagedChannel channel) {
    this.channel = channel;
    blockingStub = InvokerGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  public BaseClass invoke(String methodName, ArrayList<BaseClass> args) throws StatusRuntimeException {
    // logger.info("Will try to invoke " + methodName + " with args " + args + " ...");
    InvokeRequest.Builder requestBuilder = InvokeRequest.newBuilder();
    requestBuilder.setMethodName(methodName);
    for (int i=0; i<args.size(); i++) { // Note: Generate this loop with our compiler into a lib.
      Base.Builder b = (Base.Builder)args.get(i).toProto();
          requestBuilder.addArg(i, b);
    }
    InvokeResponse response;
    try {
      response = blockingStub.invoke(requestBuilder.build());
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      throw e;
    }
    return BaseClass.fromProto(null, response.getReturnValue());
  }


  static void printPerformance(long elapsedTime, long iterations) {
    System.out.println("Total execution time for" +
            String.format(" %d RPCs: %d min, %d sec",
                    iterations, TimeUnit.NANOSECONDS.toMinutes(elapsedTime),
                    TimeUnit.NANOSECONDS.toSeconds(elapsedTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(elapsedTime))));
    System.out.println(String.format("%d RPCs/sec", iterations*1000000000/elapsedTime));
  }

  public static void main(String[] commandLineArgs) throws Exception {
    InvokerClientGRPC client = new InvokerClientGRPC("localhost", 50051);
    try {
      int iterations = 1;  // Do it a bunch of times and measure performance.
      String methodName = "myMethodName";
      // Send a bunch of relatively complex nested object.
      Long ages[] = { 12L, 12L, 15L };
      SubSubClass11 arg0 = new SubSubClass11();
      arg0.corpus = SubSubClass11.Corpus.PRODUCTS;
      arg0.isThisDumb = true;
      arg0.name = "foo";
      arg0.value = "42";
      arg0.ages = new ArrayList<Long>();
      arg0.ages.addAll(Arrays.asList(ages));
      ArrayList<BaseClass> args = new ArrayList<>();
      args.add(arg0);
      SubSubClass22 arg1 = new SubSubClass22();
      arg1.name = "bar";
      arg1.value = 37;
      args.add(arg1);

      if (commandLineArgs.length > 0) {
        iterations = Integer.parseInt(commandLineArgs[0]);
      }
      // The first one is always slow - Bootstrapping, JIT, class loading etc.  Start the timer after that.
      BaseClass returnVal = client.invoke(methodName, args);
      logger.info("Return value: " + returnVal);

      long startTime = System.nanoTime();
      for (int i=0; i<iterations; i++) {
        returnVal = client.invoke(methodName, args);
      }
      long elapsedTime = System.nanoTime() - startTime;
      printPerformance(elapsedTime, iterations);

    } finally {
      client.shutdown();
    }
  }
}
