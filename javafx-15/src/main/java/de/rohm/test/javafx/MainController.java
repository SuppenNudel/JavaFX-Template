package de.rohm.test.javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainController implements Initializable {

	@FXML
	private AnchorPane pane_left;
	@FXML
	private ImageView img_left;

	@FXML
	private AnchorPane pane_right;
	@FXML
	private ImageView img_right;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		img_left.setImage(new Image(getClass().getResourceAsStream("high.png")));
//		img_right.setImage(new Image(getClass().getResourceAsStream("wide.png")));

		img_left.autosize();

//		pane_left.boundsInLocalProperty().addListener((ChangeListener<Bounds>) (observable, oldValue, newValue) -> {
//			System.out.println(newValue.getWidth());
//			System.out.println(newValue.getHeight());
//			img_left.setFitWidth(newValue.getWidth());
//			img_left.setFitHeight(newValue.getHeight());
//		});
	}

}
