package com.lloseng.ocsf.client;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleClient extends AbstractClient {

	
	
	public ConsoleClient(String hostname, int port) {
		super(hostname, port);
	}

	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println(msg.toString());
	}

	public void consoleDialog() throws IOException {
		openConnection();
		Scanner console = new Scanner(System.in);
		// loop until user quits
		while( isConnected() ) {
			String msg = console.nextLine();
			super.sendToServer(msg);
			// read the user's input text and sent it to server
		}
	}

	public static void main(String[] args) throws IOException {
//		String hostname = "localhost";
		String hostname = "158.108.141.214";
		ConsoleClient client = new ConsoleClient(hostname,5001);
		client.consoleDialog();
	}
}
