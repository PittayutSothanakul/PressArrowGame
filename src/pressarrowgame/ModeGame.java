package pressarrowgame;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public enum ModeGame {
	EASYMODE("EasyMode.fxml"), HARDMODE("PressArrowGameUi.fxml"), HOME("LoginUI.fxml");
	private String mode;

	private ModeGame(String mode) {
		this.mode = mode;
	}

	public void changeMode(Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource(mode));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}
}
