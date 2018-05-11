package pressarrowgame;

public class Mode {
	private String mode;
	
	private static Mode instance = new Mode();

	private Mode() {

	}

	public static Mode getInstace() {
		return instance;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}
