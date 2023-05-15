package io.github.suppennudel;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

import javafx.fxml.Initializable;

public class MainController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Preferences preferences = Preferences.userNodeForPackage(Launcher.class);
		preferences.addPreferenceChangeListener(evt -> {
			System.out.println(evt.getKey());
			System.out.println(evt.getNewValue());
			System.out.println(evt.getNode());
			System.out.println(evt.getSource());
		});
		System.out.println(preferences.get("test", "test"));
		preferences.put("test", "new test");
		System.out.println(preferences.get("test", "test"));
	}

}
