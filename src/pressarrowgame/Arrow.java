package pressarrowgame;

import javafx.scene.image.Image;

public class Arrow {
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
	
	public Arrow(){
		
	}

}
