package io.github.suppennudel;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import io.github.suppennudel.config.UserConfig;
import io.github.suppennudel.config.UserConfigKey;
import io.github.suppennudel.config.UserConfigListKey;
import javafx.fxml.Initializable;

public class MainController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		// usage
		String string = UserConfig.getConfig().get(UserConfigKey.EXAMPLE_CONFIG);
		List<String> stringList = UserConfig.getConfig().getList(UserConfigListKey.EXAMPLE_LIST_CONFIG);
	}

}
