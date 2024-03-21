package com.chatbot.chatBot;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) throws MalformedURLException {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/Chat", new ChatImple());
        } catch (RemoteException e) {
            System.err.println("rmiregistry is already launched on this port");
            e.printStackTrace();
        }
    }
}
