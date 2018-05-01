package pressarrowgame;



public class Game extends AbstractGame {

	private int time = 30;
	private int scores;
	private int combo;


	public Game() {
		System.out.println("GameStart");
		

	}

	public int getTime() {
		return time;
	}

	public int getScores() {
		return scores;
	}

	@Override
	protected void handleLeftKey() {
		System.out.println("Press Up");

	}

	@Override
	protected void handleRightKey() {
		System.out.println("Press Down");

	}

	@Override
	protected void handleUpKey() {
		System.out.println("Press Left");

	}

	@Override
	protected void handleDownKey() {
		System.out.println("Press Right");

	}

	@Override
	protected void gameLogic() {
		System.out.println("Game is running");
		if (time < 0) {
			end();
		}

	}

}
