package pressarrowgame;

public abstract class AbstractGame {
	private boolean running = false;

	private Thread gameThread = new Thread() {
		@Override
		public void run() {
			super.run();
			while (running) {
				singleGameLoop();
			}
		}

	};

	public void start() {
		running = true;
		gameThread.start();

	}

	public void end() {
		running = false;
	}

	public boolean isOver() {
		return !running;
	}

	private void singleGameLoop() {
		gameLogic();
		delay();
	}

	private void delay() {
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected abstract void gameLogic();

	protected abstract void handleLeftKey();

	protected abstract void handleRightKey();

	protected abstract void handleUpKey();

	protected abstract void handleDownKey();
}
