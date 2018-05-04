package pressarrowgame;

import java.awt.event.KeyAdapter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * 
 * @author Pittayut Sothanakul
 * @version 4-5-2018
 *
 */
public class PressArrowController extends KeyAdapter {
	@FXML
	private Button start;
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
	private Slider slider;
	@FXML
	private ProgressBar progressBar;
	@FXML
	private ProgressBar progressBar2;
	@FXML
	private ProgressBar progressBar3;

	Task runbar, runbar2, runbar3;
	private ImageView[] imageView;

	@FXML
	private Text txtCombo;
	@FXML
	private Text txtScores;
	private Game game;
	private int[] rand = new int[8];
	Image[] myImage = new Image[8];
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

	private String dash = "";

	private boolean checkPressed[] = { checkPressed1, checkPressed2, checkPressed3, checkPressed4, checkPressed5,
			checkPressed6, checkPressed7, checkPressed8 };
	private boolean stop = false;
	private int combo = 0;
	private int scores = 0;

	// Image imageUp = new Image("/image1.png");
	// Image imageDown = new Image("/image2.png");
	// Image imageLeft = new Image("/image3.png");
	// Image imageRight = new Image("/image4.png");
	public void handle(ActionEvent event) {
		// start.setVisible(false);

		// imageView1.requestFocus();
		// imageView2.requestFocus();
		// imageView3.requestFocus();
		// imageView4.requestFocus();
		// imageView5.requestFocus();
		// imageView6.requestFocus();
		// imageView7.requestFocus();
		// imageView8.requestFocus();
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);

		slider.setMajorTickUnit(10f);
		slider.setBlockIncrement(100f);
		imageView = new ImageView[8];
		imageView[0] = imageView1;
		imageView[1] = imageView2;
		imageView[2] = imageView3;
		imageView[3] = imageView4;
		imageView[4] = imageView5;
		imageView[5] = imageView6;
		imageView[6] = imageView7;
		imageView[7] = imageView8;
		Game game = new Game();

		// game.start();

