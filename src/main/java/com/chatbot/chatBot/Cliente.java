package com.chatbot.chatBot;

import java.rmi.Naming;

public class Cliente {
	public static void main(String[] args) {
        try {
            Chat stub = (Chat) Naming.lookup("rmi://localhost:1099/Chat");
            System.out.println("COMECAMOS:");
            stub.conversar();
        } catch (Exception e) {
            System.err.println("Exceção no cliente: " + e.getMessage());
        }
    }
}
