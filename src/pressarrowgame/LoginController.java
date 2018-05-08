package pressarrowgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private Button enterName;
	@FXML
	private TextField nameField;
	@FXML
	private Button easyMode;
	@FXML
	private Button hardMode;
	@FXML
	private Label txtHint;

	Player player = new Player();
	Scene scene1, scene2;
	Stage thestage;

	private boolean checkName = false;

	public void start(Stage primaryStage) {
		thestage = primaryStage;
	}

	public void handleEnter(ActionEvent event) {
		String text = nameField.getText().trim();
		if (!nameField.getText().isEmpty()) {
			txtHint.setText("Hello " + text);
			player.setName(text);
			nameField.setStyle("-fx-text-box-border: blue;");
			checkName = true;
		} else {
			nameField.setText("");
			nameField.setStyle("-fx-text-box-border: red;");
			txtHint.setText("Please input your name");
			checkName = false;
		}
	}

	public void hardClicked(ActionEvent e) {
		if (!nameField.getText().isEmpty() && checkName == true) {
			try {
				thestage = (Stage) txtHint.getScene().getWindow();
				FXMLLoader chooseGameLoader = new FXMLLoader(getClass().getResource("PressArrowGameUI.fxml"));
				Parent chooseGameRoot = chooseGameLoader.load();
				Scene chooseGameScene = new Scene(chooseGameRoot);
				thestage.setScene(chooseGameScene);
				thestage.setAlwaysOnTop(true);
				
				

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} else {
			nameField.setText("");
			nameField.setStyle("-fx-text-box-border: red;");
			txtHint.setText("Please input your name");
		}

	}

}
