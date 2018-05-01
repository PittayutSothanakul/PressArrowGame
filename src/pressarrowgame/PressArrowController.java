package pressarrowgame;

import java.awt.event.KeyAdapter;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
	private String stringPressed1 = "";
	private String stringPressed2 = "";
	private String stringPressed3 = "";
	private String stringPressed4 = "";
	private String stringPressed5 = "";
	private String stringPressed6 = "";
	private String stringPressed7 = "";
	private String stringPressed8 = "";
	private boolean stop = false;
	private int score = 0;

	// Image imageUp = new Image("/image1.png");
	// Image imageDown = new Image("/image2.png");
	// Image imageLeft = new Image("/image3.png");
	// Image imageRight = new Image("/image4.png");

	public void handle(ActionEvent event) {
		// start.setVisible(false);
		randArrow();
		Game game = new Game();
		// game.start();
	
		// System.out.println("set1");
		// setArrow1();
		// System.out.println("set1.1");
		// System.out.println(checkPressed1);
		// System.out.println(checkPressed);
		// System.out.println(imageView1.getId());
		System.out.println("set");
		setArrow();

	}

	public void keyPressed(KeyEvent e) {
		System.out.print("===========press==========");
		System.out.println(score);

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
		System.out.println(checkPressed);
	}

	public void pressedUp() {
		// if (checkPressed1 == true && checkPressed.equals("up") &&
		// imageView1.getId() == "up") {
		// imageView1.setVisible(false);
		// checkPressed = "";
		// checkPressed1 = false;
		// checkPressed2 = true;
		// }
		if (checkPressed1 = true && stringPressed1.equals("up") && imageView1.getId() == "up") {
			imageView1.setVisible(false);
			stringPressed1 = "";
			checkPressed1 = false;
			checkPressed2 = true;
			score++;
		}
		if (checkPressed2 = true && stringPressed2.equals("up") && imageView2.getId() == "up") {
			imageView2.setVisible(false);
			stringPressed2 = "";
			checkPressed2 = false;
			checkPressed3 = true;
			score++;
		}
		if (checkPressed3 == true && stringPressed3.equals("up") && imageView3.getId() == "up") {
			imageView3.setVisible(false);
			stringPressed3 = "";
			checkPressed3 = false;
			checkPressed4 = true;
			score++;
		}
		if (checkPressed4 == true && stringPressed4.equals("up") && imageView4.getId() == "up") {
			imageView4.setVisible(false);
			stringPressed4 = "";
			checkPressed4 = false;
			checkPressed5 = true;
			score++;
		}
		if (checkPressed5 == true && stringPressed5.equals("up") && imageView5.getId() == "up") {
			imageView5.setVisible(false);
			stringPressed5 = "";
			checkPressed5 = false;
			checkPressed6 = true;
			score++;
		}
		if (checkPressed6 == true && stringPressed6.equals("up") && imageView6.getId() == "up") {
			imageView6.setVisible(false);
			stringPressed6 = "";
			checkPressed6 = false;
			checkPressed7 = true;
			score++;
		}
		if (checkPressed7 == true && stringPressed7.equals("up") && imageView7.getId() == "up") {
			imageView7.setVisible(false);
			stringPressed7 = "";
			checkPressed7 = false;
			checkPressed8 = true;
			score++;
		}
		if (checkPressed8 == true && stringPressed8.equals("up") && imageView8.getId() == "up") {
			imageView8.setVisible(false);
			stringPressed8 = "";
			checkPressed8 = false;
			checkPressed1 = true;
			score++;
			randArrow();
		}
	}

	public void pressedDown() {
		if (checkPressed1 == true && stringPressed1.equals("down") && imageView1.getId() == "down") {
			imageView1.setVisible(false);
			stringPressed1 = "";
			checkPressed1 = false;
			checkPressed2 = true;
			score++;
		}
		if (checkPressed2 == true && stringPressed2.equals("down") && imageView2.getId() == "down") {
			imageView2.setVisible(false);
			stringPressed2 = "";
			checkPressed2 = false;
			checkPressed3 = true;
			score++;
		}
		if (checkPressed3 == true && stringPressed3.equals("down") && imageView3.getId() == "down") {
			imageView3.setVisible(false);
			stringPressed3 = "";
			checkPressed3 = false;
			checkPressed4 = true;
			score++;
		}
		if (checkPressed4 == true && stringPressed4.equals("down") && imageView4.getId() == "down") {
			imageView4.setVisible(false);
			stringPressed4 = "";
			checkPressed4 = false;
			checkPressed5 = true;
			score++;
		}
		if (checkPressed5 == true && stringPressed5.equals("down") && imageView5.getId() == "down") {
			imageView5.setVisible(false);
			stringPressed5 = "";
			checkPressed5 = false;
			checkPressed6 = true;
			score++;
		}

		if (checkPressed6 == true && stringPressed6.equals("down") && imageView6.getId() == "down") {
			imageView6.setVisible(false);
			stringPressed6 = "";
			checkPressed6 = false;
			checkPressed7 = true;
			score++;
		}
		if (checkPressed7 == true && stringPressed7.equals("down") && imageView7.getId() == "down") {
			imageView7.setVisible(false);
			stringPressed7 = "";
			checkPressed7 = false;
			checkPressed8 = true;
			score++;
		}
		if (checkPressed8 == true && stringPressed8.equals("down") && imageView8.getId() == "down") {
			imageView8.setVisible(false);
			stringPressed8 = "";
			checkPressed8 = false;
			checkPressed1 = true;
			score++;
			randArrow();
		}

	}

	public void pressedLeft() {
		if (checkPressed1 == true && stringPressed1.equals("left") && imageView1.getId() == "left") {
			imageView1.setVisible(false);
			stringPressed1 = "";
			checkPressed1 = false;
			checkPressed2 = true;
			score++;
		}
		if (checkPressed2 == true && stringPressed2.equals("left") && imageView2.getId() == "left") {
			imageView2.setVisible(false);
			stringPressed2 = "";
			checkPressed2 = false;
			checkPressed3 = true;
			score++;
		}
		if (checkPressed3 == true && stringPressed3.equals("left") && imageView3.getId() == "left") {
			imageView3.setVisible(false);
			stringPressed3 = "";
			checkPressed3 = false;
			checkPressed4 = true;
			score++;
		}
		if (checkPressed4 == true && stringPressed4.equals("left") && imageView4.getId() == "left") {
			imageView4.setVisible(false);
			stringPressed4 = "";
			checkPressed4 = false;
			checkPressed5 = true;
			score++;
		}
		if (checkPressed5 == true && stringPressed5.equals("left") && imageView5.getId() == "left") {
			imageView5.setVisible(false);
			stringPressed5 = "";
			checkPressed5 = false;
			checkPressed6 = true;
			score++;
		}

		if (checkPressed6 == true && stringPressed6.equals("left") && imageView6.getId() == "left") {
			imageView6.setVisible(false);
			stringPressed6 = "";
			checkPressed6 = false;
			checkPressed7 = true;
			score++;
		}
		if (checkPressed7 == true && stringPressed7.equals("left") && imageView7.getId() == "left") {
			imageView7.setVisible(false);
			stringPressed7 = "";
			checkPressed7 = false;
			checkPressed8 = true;
			score++;
		}
		if (checkPressed8 == true && stringPressed8.equals("left") && imageView8.getId() == "left") {
			imageView8.setVisible(false);
			stringPressed8 = "";
			checkPressed8 = false;
			checkPressed1 = true;
			score++;
			randArrow();
		}
	}

	public void pressedRight() {
		if (checkPressed1 == true && stringPressed1.equals("right") && imageView1.getId() == "right") {
			imageView1.setVisible(false);
			stringPressed1 = "";
			checkPressed1 = false;
			checkPressed2 = true;
			score++;
		}
		if (checkPressed2 == true && stringPressed2.equals("right") && imageView2.getId() == "right") {
			imageView2.setVisible(false);
			stringPressed2 = "";
			checkPressed2 = false;
			checkPressed3 = true;
			score++;
		}
		if (checkPressed3 == true && stringPressed3.equals("right") && imageView3.getId() == "right") {
			imageView3.setVisible(false);
			stringPressed3 = "";
			checkPressed3 = false;
			checkPressed4 = true;
			score++;
		}
		if (checkPressed4 == true && stringPressed4.equals("right") && imageView4.getId() == "right") {
			imageView4.setVisible(false);
			stringPressed4 = "";
			checkPressed4 = false;
			checkPressed5 = true;
			score++;
		}
		if (checkPressed5 == true && stringPressed5.equals("right") && imageView5.getId() == "right") {
			imageView5.setVisible(false);
			stringPressed5 = "";
			checkPressed5 = false;
			checkPressed6 = true;
			score++;
		}

		if (checkPressed6 == true && stringPressed6.equals("right") && imageView6.getId() == "right") {
			imageView6.setVisible(false);
			stringPressed6 = "";
			checkPressed6 = false;
			checkPressed7 = true;
			score++;
		}
		if (checkPressed7 == true && stringPressed7.equals("right") && imageView7.getId() == "right") {
			imageView7.setVisible(false);
			stringPressed7 = "";
			checkPressed7 = false;
			checkPressed8 = true;
			score++;
		}
		if (checkPressed8 == true && stringPressed8.equals("right") && imageView8.getId() == "right") {
			imageView8.setVisible(false);
			stringPressed8 = "";
			checkPressed8 = false;
			checkPressed1 = true;
			score++;
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
		stringPressed1 = "";
		stringPressed2 = "";
		stringPressed3 = "";
		stringPressed4 = "";
		stringPressed5 = "";
		stringPressed6 = "";
		stringPressed7 = "";
		stringPressed8 = "";
		setArrow();
	}

	public void setArrow1() {
		if (rand == 1) {
			imageView1.setId("up");
			checkPressed = "up";
		} else if (rand == 2) {
			imageView1.setId("down");
			checkPressed = "down";
		} else if (rand == 3) {
			imageView1.setId("left");
			checkPressed = "left";
		} else if (rand == 4) {
			imageView1.setId("right");
			checkPressed = "right";
		}

	}

	public void setArrow2() {
		if (rand2 == 1) {
			imageView2.setId("up");
			checkPressed = "up";
		} else if (rand2 == 2) {
			imageView2.setId("down");
			checkPressed = "down";
		} else if (rand2 == 3) {
			imageView2.setId("left");
			checkPressed = "left";
		} else if (rand2 == 4) {
			imageView2.setId("right");
			checkPressed = "right";
		}

	}

	public void setArrow() {
		if (rand == 1) {
			imageView1.setId("up");
			stringPressed1 = "up";
		} else if (rand == 2) {
			imageView1.setId("down");
			stringPressed1 = "down";
		} else if (rand == 3) {
			imageView1.setId("left");
			stringPressed1 = "left";
		} else if (rand == 4) {
			imageView1.setId("right");
			stringPressed1 = "right";
		}

		if (rand2 == 1) {
			imageView2.setId("up");
			stringPressed2 = "up";
		} else if (rand2 == 2) {
			imageView2.setId("down");
			stringPressed2 = "down";
		} else if (rand2 == 3) {
			imageView2.setId("left");
			stringPressed2 = "left";
		} else if (rand2 == 4) {
			imageView2.setId("right");
			stringPressed2 = "right";
		}

		if (rand3 == 1) {
			imageView3.setId("up");
			stringPressed3 = "up";
		} else if (rand3 == 2) {
			imageView3.setId("down");
			stringPressed3 = "down";
		} else if (rand3 == 3) {
			imageView3.setId("left");
			stringPressed3 = "left";
		} else if (rand3 == 4) {
			imageView3.setId("right");
			stringPressed3 = "right";
		}

		if (rand4 == 1) {
			imageView4.setId("up");
			stringPressed4 = "up";
		} else if (rand4 == 2) {
			imageView4.setId("down");
			stringPressed4 = "down";
		} else if (rand4 == 3) {
			imageView4.setId("left");
			stringPressed4 = "left";
		} else if (rand4 == 4) {
			imageView4.setId("right");
			stringPressed4 = "right";
		}

		if (rand5 == 1) {
			imageView5.setId("up");
			stringPressed5 = "up";
		} else if (rand5 == 2) {
			imageView5.setId("down");
			stringPressed5 = "down";
		} else if (rand5 == 3) {
			imageView5.setId("left");
			stringPressed5 = "left";
		} else if (rand5 == 4) {
			imageView5.setId("right");
			stringPressed5 = "right";
		}

		if (rand6 == 1) {
			imageView6.setId("up");
			stringPressed6 = "up";
		} else if (rand6 == 2) {
			imageView6.setId("down");
			stringPressed6 = "down";
		} else if (rand6 == 3) {
			imageView6.setId("left");
			stringPressed6 = "left";
		} else if (rand6 == 4) {
			imageView6.setId("right");
			stringPressed6 = "right";
		}

		if (rand7 == 1) {
			imageView7.setId("up");
			stringPressed7 = "up";
		} else if (rand7 == 2) {
			imageView7.setId("down");
			stringPressed7 = "down";
		} else if (rand7 == 3) {
			imageView7.setId("left");
			stringPressed7 = "left";
		} else if (rand7 == 4) {
			imageView7.setId("right");
			stringPressed7 = "right";
		}

		if (rand8 == 1) {
			imageView8.setId("up");
			stringPressed8 = "up";
		} else if (rand8 == 2) {
			imageView8.setId("down");
			stringPressed8 = "down";
		} else if (rand8 == 3) {
			imageView8.setId("left");
			stringPressed8 = "left";
		} else if (rand8 == 4) {
			imageView8.setId("right");
			stringPressed8 = "right";
		}

	}

	public void handleGiveUp(ActionEvent event) {
		randArrow();
		System.out.println(rand);
		System.out.println(rand2);
	}

}