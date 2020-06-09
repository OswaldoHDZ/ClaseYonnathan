/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servidorinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Oswaldo
 */
public interface servidorInterface extends Remote{
    String holaJava(String nombre) throws RemoteException;
}
