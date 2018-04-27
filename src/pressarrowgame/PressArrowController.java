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
 * @version 27-4-2018
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

	// Image imageUp = new Image("/image1.png");
	// Image imageDown = new Image("/image2.png");
	// Image imageLeft = new Image("/image3.png");
	// Image imageRight = new Image("/image4.png");

	public void handle(ActionEvent event) {
		// start.setVisible(false);
		randArrow();
		Game game = new Game();
		// game.start();
		imageView1.setImage(myImage);
		imageView2.setImage(myImage2);
		imageView3.setImage(myImage3);
		imageView4.setImage(myImage4);
		imageView5.setImage(myImage5);
		imageView6.setImage(myImage6);
		imageView7.setImage(myImage7);
		imageView8.setImage(myImage8);
		checkArrow();

	}

	public void keyPressed(KeyEvent e) {

		if (e.getCode() == KeyCode.UP) {

			if (imageView1.getId() == "up") {
				imageView1.setVisible(false);
			}
			if (imageView2.getId() == "up") {
				imageView2.setVisible(false);
			}
			if (imageView3.getId() == "up") {
				imageView3.setVisible(false);
			}
			if (imageView4.getId() == "up") {
				imageView4.setVisible(false);
			}
			if (imageView5.getId() == "up") {
				imageView5.setVisible(false);
			}
			if (imageView6.getId() == "up") {
				imageView6.setVisible(false);
			}
			if (imageView7.getId() == "up") {
				imageView7.setVisible(false);
			}
			if (imageView8.getId() == "up") {
				imageView8.setVisible(false);
			}

		} else if (e.getCode() == KeyCode.DOWN) {
			if (imageView1.getId() == "down") {
				imageView1.setVisible(false);
			}
			if (imageView2.getId() == "down") {
				imageView2.setVisible(false);
			}
			if (imageView3.getId() == "down") {
				imageView3.setVisible(false);
			}
			if (imageView4.getId() == "down") {
				imageView4.setVisible(false);
			}
			if (imageView5.getId() == "down") {
				imageView5.setVisible(false);
			}
			if (imageView6.getId() == "down") {
				imageView6.setVisible(false);
			}
			if (imageView7.getId() == "down") {
				imageView7.setVisible(false);
			}
			if (imageView8.getId() == "down") {
				imageView8.setVisible(false);
			}
		} else if (e.getCode() == KeyCode.LEFT) {
			if (imageView1.getId() == "left") {
				imageView1.setVisible(false);
			}
			if (imageView2.getId() == "left") {
				imageView2.setVisible(false);
			}
			if (imageView3.getId() == "left") {
				imageView3.setVisible(false);
			}
			if (imageView4.getId() == "left") {
				imageView4.setVisible(false);
			}
			if (imageView5.getId() == "left") {
				imageView5.setVisible(false);
			}
			if (imageView6.getId() == "left") {
				imageView6.setVisible(false);
			}
			if (imageView7.getId() == "left") {
				imageView7.setVisible(false);
			}
			if (imageView8.getId() == "left") {
				imageView8.setVisible(false);
			}
		} else if (e.getCode() == KeyCode.RIGHT) {
			if (imageView1.getId() == "right") {
				imageView1.setVisible(false);
			}
			if (imageView2.getId() == "right") {
				imageView2.setVisible(false);
			}
			if (imageView3.getId() == "right") {
				imageView3.setVisible(false);
			}
			if (imageView4.getId() == "right") {
				imageView4.setVisible(false);
			}
			if (imageView5.getId() == "right") {

				imageView5.setVisible(false);
			}
			if (imageView6.getId() == "right") {
				imageView6.setVisible(false);
			}
			if (imageView7.getId() == "right") {
				imageView7.setVisible(false);
			}
			if (imageView8.getId() == "right") {
				imageView8.setVisible(false);
			}
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
	}

	public void checkArrow() {
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
		if (rand == 1) {
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
		
	}

}
