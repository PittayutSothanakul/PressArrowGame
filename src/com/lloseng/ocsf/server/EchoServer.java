package com.lloseng.ocsf.server;

import java.io.IOException;

public class EchoServer extends AbstractServer {

	public EchoServer(int port) {
		super(port);
	}

	@Override
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) {
		super.sendToAllClients(msg);
	}
	
	private static final int PORT = 5555;
	
	public static void main(String[] args) {
		EchoServer server = new EchoServer(PORT);
		try {
			server.listen();
			System.out.printf("Listening on port %d\n",PORT);
		} catch (IOException e) {
			System.out.println("Couldn't start server:");
			System.out.println(e);
		} 
	}
	
}
