package hat0mam3.orga;

import java.io.File;

import org.ietf.jgss.Oid;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;

public class OrgaController {
	@FXML
	private Button buttonNonStop;
	@FXML
	private Button buttonEisho;
	@FXML
	private Button buttonNonRelation;
	
	@FXML
	public void onClickNonStop(ActionEvent aEvent){
		AudioClip aClip = new AudioClip(new File("./orga.wav").toURI().toString());
		aClip.play();
	}
	
	@FXML
	public void onClickEisho(ActionEvent aEvent){
		AudioClip aClip = new AudioClip(new File("./eisho.wav").toURI().toString());
		aClip.play();
	}
	
	@FXML
	public void onClickNonRelation(ActionEvent aEvent){
		AudioClip aClip = new AudioClip(new File("./ride.wav").toURI().toString());
		aClip.play();
	}
}
