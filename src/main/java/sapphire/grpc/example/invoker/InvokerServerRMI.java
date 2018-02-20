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

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import sapphire.grpc.example.BaseClass;
import sapphire.grpc.example.rmiinterface.RMIInterface;


public class InvokerServerRMI extends UnicastRemoteObject implements RMIInterface {
    private static final long serialVersionUID = 1L;

    protected InvokerServerRMI() throws RemoteException {
        super();
    }

    @Override
    public BaseClass helloTo(String methodName, ArrayList<BaseClass> args) throws RemoteException{
      BaseClass response = new BaseClass();
      List<BaseClass> responseArgs = new ArrayList<>(args.size()); // Pack them into application arguments
      for (int i = 0; i < args.size(); i++) {
          responseArgs.add(args.get(i));
      }
      response.value = responseArgs.get(1).value;
      response.name = responseArgs.get(1).name;
      return response;
    }

    public static void main(String[] args){
        int port = 1099;
        try {
            port = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid arguments!!");
            return;
        }
        System.setProperty("java.rmi.server.hostname", args[0]);
        try {
            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind("//localhost/MyServer", new InvokerServerRMI());
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}