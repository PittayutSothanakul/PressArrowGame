package pressarrowgame;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

/**
 * Class main to start program.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class Main extends Application {
	@Override

	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("PressArrowGameUI.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.show();
//			root.requestFocus();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
