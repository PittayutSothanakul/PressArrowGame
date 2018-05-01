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

	@FXML
	private Text txtCombo;
	@FXML
	private Text txtScores;
	private Game game;

	int rand;
	int rand2;
	int rand3;
	int rand4;
	int rand5;
	int rand6;
	int rand7;
	int rand8;

	Image myImage;
	Image myImage2;
	Image myImage3;
	Image myImage4;
	Image myImage5;
	Image myImage6;
	Image myImage7;
	Image myImage8;

	private boolean checkPressed1 = true;
	private boolean checkPressed2 = false;
	private boolean checkPressed3 = false;
	private boolean checkPressed4 = false;
	private boolean checkPressed5 = false;
	private boolean checkPressed6 = false;
	private boolean checkPressed7 = false;
	private boolean checkPressed8 = false;
	private String checkPressed = "";
	private boolean stop = false;
	private int combo = 0;
	private int scores = 0;

	// Image imageUp = new Image("/image1.png");
	// Image imageDown = new Image("/image2.png");
	// Image imageLeft = new Image("/image3.png");
	// Image imageRight = new Image("/image4.png");

	public void handle(ActionEvent event) {
		start.setVisible(false);
		randArrow();
		Game game = new Game();
		// game.start();
		System.out.println("set");
		setArrow();

	}

	public void keyPressed(KeyEvent e) {
		System.out.println("===========press==========");
		System.out.println("combo = " + combo);
		System.out.println("scores = " + scores);

		if (e.getCode() == KeyCode.UP) {
			checkPressed = "up";
			pressedUp();

		} else if (e.getCode() == KeyCode.DOWN) {
			checkPressed = "down";
			pressedDown();
		} else if (e.getCode() == KeyCode.LEFT) {
			checkPressed = "left";
			pressedLeft();
		} else if (e.getCode() == KeyCode.RIGHT) {
			checkPressed = "right";
			pressedRight();
		}
		txtCombo.setText(Integer.toString(combo));
		txtScores.setText(Integer.toString(scores));
		System.out.println(checkPressed);
	}

	private void pressedUp() {
		if (checkPressed1 == true && imageView1.getId() == "up") {
			imageView1.setVisible(false);
			checkPressed1 = false;
			checkPressed2 = true;
			combo++;
			scores += 10;
		} else if (checkPressed2 == true && imageView2.getId() == "up") {
			imageView2.setVisible(false);
			checkPressed2 = false;
			checkPressed3 = true;
			combo++;
			scores += 10;
		} else if (checkPressed3 == true && imageView3.getId() == "up") {
			imageView3.setVisible(false);
			checkPressed3 = false;
			checkPressed4 = true;
			combo++;
			scores += 10;
		} else if (checkPressed4 == true && imageView4.getId() == "up") {
			imageView4.setVisible(false);
			checkPressed4 = false;
			checkPressed5 = true;
			combo++;
			scores += 10;
		} else if (checkPressed5 == true && imageView5.getId() == "up") {
			imageView5.setVisible(false);
			checkPressed5 = false;
			checkPressed6 = true;
			combo++;
			scores += 10;
		} else if (checkPressed6 == true && imageView6.getId() == "up") {
			imageView6.setVisible(false);
			checkPressed6 = false;
			checkPressed7 = true;
			combo++;
			scores += 10;
		} else if (checkPressed7 == true && imageView7.getId() == "up") {
			imageView7.setVisible(false);
			checkPressed7 = false;
			checkPressed8 = true;
			combo++;
			scores += 10;
		} else if (checkPressed8 == true && imageView8.getId() == "up") {
			imageView8.setVisible(false);
			checkPressed8 = false;
			checkPressed1 = true;
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

	public void pressedDown() {
		if (checkPressed1 == true && imageView1.getId() == "down") {
			imageView1.setVisible(false);
			checkPressed1 = false;
			checkPressed2 = true;
			combo++;
			scores += 10;
		} else if (checkPressed2 == true && imageView2.getId() == "down") {
			imageView2.setVisible(false);
			checkPressed2 = false;
			checkPressed3 = true;
			combo++;
			scores += 10;
		} else if (checkPressed3 == true && imageView3.getId() == "down") {
			imageView3.setVisible(false);
			checkPressed3 = false;
			checkPressed4 = true;
			combo++;
			scores += 10;
		} else if (checkPressed4 == true && imageView4.getId() == "down") {
			imageView4.setVisible(false);
			checkPressed4 = false;
			checkPressed5 = true;
			combo++;
			scores += 10;
		} else if (checkPressed5 == true && imageView5.getId() == "down") {
			imageView5.setVisible(false);
			checkPressed5 = false;
			checkPressed6 = true;
			combo++;
			scores += 10;
		} else if (checkPressed6 == true && imageView6.getId() == "down") {
			imageView6.setVisible(false);
			checkPressed6 = false;
			checkPressed7 = true;
			combo++;
			scores += 10;
		} else if (checkPressed7 == true && imageView7.getId() == "down") {
			imageView7.setVisible(false);
			checkPressed7 = false;
			checkPressed8 = true;
			combo++;
			scores += 10;
		} else if (checkPressed8 == true && imageView8.getId() == "down") {
			imageView8.setVisible(false);
			checkPressed8 = false;
			checkPressed1 = true;
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

	public void pressedLeft() {
		if (checkPressed1 == true && imageView1.getId() == "left") {
			imageView1.setVisible(false);
			checkPressed1 = false;
			checkPressed2 = true;
			combo++;
			scores += 10;
		} else if (checkPressed2 == true && imageView2.getId() == "left") {
			imageView2.setVisible(false);
			checkPressed2 = false;
			checkPressed3 = true;
			combo++;
			scores += 10;
		} else if (checkPressed3 == true && imageView3.getId() == "left") {
			imageView3.setVisible(false);
			checkPressed3 = false;
			checkPressed4 = true;
			combo++;
			scores += 10;
		} else if (checkPressed4 == true && imageView4.getId() == "left") {
			imageView4.setVisible(false);
			checkPressed4 = false;
			checkPressed5 = true;
			combo++;
			scores += 10;
		} else if (checkPressed5 == true && imageView5.getId() == "left") {
			imageView5.setVisible(false);
			checkPressed5 = false;
			checkPressed6 = true;
			combo++;
			scores += 10;
		} else if (checkPressed6 == true && imageView6.getId() == "left") {
			imageView6.setVisible(false);
			checkPressed6 = false;
			checkPressed7 = true;
			combo++;
			scores += 10;
		} else if (checkPressed7 == true && imageView7.getId() == "left") {
			imageView7.setVisible(false);
			checkPressed7 = false;
			checkPressed8 = true;
			combo++;
			scores += 10;
		} else if (checkPressed8 == true && imageView8.getId() == "left") {
			imageView8.setVisible(false);
			checkPressed8 = false;
			checkPressed1 = true;
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

	public void pressedRight() {
		if (checkPressed1 == true && imageView1.getId() == "right") {
			imageView1.setVisible(false);
			checkPressed1 = false;
			checkPressed2 = true;
			combo++;
			scores += 10;
		} else if (checkPressed2 == true && imageView2.getId() == "right") {
			imageView2.setVisible(false);
			checkPressed2 = false;
			checkPressed3 = true;
			combo++;
			scores += 10;
		} else if (checkPressed3 == true && imageView3.getId() == "right") {
			imageView3.setVisible(false);
			checkPressed3 = false;
			checkPressed4 = true;
			combo++;
			scores += 10;
		} else if (checkPressed4 == true && imageView4.getId() == "right") {
			imageView4.setVisible(false);
			checkPressed4 = false;
			checkPressed5 = true;
			combo++;
			scores += 10;
		} else if (checkPressed5 == true && imageView5.getId() == "right") {
			imageView5.setVisible(false);
			checkPressed5 = false;
			checkPressed6 = true;
			combo++;
			scores += 10;
		} else if (checkPressed6 == true && imageView6.getId() == "right") {
			imageView6.setVisible(false);
			checkPressed6 = false;
			checkPressed7 = true;
			combo++;
			scores += 10;
		} else if (checkPressed7 == true && imageView7.getId() == "right") {
			imageView7.setVisible(false);
			checkPressed7 = false;
			checkPressed8 = true;
			combo++;
			scores += 10;
		} else if (checkPressed8 == true && imageView8.getId() == "right") {
			imageView8.setVisible(false);
			checkPressed8 = false;
			checkPressed1 = true;
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

	public void randArrow() {
		rand = (int) (Math.random() * 4 + 1);
		rand2 = (int) (Math.random() * 4 + 1);
		rand3 = (int) (Math.random() * 4 + 1);
		rand4 = (int) (Math.random() * 4 + 1);
		rand5 = (int) (Math.random() * 4 + 1);
		rand6 = (int) (Math.random() * 4 + 1);
		rand7 = (int) (Math.random() * 4 + 1);
		rand8 = (int) (Math.random() * 4 + 1);

		myImage = new Image("/image" + rand + ".png");
		imageView1.setVisible(true);
		myImage2 = new Image("/image" + rand2 + ".png");
		imageView2.setVisible(true);
		myImage3 = new Image("/image" + rand3 + ".png");
		imageView3.setVisible(true);
		myImage4 = new Image("/image" + rand4 + ".png");
		imageView4.setVisible(true);
		myImage5 = new Image("/image" + rand5 + ".png");
		imageView5.setVisible(true);
		myImage6 = new Image("/image" + rand6 + ".png");
		imageView6.setVisible(true);
		myImage7 = new Image("/image" + rand7 + ".png");
		imageView7.setVisible(true);
		myImage8 = new Image("/image" + rand8 + ".png");
		imageView8.setVisible(true);

		imageView1.setImage(myImage);
		imageView2.setImage(myImage2);
		imageView3.setImage(myImage3);
		imageView4.setImage(myImage4);
		imageView5.setImage(myImage5);
		imageView6.setImage(myImage6);
		imageView7.setImage(myImage7);
		imageView8.setImage(myImage8);

		checkPressed1 = true;
		checkPressed2 = false;
		checkPressed3 = false;
		checkPressed4 = false;
		checkPressed5 = false;
		checkPressed6 = false;
		checkPressed7 = false;
		checkPressed8 = false;
		checkPressed = "";

		setArrow();
	}

	public void setArrow() {
		if (rand == 1) {
			imageView1.setId("up");
		} else if (rand == 2) {
			imageView1.setId("down");
		} else if (rand == 3) {
			imageView1.setId("left");
		} else if (rand == 4) {
			imageView1.setId("right");
		}

		if (rand2 == 1) {
			imageView2.setId("up");
		} else if (rand2 == 2) {
			imageView2.setId("down");
		} else if (rand2 == 3) {
			imageView2.setId("left");
		} else if (rand2 == 4) {
			imageView2.setId("right");
		}

		if (rand3 == 1) {
			imageView3.setId("up");
		} else if (rand3 == 2) {
			imageView3.setId("down");
		} else if (rand3 == 3) {
			imageView3.setId("left");
		} else if (rand3 == 4) {
			imageView3.setId("right");
		}

		if (rand4 == 1) {
			imageView4.setId("up");
		} else if (rand4 == 2) {
			imageView4.setId("down");
		} else if (rand4 == 3) {
			imageView4.setId("left");
		} else if (rand4 == 4) {
			imageView4.setId("right");
		}

		if (rand5 == 1) {
			imageView5.setId("up");
		} else if (rand5 == 2) {
			imageView5.setId("down");
		} else if (rand5 == 3) {
			imageView5.setId("left");
		} else if (rand5 == 4) {
			imageView5.setId("right");
		}

		if (rand6 == 1) {
			imageView6.setId("up");
		} else if (rand6 == 2) {
			imageView6.setId("down");
		} else if (rand6 == 3) {
			imageView6.setId("left");
		} else if (rand6 == 4) {
			imageView6.setId("right");
		}

		if (rand7 == 1) {
			imageView7.setId("up");
		} else if (rand7 == 2) {
			imageView7.setId("down");
		} else if (rand7 == 3) {
			imageView7.setId("left");
		} else if (rand7 == 4) {
			imageView7.setId("right");
		}

		if (rand8 == 1) {
			imageView8.setId("up");
		} else if (rand8 == 2) {
			imageView8.setId("down");
		} else if (rand8 == 3) {
			imageView8.setId("left");
		} else if (rand8 == 4) {
			imageView8.setId("right");
		}

	}

	public void handleGiveUp(ActionEvent event) {
		randArrow();
		System.out.println(rand);
		System.out.println(rand2);
	}

}