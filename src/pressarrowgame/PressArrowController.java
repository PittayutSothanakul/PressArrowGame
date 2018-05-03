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
		start.setVisible(false);
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
			if (checkPressed[i] == true && imageView[i].getId() == "up") {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				checkPressed[i + 1] = true;
				combo++;
				scores += 10;
			} else if (i == imageView.length && imageView[i].getId() == "up") {
				combo++;
				scores += 35;
				randArrow();
			} else {
				System.out.println("wrong key");
				combo = 0;
				scores -= 25;
				randArrow();
			}

		}
		// if (checkPressed1 == true && imageView1.getId() == "up") {
		// imageView1.setVisible(false);
		// checkPressed1 = false;
		// checkPressed2 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed2 == true && imageView2.getId() == "up") {
		// imageView2.setVisible(false);
		// checkPressed2 = false;
		// checkPressed3 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed3 == true && imageView3.getId() == "up") {
		// imageView3.setVisible(false);
		// checkPressed3 = false;
		// checkPressed4 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed4 == true && imageView4.getId() == "up") {
		// imageView4.setVisible(false);
		// checkPressed4 = false;
		// checkPressed5 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed5 == true && imageView5.getId() == "up") {
		// imageView5.setVisible(false);
		// checkPressed5 = false;
		// checkPressed6 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed6 == true && imageView6.getId() == "up") {
		// imageView6.setVisible(false);
		// checkPressed6 = false;
		// checkPressed7 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed7 == true && imageView7.getId() == "up") {
		// imageView7.setVisible(false);
		// checkPressed7 = false;
		// checkPressed8 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed8 == true && imageView8.getId() == "up") {
		// imageView8.setVisible(false);
		// checkPressed8 = false;
		// checkPressed1 = true;
		// combo++;
		// scores += 35;
		// randArrow();
		// } else {
		// System.out.println("wrong key");
		// combo = 0;
		// scores -= 25;
		// randArrow();
		// }
	}

	public void pressedDown() {
		for (int i = 0; i < imageView.length; i++) {
			if (checkPressed[i] == true && imageView[i].getId() == "down") {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				checkPressed[i + 1] = true;
				combo++;
				scores += 10;
			} else if (i == imageView.length && imageView[i].getId() == "down") {
				combo++;
				scores += 35;
				randArrow();
			} else {
				System.out.println("wrong key");
				combo = 0;
				scores -= 25;
				randArrow();
			}

		}
		// if (checkPressed1 == true && imageView1.getId() == "down") {
		// imageView1.setVisible(false);
		// checkPressed1 = false;
		// checkPressed2 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed2 == true && imageView2.getId() == "down") {
		// imageView2.setVisible(false);
		// checkPressed2 = false;
		// checkPressed3 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed3 == true && imageView3.getId() == "down") {
		// imageView3.setVisible(false);
		// checkPressed3 = false;
		// checkPressed4 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed4 == true && imageView4.getId() == "down") {
		// imageView4.setVisible(false);
		// checkPressed4 = false;
		// checkPressed5 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed5 == true && imageView5.getId() == "down") {
		// imageView5.setVisible(false);
		// checkPressed5 = false;
		// checkPressed6 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed6 == true && imageView6.getId() == "down") {
		// imageView6.setVisible(false);
		// checkPressed6 = false;
		// checkPressed7 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed7 == true && imageView7.getId() == "down") {
		// imageView7.setVisible(false);
		// checkPressed7 = false;
		// checkPressed8 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed8 == true && imageView8.getId() == "down") {
		// imageView8.setVisible(false);
		// checkPressed8 = false;
		// checkPressed1 = true;
		// combo++;
		// scores += 35;
		// randArrow();
		// } else {
		// System.out.println("wrong key");
		// combo = 0;
		// scores -= 25;
		// randArrow();
		// }
	}

	public void pressedLeft() {
		for (int i = 0; i < imageView.length; i++) {
			if (checkPressed[i] == true && imageView[i].getId() == "left") {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				checkPressed[i + 1] = true;
				combo++;
				scores += 10;
			} else if (i == imageView.length && imageView[i].getId() == "left") {
				combo++;
				scores += 35;
				randArrow();
			} else {
				System.out.println("wrong key");
				combo = 0;
				scores -= 25;
				randArrow();
			}

		}
		// if (checkPressed1 == true && imageView1.getId() == "left") {
		// imageView1.setVisible(false);
		// checkPressed1 = false;
		// checkPressed2 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed2 == true && imageView2.getId() == "left") {
		// imageView2.setVisible(false);
		// checkPressed2 = false;
		// checkPressed3 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed3 == true && imageView3.getId() == "left") {
		// imageView3.setVisible(false);
		// checkPressed3 = false;
		// checkPressed4 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed4 == true && imageView4.getId() == "left") {
		// imageView4.setVisible(false);
		// checkPressed4 = false;
		// checkPressed5 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed5 == true && imageView5.getId() == "left") {
		// imageView5.setVisible(false);
		// checkPressed5 = false;
		// checkPressed6 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed6 == true && imageView6.getId() == "left") {
		// imageView6.setVisible(false);
		// checkPressed6 = false;
		// checkPressed7 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed7 == true && imageView7.getId() == "left") {
		// imageView7.setVisible(false);
		// checkPressed7 = false;
		// checkPressed8 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed8 == true && imageView8.getId() == "left") {
		// imageView8.setVisible(false);
		// checkPressed8 = false;
		// checkPressed1 = true;
		// combo++;
		// scores += 35;
		// randArrow();
		// } else {
		// System.out.println("wrong key");
		// combo = 0;
		// scores -= 25;
		// randArrow();
		// }
	}

	public void pressedRight() {
		for (int i = 0; i < imageView.length; i++) {
			if (checkPressed[i] == true && imageView[i].getId() == "right") {
				imageView[i].setVisible(false);
				checkPressed[i] = false;
				checkPressed[i + 1] = true;
				combo++;
				scores += 10;
			} else if (i == imageView.length && imageView[i].getId() == "right") {
				combo++;
				scores += 35;
				randArrow();
			} else {
				System.out.println("wrong key");
				combo = 0;
				scores -= 25;
				randArrow();
			}

		}
		// if (checkPressed1 == true && imageView1.getId() == "right") {
		// imageView1.setVisible(false);
		// checkPressed1 = false;
		// checkPressed2 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed2 == true && imageView2.getId() == "right") {
		// imageView2.setVisible(false);
		// checkPressed2 = false;
		// checkPressed3 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed3 == true && imageView3.getId() == "right") {
		// imageView3.setVisible(false);
		// checkPressed3 = false;
		// checkPressed4 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed4 == true && imageView4.getId() == "right") {
		// imageView4.setVisible(false);
		// checkPressed4 = false;
		// checkPressed5 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed5 == true && imageView5.getId() == "right") {
		// imageView5.setVisible(false);
		// checkPressed5 = false;
		// checkPressed6 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed6 == true && imageView6.getId() == "right") {
		// imageView6.setVisible(false);
		// checkPressed6 = false;
		// checkPressed7 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed7 == true && imageView7.getId() == "right") {
		// imageView7.setVisible(false);
		// checkPressed7 = false;
		// checkPressed8 = true;
		// combo++;
		// scores += 10;
		// } else if (checkPressed8 == true && imageView8.getId() == "right") {
		// imageView8.setVisible(false);
		// checkPressed8 = false;
		// checkPressed1 = true;
		// combo++;
		// scores += 35;
		// randArrow();
		// } else {
		// System.out.println("wrong key");
		// combo = 0;
		// scores -= 25;
		// randArrow();
		// }
	}

	public void randArrow() {
		int rand1 = (int) (Math.random() * 4 + 1);

		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 4 + 1);
			myImage[i] = new Image("images/image" + rand[i] + ".png");
			imageView[i].setVisible(true);
			imageView[i].setImage(myImage[i]);

		}

		checkPressed1 = true;
		checkPressed2 = false;
		checkPressed3 = false;
		checkPressed4 = false;
		checkPressed5 = false;
		checkPressed6 = false;
		checkPressed7 = false;
		checkPressed8 = false;

		setArrow();
		for (int i = 0; i < imageView.length; i++) {
			System.out.println(rand[i]);
			System.out.println(imageView[i].getId());
			System.out.println(checkPressed[i]);
		}
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

	public void handleGiveUp(ActionEvent event) {
		randArrow();
	}
}