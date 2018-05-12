package pressarrowgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
	@FXML
	private CheckBox cbHint;

	Player player;
	Mode mode;
	Scene scene1, scene2;
	Stage thestage;

	private boolean checkName = false;

	public void start(Stage primaryStage) {
		thestage = primaryStage;
	}

	public void handleEnter(ActionEvent event) {
		player = Player.getInstace();
		mode = Mode.getInstace();

		String text = nameField.getText().trim();
		if (!nameField.getText().isEmpty()) {
			txtHint.setText("Hello " + text);
			player.setName(text);

			nameField.setStyle("-fx-text-box-border: blue;");
			System.out.println(player.getName());
			checkName = true;
		} else {
			nameField.setText("");
			nameField.setStyle("-fx-text-box-border: red;");
			txtHint.setText("Please input your name");
			checkName = false;
		}
	}

	public void easyClicked(ActionEvent e) {
		if (!nameField.getText().isEmpty() && checkName == true) {
			try {
				mode.setMode("Easy Mode");
				thestage = (Stage) txtHint.getScene().getWindow();
				PressArrowController easyController = new PressArrowController();
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PressArrowGameUI.fxml"));
				fxmlLoader.setController(easyController);
				Parent root = fxmlLoader.load();
				Scene scene = new Scene(root);
				thestage.setScene(scene);
				if (cbHint.isSelected()) {
					hintBox();
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} else {
			nameField.setStyle("-fx-text-box-border: red;");
			txtHint.setText("Please fill name and clicked enter");
		}
	}

	public void hardClicked(ActionEvent e) {
		if (!nameField.getText().isEmpty() && checkName == true) {
			try {
				mode.setMode("Hard Mode");
				thestage = (Stage) txtHint.getScene().getWindow();
				HardController hardController = new HardController();
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PressArrowGameUI.fxml"));
				fxmlLoader.setController(hardController);
				Parent root = fxmlLoader.load();
				Scene scene = new Scene(root);
				thestage.setScene(scene);
				if (cbHint.isSelected()) {
					hintBoxHard();
				}
				// thestage.setAlwaysOnTop(true);

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} else {
			nameField.setStyle("-fx-text-box-border: red;");
			txtHint.setText("Please fill name and clicked enter");
		}
	}

	public void hintBox() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Hint !!");
		alert.setHeaderText(null);
		alert.setContentText(
				"Pressed keys following the Arrow and\nPressed Shift then gage is running to Perfect to get Extra Score");
		alert.show();
	}

	public void hintBoxHard() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Hint !!");
		alert.setHeaderText(null);
		alert.setContentText(
				"Pressed keys following the Arrow and\nPressed Shift then gage is running to Perfect to get Extra Score\n====The RedArrow is reverse! direction keys====");
		alert.show();
	}
}
