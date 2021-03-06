package anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		//내가 원하는 좌표로 넣을 수 있음
		AnchorPane ap = new AnchorPane();
		Button btn1 = new Button("bt1");
		Button btn2 = new Button("bt2");

		AnchorPane.setTopAnchor(btn1, 10.0);
		AnchorPane.setRightAnchor(btn1, 10.0);

		AnchorPane.setBottomAnchor(btn2, 10.0);
		AnchorPane.setLeftAnchor(btn2, 10.0);

		ap.getChildren().addAll(btn1,btn2);
		arg0.setScene(new Scene(ap,300,300));
		arg0.show();

	}

}
