package pressarrowgame;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * 
 * @author Pittayut Sothanakul
 * @version 12-5-2018
 *
 */
public class HardController {
	@FXML
	private Button start;
	@FXML
	private Button giveup;
	@FXML
	private ImageView imageView1;
	@FXML
	private ImageView imageView2;
	@FXML
	private ImageView imageView3;
	@FXML
	private ImageView imageView4;
	@FXML
	private ImageView imageView5;
	@FXML
	private ImageView imageView6;
	@FXML
	private ImageView imageView7;
	@FXML
	private ImageView imageView8;
	@FXML
	private Label keyword;
	@FXML
	private Label timeLabel;
	@FXML
	private Label mode;
	@FXML
	private Slider slider;
	@FXML
	private ProgressBar progressBar;
	@FXML
	private ProgressBar progressBar2;
	@FXML
	private ProgressBar progressBar3;
	@FXML
	private AnchorPane aPane;
	@FXML
	private Text txtCombo;
	@FXML
	private Text txtScores;

	private int[] rand;
	// private int[] rand = new int[8];
	private ImageView[] imageView;
	Image[] myImage = new Image[8];
	Task runbar;
	private boolean checkPressed1 = true;
	private boolean checkPressed2 = false;
	private boolean checkPressed3 = false;
	private boolean checkPressed4 = false;
	private boolean checkPressed5 = false;
	private boolean checkPressed6 = false;
	private boolean checkPressed7 = false;
	private boolean checkPressed8 = false;
	private boolean checkRun;
	private boolean checkThread = false;
	private boolean stop = false;
	private boolean checkPressed[] = { checkPressed1, checkPressed2, checkPressed3, checkPressed4, checkPressed5,
			checkPressed6, checkPressed7, checkPressed8 };
	private boolean checkGameisRun = false;
	private String dash = "";
	private String checkKey = "";
	private int combo = 0;
	private int scores = 0;
	private int countPerfect = 0;
	private int countGood = 0;
	private int countMiss = 0;
	private int maxCombo = 0;
	private Score score = new Score();
	private Game game;

	private static final Integer STARTTIME = 60;
	private Timeline timeline;
	private Integer timeSeconds = STARTTIME;
	ScoreView scoreView;
	// Image imageUp = new Image("/image1.png");
	// Image imageDown = new Image("/image2.png");
	// Image imageLeft = new Image("/image3.png");
	// Image imageRight = new Image("/image4.png");
	Score Score = new Score();

