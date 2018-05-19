package pressarrowgame;



public class Game extends AbstractGame {

	private int time = 30;
	private int scores;
	private int combo;


	public Game() {
		
	}

	public int getTime() {
		return time;
	}

	public int getScores() {
		return scores;
	}

	@Override
	protected void handleLeftKey() {

	}

	@Override
	protected void handleRightKey() {

	}

	@Override
	protected void handleUpKey() {

	}

	@Override
	protected void handleDownKey() {

	}

	@Override
	protected void gameLogic() {
		if (time < 0) {
			end();
		}

	}

}
