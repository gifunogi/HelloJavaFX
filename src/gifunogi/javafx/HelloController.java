package gifunogi.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {	
	@FXML
	private Button helloButton;
	@FXML
	private Label helloLabel;
	private int cnt = 0;
	@FXML
	public void onHelloButtonClicked(ActionEvent event) {
		cnt++;
		this.helloLabel.setText("Clicked! : " + cnt);
	}
}

