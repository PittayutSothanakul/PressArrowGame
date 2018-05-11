package pressarrowgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EndController {
	@FXML
	private Button back;
	Stage thestage;

	public void handleEnter(ActionEvent event) {
		try {
			thestage = (Stage) back.getScene().getWindow();
			FXMLLoader chooseGameLoader = new FXMLLoader(getClass().getResource("LoginUI.fxml"));
			Parent chooseGameRoot = chooseGameLoader.load();
			Scene chooseGameScene = new Scene(chooseGameRoot);
			thestage.setScene(chooseGameScene);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
