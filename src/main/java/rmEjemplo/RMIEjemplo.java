/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmEjemplo;

import com.mycompany.servidorinterface.servidorInterface;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Oswaldo
 */
public class RMIEjemplo {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException{
        Remote remote = UnicastRemoteObject.exportObject(new servidorInterface(
                
        
        ) {
            @Override
            public String holaJava(String nombre) throws RemoteException {
                return "Hola" + nombre;
            }
        },0);
        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        registry.bind("prueba", remote);
    }
}
