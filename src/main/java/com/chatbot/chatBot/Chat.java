package com.chatbot.chatBot;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Chat extends Remote {
	void conversar() throws RemoteException;
}
