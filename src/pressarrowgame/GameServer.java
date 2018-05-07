package pressarrowgame;

import java.io.IOException;

import com.lloseng.ocsf.server.AbstractServer;
import com.lloseng.ocsf.server.ConnectionToClient;

public class GameServer extends AbstractServer {

	public GameServer(int port) {
		super(port);
	}

	@Override
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) {
		super.sendToAllClients(msg);
	}
	
	public static void main(String[] args) throws IOException {
		int port = 5001;
		GameServer server = new GameServer(port);
		server.listen();
		System.out.printf("Listening at port %d",port);
	}

}
