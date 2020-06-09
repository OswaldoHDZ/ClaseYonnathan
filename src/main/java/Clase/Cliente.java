/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import com.mycompany.servidorinterface.servidorInterface;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Oswaldo
 */
public class Cliente {
    public static void main(String[] args) throws RemoteException,AlreadyBoundException, NotBoundException{
        Registry registry = LocateRegistry.getRegistry();
        servidorInterface interface1 = (servidorInterface) registry.lookup("prueba");
        System.err.println(interface1.holaJava("desde el cliente"));
    }
}
