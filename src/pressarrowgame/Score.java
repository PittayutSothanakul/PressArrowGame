package pressarrowgame;

public class Score extends java.util.Observable {
	private int combo;
	private int scores;
	private int perfect;
	private int good;
	private int miss;
	private int maxCombo;

	public Score() {
		this.combo = 0;
		this.scores = 0;
		this.perfect = 0;
		this.good = 0;
		this.miss = 0;
		this.maxCombo = 0;
	}

	public void setComboZero() {
		combo = 0;
		setChanged();
		notifyObservers();
	}

	public void addCombo(int addCombo) {
		combo += addCombo;
		setChanged();
		notifyObservers();
	}

	public void addScores(int addScores) {
		scores += addScores;
		setChanged();
		notifyObservers();
	}

	public void addPerfect(int addPerfect) {
		perfect += addPerfect;
		setChanged();
		notifyObservers();
	}

	public void addGood(int addGood) {
		good += addGood;
		setChanged();
		notifyObservers();
	}

	public void addMiss(int addMiss) {
		miss += addMiss;
		setChanged();
		notifyObservers();
	}

	public void setMaxCombo(int max) {
		maxCombo = max;
		setChanged();
		notifyObservers();
	}

	public int getCombo() {
		return combo;
	}

	public int getScores() {
		return scores;
	}

	public int getPerfect() {
		return perfect;
	}

	public int getGood() {
		return good;
	}

	public int getMiss() {
		return miss;
	}

	public int getMaxCombo() {
		return maxCombo;
	}

}
