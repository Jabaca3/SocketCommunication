package test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkHost {
	
	public static void main(String[] args) {

		try {
			
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("Connecting...");
			Socket socket = serverSocket.accept(); // Establish Connection
			System.out.println("Connected");
			
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			System.out.println("Client says=" + dis.readUTF());
			serverSocket.close();
			
		} catch (Exception e) {
			System.out.println(e);

		}

	}
}
