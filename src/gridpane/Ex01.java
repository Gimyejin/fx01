package gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex01 extends Application {
	// gridpane
	//표처럼  가로 0~n 세로 0~n개

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button btn = new Button("Button");
		GridPane.setConstraints(btn, 0, 0);// 가로,세로

		Label label = new Label("label");
		Label label02 = new Label("label02");

		GridPane.setConstraints(label, 1, 1);//static 메소드는 클래스 이름으로 사용할 수 있다.
											//변수 이름으로 써도 상관없지만 static으로 만들었는지 헷갈릴 수 있음
		GridPane.setConstraints(label02, 0, 2);
		
		gridPane.getChildren().addAll(btn, label,label02);
		arg0.setScene(new Scene(gridPane,300,100));
		
		

		arg0.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
