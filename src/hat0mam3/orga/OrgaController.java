package hat0mam3.orga;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;

public class OrgaController {
	@FXML
	private Button buttonDontStop;
	@FXML
	private Button buttonNonStop;
	@FXML
	private Button buttonEisho;
	@FXML
	private Button buttonNonRelation;
	
	@FXML
	public void onClickDontStop(ActionEvent aEvent) {
		playMusic("./orga.wav");
	}
	
	@FXML
	public void onClickNonStop(ActionEvent aEvent){
		playMusic("./nonstop.wav");
	}
	
	@FXML
	public void onClickEisho(ActionEvent aEvent){
		playMusic("./eisho.wav");
	}
	
	@FXML
	public void onClickNonRelation(ActionEvent aEvent){
		playMusic("./ride.wav");
	}
	
	public void playMusic(String fileName){
		AudioClip audioClip = new AudioClip(new File(fileName).toURI().toString());
		audioClip.play();
	}
}
