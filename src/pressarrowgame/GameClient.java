package pressarrowgame;

import java.io.IOException;
import java.util.Observable;

import com.lloseng.ocsf.client.AbstractClient;

public class GameClient extends AbstractClient implements java.util.Observer {

	private Score score;
	
	public GameClient(String host, int port, Score score) throws IOException {
		super(host, port);
		this.score = score;
		consoleDialog();
	}

	public void consoleDialog() throws IOException {
		openConnection();
		// loop until user quits
		while( isConnected() ) {
			sendToServer(score.getScores());
		}
	}
	
	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println(msg.toString());
	}
	
//	public static void main(String[] args) throws IOException {
//		GameClient client = new GameClient("192.168.1.14",5001);
//		client.consoleDialog();
//	}

	@Override
	public void update(Observable o, Object arg) {
//		System.out.println(score.getScores());
	}
}
