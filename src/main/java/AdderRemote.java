
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddren
 */
public class AdderRemote extends UnicastRemoteObject implements Adder

{
public AdderRemote() throws RemoteException{
   // super();
}

    public int add(int x, int y) throws RemoteException {
        return x + y;
    }


}
