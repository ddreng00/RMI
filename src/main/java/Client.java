
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddren
 */
public class Client   {
    public static void main(String[] args) {

    try
    {
            
            Registry reg=LocateRegistry.getRegistry("localhost",1009);
            Adder stub=(Adder)reg.lookup("Hello Server");
            int a=3467;
            int b=8786;
            System.out.println(a +" + " + b +" = " +stub.add(a, b));
        
    } catch (RemoteException e) {
        System.out.println(e.getMessage());
    } catch (NotBoundException e) {
        System.out.println( e.getMessage());
    }
    }}
