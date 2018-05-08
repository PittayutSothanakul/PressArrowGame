package pressarrowgame;

public class Player {
	private String name;

	private static Player instance = new Player();;

	private Player() {

	}

	public static Player getInstace() {
		return instance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
