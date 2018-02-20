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

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import sapphire.grpc.example.BaseClass;
import sapphire.grpc.example.SubSubClass11;
import sapphire.grpc.example.SubSubClass22;
import sapphire.grpc.example.rmiinterface.RMIInterface;


public class InvokerClientRMI {
    private static RMIInterface look_up;

    static void printPerformance(long elapsedTime, long iterations) {
      System.out.println("Total execution time for" +
            String.format(" %d RPCs: %d min, %d sec",
                    iterations, TimeUnit.NANOSECONDS.toMinutes(elapsedTime),
                    TimeUnit.NANOSECONDS.toSeconds(elapsedTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(elapsedTime))));
      System.out.println(String.format("%d RPCs/sec", iterations*1000000000/elapsedTime));
    }

    public static void main(String[] commandLineArgs) throws Exception {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.10.171", Integer.parseInt("22345"));
            look_up = (RMIInterface) registry.lookup("//localhost/MyServer");

            int iterations = 1;  // Do it a bunch of times and measure performance.
            String methodName = "myMethodName";
            Long ages[] = { 12L, 12L, 15L };
            SubSubClass11 arg0 = new SubSubClass11();
            arg0.corpus = SubSubClass11.Corpus.PRODUCTS;
            arg0.isThisDumb = true;
            arg0.name = "foo";
            arg0.value = "42";arg0.ages = new ArrayList<Long>();
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

            BaseClass returnVal = look_up.helloTo(methodName, args);

            long startTime = System.nanoTime();
            for (int i=0; i<iterations; i++) {
              returnVal = look_up.helloTo(methodName, args);
            }
            long elapsedTime = System.nanoTime() - startTime;
            printPerformance(elapsedTime, iterations);
        } catch (Exception e) {
          System.err.println("Server exception: " + e.toString());
          e.printStackTrace();
        }
    }
}