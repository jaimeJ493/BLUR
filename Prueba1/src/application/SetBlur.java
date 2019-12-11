package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;

public class SetBlur {
@FXML
private Pane forestview;

@FXML
public void initialize() {
	forestview.setEffect(new GaussianBlur(5));
}

}
