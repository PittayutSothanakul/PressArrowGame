package pressarrowgame;

import java.awt.event.KeyAdapter;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * 
 * @author Pittayut Sothanakul
 * @version 1-5-2018
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

	private ImageView[] imageView;
	// private ImageView imageView[];
	// ArrayList<ImageView> imageView = new ArrayList<ImageView>();
	@FXML
	private Text txtCombo;
	@FXML
	private Text txtScores;
	private Game game;
	private int[] rand = new int[8];
	Image myImage1;
	Image myImage2;
	Image myImage3;
	Image myImage4;
	Image myImage5;
	Image myImage6;
	Image myImage7;
	Image myImage8;
	Image[] myImage = new Image[8];
	private boolean checkPressed1 = true;
	private boolean checkPressed2 = false;
	private boolean checkPressed3 = false;
	private boolean checkPressed4 = false;
	private boolean checkPressed5 = false;
	private boolean checkPressed6 = false;
	private boolean checkPressed7 = false;
	private boolean checkPressed8 = false;

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

	public void keyPressed(KeyEvent e) {
		System.out.println("===========press==========");
		System.out.println("combo = " + combo);
		System.out.println("scores = " + scores);
		String keyPressed = "";
		if (e.getCode() == KeyCode.UP) {
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
		System.out.println(keyPressed);
	}

	private void pressedUp() {
		for (int i = 0; i < imageView.length; i++) {
			if (i == imageView.length - 1 && imageView[i].getId() == "up") {
				combo++;
				scores += 35;
				randArrow();
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
				randArrow();
			}

		}

	}

	public void pressedDown() {
		for (int i = 0; i < imageView.length; i++) {
			if (i == imageView.length - 1 && imageView[i].getId() == "down") {
				combo++;
				scores += 35;
				randArrow();
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
				randArrow();
			}

		}

	}

	public void pressedLeft() {
		for (int i = 0; i < imageView.length; i++) {
			if (i == imageView.length - 1 && imageView[i].getId() == "left") {
				combo++;
				scores += 35;
				randArrow();
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
				randArrow();
			}

		}

	}

	public void pressedRight() {
		for (int i = 0; i < imageView.length; i++) {
			if (i == imageView.length - 1 && imageView[i].getId() == "right") {
				combo++;
				scores += 35;
				randArrow();
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
				randArrow();
			}

		}

	}

	public void randArrow() {
		int rand1 = (int) (Math.random() * 4 + 1);

		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 4 + 1);
			myImage[i] = new Image("images/image" + rand[i] + ".png");
			imageView[i].setVisible(true);
			imageView[i].setImage(myImage[i]);

		}
		setArrow();
		for (int i = 0; i < imageView.length; i++) {
			System.out.println(rand[i]);
			System.out.println(imageView[i].getId());
			System.out.println(checkPressed[i]);
		}
		setCheckPressed();
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