package pressarrowgame;

import java.util.Observable;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ScoreView implements java.util.Observer {
	/** the stage (top-level window) for showing scene */
	private Stage stage;
	/** a counter to show value of */
	private Score score;
	/** the label that shows the counter value. */
	private Label label;
	Player player;
	Mode mode;

	public ScoreView(Score score) {
		this.score = score;
		initComponents();
	}

	private void initComponents() {
		stage = new Stage();
		// components and containers for our window
		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.setAlignment(Pos.CENTER);
		// The label that will show the counter value.
		label = new Label("   ");
		// make the label big enough
		label.setPrefWidth(200);
		label.setPrefHeight(200);
		// TODO Make the text BIG. Use setFont to create a font.
		// TODO Be careful to import the correct Font class (not java.awt.Font).
		label.setFont(new Font("Arial", 17.0));
		// TODO Set the text alignment to CENTER
		label.setAlignment(Pos.CENTER);
		// Add the label to the HBox. You can all more components, too.
		root.getChildren().add(label);
		// Create a Scene using HBox as the root element
		Scene scene = new Scene(root);
		// show the scene on the stage
		stage.setScene(scene);
		stage.setTitle("Score");
		stage.sizeToScene();
	}

	/** Show the window and update the counter value. */
	public void run() {
		stage.show();
		displayCount();
	}

	public void displayCount() {
		mode = Mode.getInstace();
		player = Player.getInstace();
		label.setText(String.format(
				"=== %s ===\nPlayer : %s\nScores : %2d\nMax Combo : %2d\nCombo : %2d\nPerfect : %2d\nGood : %2d\nMiss : %2d ",
				mode.getMode(), player.getName(), score.getScores(), score.getMaxCombo(), score.getCombo(),
				score.getPerfect(), score.getGood(), score.getMiss()));
	}

	@Override
	public void update(Observable o, Object arg) {
		displayCount();
	}
}
