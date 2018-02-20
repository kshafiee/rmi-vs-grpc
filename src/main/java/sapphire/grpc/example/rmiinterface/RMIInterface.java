package sapphire.grpc.example.rmiinterface;

/**
 * Created by k00759368 on 1/26/2018.
 */

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import sapphire.grpc.example.BaseClass;
import sapphire.grpc.example.SubSubClass11;

public interface RMIInterface extends Remote{
    public BaseClass helloTo(String methodName, ArrayList<BaseClass> args) throws RemoteException;
}