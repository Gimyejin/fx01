package listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ListView<String> listview = new ListView<String>();
		listview.getItems().addAll("item1", "item2", "item3");
		listview.setPrefSize(100, 100);
		listview.setLayoutX(20);
		listview.setLayoutY(20);
		
		
		
		ap.getChildren().add(listview);
		ap.setPrefSize(300, 300);
		
		arg0.setScene(new Scene(ap, 300, 200));

		arg0.show();

	}

}
