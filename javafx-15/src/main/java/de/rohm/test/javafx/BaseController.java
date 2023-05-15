package de.rohm.test.javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BaseController implements Initializable {

	@FXML
	private AnchorPane anchorPane;
	@FXML
	private SplitPane splitPane;
	@FXML
	private ImageView imgView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		imgView.setImage(new Image(getClass().getResourceAsStream("high.png")));

//		pane.boundsInLocalProperty().addListener((ChangeListener<Bounds>) (observable, oldValue, newValue) -> {
//			System.out.println(newValue.getWidth());
//			System.out.println(newValue.getHeight());
//			imgView.setFitWidth(newValue.getWidth());
//			imgView.setFitHeight(newValue.getHeight());
//		});
//
//		pane.boundsInParentProperty().addListener((ChangeListener<Bounds>) (observable, oldValue, newValue) -> {
//			System.out.println(newValue);
//		});
		splitPane.getDividers().get(0).positionProperty().addListener((ChangeListener<Number>) (observable, oldValue, newValue) -> {
			System.out.println(newValue);
		});

//		imgView.fitHeightProperty().bind(anchorPane.heightProperty());
//		imgView.fitWidthProperty().bind(anchorPane.widthProperty());
	}

}
