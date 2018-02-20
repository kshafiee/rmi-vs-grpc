package foo.rmiinterface;

/**
 * Created by k00759368 on 1/26/2018.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote{
    public String helloTo(String name) throws RemoteException;
}