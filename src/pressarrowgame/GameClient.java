package pressarrowgame;

import java.io.IOException;
import java.util.Scanner;

import com.lloseng.ocsf.client.AbstractClient;

public class GameClient extends AbstractClient{

	private Scanner console;
	
	public GameClient(String host, int port) {
		super(host, port);
		console = new Scanner(System.in);
	}

	public void consoleDialog() throws IOException {
		openConnection();
		// loop until user quits
		while( isConnected() ) {
			String msg = console.nextLine();
			sendToServer(msg);
		}
	}
	
	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println(msg.toString());
	}
	
	public static void main(String[] args) throws IOException {
		GameClient client = new GameClient("192.168.1.14",5001);
//		client.openConnection();
		client.consoleDialog();
	}

}
