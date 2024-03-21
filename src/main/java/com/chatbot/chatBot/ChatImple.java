package com.chatbot.chatBot;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatImple extends UnicastRemoteObject implements Chat {

    private static final long serialVersionUID = 1L;

    protected ChatImple() throws RemoteException {
        super();
    }
    
    @Override
    public void conversar() throws RemoteException {
        try {
            // Obter a classe ChatBot
        	Class<?> chatBotClass = Class.forName("com.chatbot.chatBot.ChatBot");

            // Obter o método main de ChatBot
            Method mainMethod = chatBotClass.getMethod("main", String[].class);

            // Argumentos para o método main (opcional)
            String[] arguments = {"argumento1", "argumento2"};

            // Invocar o método main de ChatBot
            mainMethod.invoke(null, (Object) arguments);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
