package pressarrowgame;

import java.net.URL;

import javafx.application.Application;
import javafx.application.Platform;
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
	public Scene hardScene;

	@Override
	public void start(Stage primaryStage) {
		Score score = new Score();
		try {
			// Parent root = (Parent)
			// FXMLLoader.load(getClass().getResource("PressArrowGameUI.fxml"));
			// Scene scene = new Scene(root);

			URL url = getClass().getResource("PressArrowGameUI.fxml");
			if (url == null) {
				System.out.println("Couldn't find file: ClickUI.fxml");
				Platform.exit();
			}
			FXMLLoader loader = new FXMLLoader(url);
			Parent root = loader.load();
			PressArrowController controller = loader.getController();
			controller.setScore(score);
			hardScene = new Scene(root);
			primaryStage.setScene(hardScene);
			primaryStage.sizeToScene();
			primaryStage.show();
			// root.requestFocus();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception creating scene: " + e.getMessage());
		}

		// ScoreView scoreView = new ScoreView(score);
		// score.addObserver(scoreView);
		// scoreView.run();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
