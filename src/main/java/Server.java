
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddren
 */
public class Server {
    public static void main(String[] args) throws MalformedURLException {
        try
        {
            AdderRemote obj = new AdderRemote();
            Registry reg=LocateRegistry.createRegistry(1009);
            reg.rebind("Hello Server", obj);
            System.out.println("Server is ready");
            
            //Naming.rebind("HelloServer", obj);
             
        } catch (RemoteException e) {
            System.out.println(e.getMessage());
        }
    }
}
