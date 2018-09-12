package hat0mam3.orga;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Orga.fxml"));
			Scene scene = new Scene(root,720,480);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setOnKeyPressed(e -> OrgaController.hogefuga(e));
			primaryStage.setScene(scene);
			primaryStage.setTitle("é~Ç‹ÇÈÇÒÇ∂Ç·ÇÀÇ•ÇºÅcÅc");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