	@FXML
	public void initialize() {
		scoreView = new ScoreView(score);
		// score.addObserver(scoreView);
		scoreView.run();
		timeline = new Timeline();
		mode.setText("Easy Mode");
		imageView = new ImageView[8];
		imageView[0] = imageView1;
		imageView[1] = imageView2;
		imageView[2] = imageView3;
		imageView[3] = imageView4;
		imageView[4] = imageView5;
		imageView[5] = imageView6;
		imageView[6] = imageView7;
		imageView[7] = imageView8;
		System.out.println(checkGameisRun);
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public void doTime() {
		timeSeconds = STARTTIME;
		timeLabel.setText(timeSeconds.toString());
		if (timeline != null) {
			timeline.stop();
		}
		timeline.setCycleCount(Timeline.INDEFINITE);
		KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				timeSeconds--;
				timeLabel.setText(timeSeconds.toString());
				if (timeSeconds <= 0) {
					stop = true;
					timeline.stop();
					aPane.setDisable(true);
					endGame();
					keyword.setText("==ENDGAME==");
					System.out.println("======ENDGAME======");
				}
			}
		});
		timeline.getKeyFrames().add(frame);
		timeline.playFromStart();

	}

	public void handle(ActionEvent event) {
		score.addObserver(scoreView);
		checkGameisRun = true;
		System.out.println("handle : " + checkGameisRun);
		start.setVisible(false);
		Player player = Player.getInstace();
		System.out.println("Hello " + player.getName());
		doTime();
		keyword.setText("Press the Arrow");

		// ScoreView scoreView = new ScoreView(score);
		// score.addObserver(scoreView);
		// scoreView.run();

		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(10f);
		slider.setBlockIncrement(100f);
		Game game = new Game();
		// game.start();
		randArrow();
		setArrow();
	}

	public Task runBar() {
		return new Task() {
			@Override
			protected Object call() throws Exception {
				for (int i = 0; i < 100; i++) {
					if (i >= 0 && i < 70) {
						progressBar.setStyle("-fx-accent: green;");
						dash = "";
					} else if (i >= 80 && i <= 90) {
						progressBar.setStyle("-fx-accent: blue;");
						dash = "perfect";
					} else if (i > 90 && i < 99) {
						progressBar.setStyle("-fx-accent: red;");
						dash = "good";
					} else if (i >= 99) {
						System.out.println("It over Bonus");
						progressBar.setStyle("-fx-accent: black;");
						dash = "over";
					}
					Thread.sleep(32);
					// updateMessage("20 milliseconds");
					updateProgress(i + 1, 100);
				}
				checkThread = true;
				return true;
			}
		};
	}

	public void keyPressed(KeyEvent e) {
		if (checkGameisRun == true) {
			if (e.getCode() == KeyCode.SHIFT) {
				pressedSpace();
			} else if (e.getCode() == KeyCode.UP) {
				checkKey = "up";
				// pressedUp();
				pressedKey();
			} else if (e.getCode() == KeyCode.DOWN) {
				checkKey = "down";
				// pressedDown();
				pressedKey();
			} else if (e.getCode() == KeyCode.LEFT) {
				checkKey = "left";
				// pressedLeft();
				pressedKey();
			} else if (e.getCode() == KeyCode.RIGHT) {
				checkKey = "right";
				// pressedRight();
				pressedKey();
			}
		}

		txtCombo.setText(Integer.toString(combo));
		txtScores.setText(Integer.toString(scores));
		System.out.println("===========press==========");
		System.out.println(checkKey);
		System.out.println("combo = " + combo);
		System.out.println("scores = " + scores);
		maxCombo = Math.max(maxCombo, combo);
		score.setMaxCombo(maxCombo);
	}

	private void pressedKey() {
		for (int i = 0; i < rand.length; i++) {
			if (checkPressed[i] == true && i == rand.length - 1 && imageView[i].getId() == checkKey) {
				imageView[rand.length - 1].setVisible(false);
				checkPressed[i] = false;
				combo++;
				score.addCombo(1);
				scores += 15;
				score.addScores(15);
				checkRun = true;
				System.out.println("Check run UP " + checkRun);
				return;
			} else if (checkPressed[i] == true && imageView[i].getId() == checkKey) {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				if (i < rand.length - 1) {
					checkPressed[i + 1] = true;
				}
				if (maxCombo == 0) {
					maxCombo++;
				}
				combo++;
				score.addCombo(1);
				scores += 10;
				score.addScores(10);
				break;
			} else if (checkPressed[i] == true && imageView[i].getId() != checkKey) {
				System.out.println("wrong key");
				combo = 0;
				score.setComboZero();
				countMiss++;
				score.addMiss(1);
				scores -= 25;
				score.addScores(-25);
				System.out.println("wrong up");
				keyword.setText("Miss!!!");
				randArrow();
			}
			if (checkPressed[2] == true) {
				keyword.setText("");
			}
		}
	}

	public void pressedSpace() {
		if (dash.equals("perfect") && checkRun == true) {
			System.out.println("Get PERFECT");
			keyword.setText("****PERFECT****");
			countPerfect++;
			score.addPerfect(1);
			combo++;
			score.addCombo(1);
			scores += 30;
			score.addScores(30);
			randArrow();
		} else if (dash.equals("good") && checkRun == true) {
			System.out.println("Get GOOD");
			keyword.setText("**GooD**");
			countGood++;
			score.addGood(1);
			combo++;
			score.addCombo(1);
			scores += 15;
			score.addScores(15);
			randArrow();
		} else if (dash.equals("over") && checkRun == true) {
			System.out.println("Get over bonus");
			keyword.setText("Time's up to bonus");
			randArrow();
		} else {
			keyword.setText("Miss!!!");
			System.out.println("WORNG SPACE");
			System.out.println("Miss");
			countMiss++;
			score.addMiss(1);
			combo = 0;
			score.setComboZero();
			scores -= 20;
			score.addScores(-20);
			randArrow();
		}
	}

	public void randArrow() {
		System.out.println("***********************");
		System.out.println("combo = " + combo);
		System.out.println("max combo = " + maxCombo);
		System.out.println("perfect = " + countPerfect);
		System.out.println("good = " + countGood);
		System.out.println("miss = " + countMiss);
		System.out.println("***********************");
		try {
			Thread.sleep(22);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (checkThread == true) {
			runbar.cancel();
		}
		checkRun = false;

		if (timeSeconds >= 45 && timeSeconds <= 60) {
			rand = new int[4];
			for (int i = 0; i < rand.length; i++) {
				rand[i] = (int) (Math.random() * 8 + 1);
				myImage[i] = new Image("images/image" + rand[i] + ".png");
				imageView[i].setVisible(true);
				imageView[i].setImage(myImage[i]);
			}
		} else if (timeSeconds >= 20 && timeSeconds < 45) {
			rand = new int[6];
			for (int i = 0; i < rand.length; i++) {
				rand[i] = (int) (Math.random() * 8 + 1);
				myImage[i] = new Image("images/image" + rand[i] + ".png");
				imageView[i].setVisible(true);
				imageView[i].setImage(myImage[i]);
			}
		} else {
			rand = new int[8];
			for (int i = 0; i < rand.length; i++) {
				rand[i] = (int) (Math.random() * 8 + 1);
				myImage[i] = new Image("images/image" + rand[i] + ".png");
				imageView[i].setVisible(true);
				imageView[i].setImage(myImage[i]);
			}
		}
		setArrow();
		setCheckPressed();
		runbar = runBar();
		progressBar.progressProperty().unbind();
		progressBar.setProgress(0);
		progressBar.progressProperty().bind(runbar.progressProperty());

		new Thread(runbar).start();
	}

	public void setArrow() {
		for (int i = 0; i < rand.length; i++) {
			if (rand[i] == 1 || rand[i] == 6) {
				imageView[i].setId("up");
			} else if (rand[i] == 2 || rand[i] == 5) {
				imageView[i].setId("down");
			} else if (rand[i] == 3 || rand[i] == 8) {
				imageView[i].setId("left");
			} else if (rand[i] == 4 || rand[i] == 7) {
				imageView[i].setId("right");
			}
		}
	}

	public void setCheckPressed() {
		checkPressed[0] = true;
		checkPressed[1] = false;
		checkPressed[2] = false;
		checkPressed[3] = false;
		checkPressed[4] = false;
		checkPressed[5] = false;
		checkPressed[6] = false;
		checkPressed[7] = false;
		// checkRun = true;
	}

	public void endGame() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Time's up");
		alert.setHeaderText(null);
		alert.setContentText("Plaese cilck ok");
		// alert.showAndWait();
		alert.show();
		backToHome();

	}

	public void backToHome() {
		ModeGame.HOME.changeMode((Stage) start.getScene().getWindow());
	}

	public void handleGiveUp(ActionEvent event) {
		System.out.println("You giveup");
		timeline.stop();
		aPane.setDisable(true);
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("You giveup");
		alert.setHeaderText(null);
		alert.setContentText("Plaese cilck ok");
		backToHome();
		alert.show();
	}
}