		randArrow();
		setArrow();
	}

	public Task runBar() {
		return new Task() {
			@Override
			protected Object call() throws Exception {
				// int j = 0;

				for (int i = 0; i < 100; i++) {
					// j++;
					if (i >= 0 && i < 70) {
						// System.out.println(j);
						progressBar.setStyle("-fx-accent: green;");
						dash = "";
					} else if (i >= 80 && i <= 90) {
						// System.out.println(j);
						progressBar.setStyle("-fx-accent: blue;");
						dash = "perfect";
					} else if (i > 90 && i < 99) {
						// System.out.println(j);
						progressBar.setStyle("-fx-accent: red;");
						dash = "good";
					} else if (i >= 99) {
						

					}
					Thread.sleep(22);

					// updateMessage("20 milliseconds");
					updateProgress(i + 1, 100);

				}
				checkThread = true;
				return true;
			}
		};
	}

	public void keyPressed(KeyEvent e) {
		String keyPressed = "";
		if (e.getCode() == KeyCode.SHIFT) {
			System.out.println("@@@@@@@@@@@@@@@@@@@");
			keyPressed = "space";
			pressedSpace();
		} else if (e.getCode() == KeyCode.UP) {
			keyPressed = "up";
			pressedUp();
		} else if (e.getCode() == KeyCode.DOWN) {
			keyPressed = "down";
			pressedDown();
		} else if (e.getCode() == KeyCode.LEFT) {
			keyPressed = "left";
			pressedLeft();
		} else if (e.getCode() == KeyCode.RIGHT) {
			keyPressed = "right";
			pressedRight();
		}
		txtCombo.setText(Integer.toString(combo));
		txtScores.setText(Integer.toString(scores));
		System.out.println("===========press==========");
		System.out.println(keyPressed);
		System.out.println("combo = " + combo);
		System.out.println("scores = " + scores);
	}

	private void pressedUp() {
		for (int i = 0; i < imageView.length; i++) {
			if (checkPressed[i] == true && i == imageView.length - 1 && imageView[i].getId() == "up") {
				imageView[7].setVisible(false);
				checkPressed[i] = false;
				combo++;
				scores += 15;
				checkRun = true;
				System.out.println("Check run UP " + checkRun);
				return;
			} else if (checkPressed[i] == true && imageView[i].getId() == "up") {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				if (i < imageView.length - 1) {
					checkPressed[i + 1] = true;
				}
				combo++;
				scores += 10;
				break;
			} else if (checkPressed[i] == true && imageView[i].getId() != "up") {
				System.out.println("wrong key");
				combo = 0;
				scores -= 25;
				System.out.println("wrong up");
				randArrow();
			}
		}
	}

	public void pressedDown() {
		for (int i = 0; i < imageView.length; i++) {
			if (checkPressed[i] == true && i == imageView.length - 1 && imageView[i].getId() == "down") {
				imageView[7].setVisible(false);
				checkPressed[i] = false;
				combo++;
				scores += 15;
				checkRun = true;
				System.out.println("Check run DOWN " + checkRun);
				return;
			} else if (checkPressed[i] == true && imageView[i].getId() == "down") {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				if (i < imageView.length - 1) {
					checkPressed[i + 1] = true;
				}
				combo++;
				scores += 10;
				break;
			} else if (checkPressed[i] == true && imageView[i].getId() != "down") {
				System.out.println("wrong key");
				combo = 0;
				scores -= 25;
				System.out.println("wrong down");
				randArrow();
			}
		}
	}

	public void pressedLeft() {
		for (int i = 0; i < imageView.length; i++) {
			if (checkPressed[i] == true && i == imageView.length - 1 && imageView[i].getId() == "left") {
				imageView[7].setVisible(false);
				checkPressed[i] = false;
				combo++;
				scores += 15;
				checkRun = true;
				System.out.println("Check run LEFT " + checkRun);
				return;
			} else if (checkPressed[i] == true && imageView[i].getId() == "left") {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				if (i < imageView.length - 1) {
					checkPressed[i + 1] = true;
				}
				combo++;
				scores += 10;
				break;
			} else if (checkPressed[i] == true && imageView[i].getId() != "left") {
				System.out.println("wrong key");
				combo = 0;
				scores -= 25;
				System.out.println("wrong left");
				randArrow();
			}
		}
	}

	public void pressedRight() {
		for (int i = 0; i < imageView.length; i++) {
			if (checkPressed[i] == true && i == imageView.length - 1 && imageView[i].getId() == "right") {
				imageView[7].setVisible(false);
				checkPressed[i] = false;
				combo++;
				scores += 15;
				checkRun = true;
				System.out.println("Check run RIGHT " + checkRun);
				return;
			} else if (checkPressed[i] == true && imageView[i].getId() == "right") {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				if (i < imageView.length - 1) {
					checkPressed[i + 1] = true;
				}
				combo++;
				scores += 10;
				break;
			} else if (checkPressed[i] == true && imageView[i].getId() != "right") {
				System.out.println("wrong key");
				combo = 0;
				scores -= 25;
				System.out.println("wrong right");
				randArrow();
			}
		}
	}

	public void pressedSpace() {
		if (dash.equals("perfect") && checkRun == true) {
			System.out.println("==================Get PERFECT");
			combo++;
			scores += 30;
			randArrow();
		} else if (dash.equals("good") && checkRun == true) {
			System.out.println("Get GOOD");
			combo++;
			scores += 15;
			randArrow();
		} else {
			System.out.println("WORNG SPACE");
			System.out.println("Miss");
			combo = 0;
			scores -= 20;
			randArrow();
		}
	}

	public void randArrow() {
		if (checkThread == true) {
			runbar.cancel();
		}

		checkRun = false;
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 4 + 1);
			myImage[i] = new Image("images/image" + rand[i] + ".png");
			imageView[i].setVisible(true);
			imageView[i].setImage(myImage[i]);
		}
		setArrow();
		setCheckPressed();

		runbar = runBar();
		progressBar.progressProperty().unbind();
		progressBar.setProgress(0);
		progressBar.progressProperty().bind(runbar.progressProperty());
		// runbar.messageProperty().addListener(new ChangeListener<String>() {
		// @Override
		// public void changed(ObservableValue<? extends String> observable,
		// String oldValue, String newValue) {
		// System.out.println(newValue);
		// }
		// });

		new Thread(runbar).start();

	}

	public void setArrow() {

		for (int i = 0; i < rand.length; i++) {
			if (rand[i] == 1) {
				imageView[i].setId("up");
			} else if (rand[i] == 2) {
				imageView[i].setId("down");
			} else if (rand[i] == 3) {
				imageView[i].setId("left");
			} else if (rand[i] == 4) {
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

	}

	public void handleGiveUp(ActionEvent event) {
		randArrow();
	}
}