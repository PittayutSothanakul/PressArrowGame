package pressarrowgame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

	private Timeline timeline;

	int min = 1;
	int max = 4;
	Random random = new Random();
	int wareSelect = ((int) (random.nextDouble() * 99)) + 1;

	int rand = (int) (Math.random() * 4 + 1);
	int rand2 = (int) (Math.random() * 4 + 1);
	int rand3 = (int) (Math.random() * 4 + 1);
	int rand4 = (int) (Math.random() * 4 + 1);
	int rand5 = (int) (Math.random() * 4 + 1);
	int rand6 = (int) (Math.random() * 4 + 1);
	int rand7 = (int) (Math.random() * 4 + 1);
	int rand8 = (int) (Math.random() * 4 + 1);

	Image myImage = new Image("/image" + rand + ".png");
	Image myImage2 = new Image("/image" + rand2 + ".png");
	Image myImage3 = new Image("/image" + rand3 + ".png");
	Image myImage4 = new Image("/image" + rand4 + ".png");
	Image myImage5 = new Image("/image" + rand5 + ".png");
	Image myImage6 = new Image("/image" + rand6 + ".png");
	Image myImage7 = new Image("/image" + rand7 + ".png");
	Image myImage8 = new Image("/image" + rand8 + ".png");

	// Image imageUp = new Image("/image1.png");
	// Image imageDown = new Image("/image2.png");
	// Image imageLeft = new Image("/image3.png");
	// Image imageRight = new Image("/image4.png");

	// @Override
	// public void keyPressed(KeyEvent e) {
	// super.keyPressed(e);
	// if (e.getKeyCode() == KeyEvent.VK_UP) {
	// System.out.println("1");
	// } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	// System.out.println("2");
	// } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	// System.out.println("3");
	// } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	// System.out.println("4");
	// }
	// }

	public void handle(ActionEvent event) {

		imageView1.setImage(myImage);
		imageView2.setImage(myImage2);
		imageView3.setImage(myImage3);
		imageView4.setImage(myImage4);
		imageView5.setImage(myImage5);
		imageView6.setImage(myImage6);
		imageView7.setImage(myImage7);
		imageView8.setImage(myImage8);

//		scene.setOnKeyPressed( new EventHandler<Event>() {
//
//			@Override
//			public void handle(Event event) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		// imageView1.setImage(new Image("image1.png"));
		// imageView2.setImage(new Image("image3.png"));
		// imageView3.setImage(new Image("image1.png"));
		// imageView4.setImage(new Image("image1.png"));
		// imageView5.setImage(new Image("image4.png"));
		// imageView6.setImage(new Image("image1.png"));
		// imageView7.setImage(new Image("image2.png"));
		// imageView8.setImage(new Image("image3.png"));

	}

	public void handleGiveUp(ActionEvent event) {
		imageView1.setVisible(false);
	}

	// class Controller extends KeyAdapter {
	//
	// }

}
