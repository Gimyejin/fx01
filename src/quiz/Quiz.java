package quiz;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		GridPane gp =new GridPane();
		FlowPane fp = new FlowPane();
		/*
		 * fp.getChildren().add(new Button("아이디 입력")); fp.getChildren().add(new
		 * Button("로그인")); fp.getChildren().add(new Button("비밀번호 입력"));
		 * fp.setAlignment(Pos.CENTER);
		 */
		gp.add(new Button("아이디 입력"), 0, 0);
		gp.add(new Button("비밀번호 입력"),0,1);
		gp.add(new Button("로그인"), 1,1,1,1);
		
		Label lable = new Label("메뉴 홈 로그인");
		GridPane.setConstraints(lable, 1, 1);//가로세로
		Button bt1 = new Button("메뉴 나열");
		Button bt2 = new Button("내용 들어가는 곳");
		Button bt3 = new Button("바닥글 들어가는 곳");
		bp.setTop(lable);
		bp.setLeft(bt1);
		bp.setCenter(bt2);
		bp.setBottom(bt3);
		bp.setRight(gp);
		
		arg0.setScene(new Scene(bp, 300,300));
		arg0.show();
		
	}
}
