package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex02 extends Application {
	// pane들은 중첩해가면서 쓰는 것임
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridpane = new GridPane();
		Button button = new Button("Button");
		GridPane.setConstraints(button, 0, 0);// 가로,세로

		Label label = new Label("label");
		GridPane.setConstraints(label, 1, 1);

		gridpane.getChildren().addAll(button, label);
		Button btn = new Button("Button");
		// getChildren는 위치조정 X add만 쓰면 추가하면서 위치 조정 가능
		gridpane.add(btn, 1, 0);
		gridpane.add(new Label("0,1"), 0, 1);

		gridpane.setPadding(new Insets(20));// 위,오른,아래,왼 모두 20
		gridpane.setHgap(50);// 세로
		gridpane.setVgap(10);// 가로

		arg0.setScene(new Scene(gridpane, 300, 300));

		FlowPane flowpane = new FlowPane();
		flowpane.getChildren().add(new Button("merge col(0),row(2)"));
		flowpane.setStyle("-fx-background-color:black;");
		flowpane.setAlignment(Pos.CENTER);// flowpane속 버튼에 대한 위치
		gridpane.add(flowpane, 0, 2, 2, 1);// 가로,세로,가로병합,세로병합

		arg0.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
