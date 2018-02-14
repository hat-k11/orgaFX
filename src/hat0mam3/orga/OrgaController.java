package hat0mam3.orga;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;

public class OrgaController {
	@FXML
	private Button button;
	
	@FXML
	public void onClick(ActionEvent aEvent){
		AudioClip aClip = new AudioClip(new File("./orga.wav").toURI().toString());
		aClip.play();
	}
}
