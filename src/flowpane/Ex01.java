package flowpane;

import java.awt.Insets;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// 우리가 임포트 해야하는건 무조건 fx꺼임
		//FlowPane은 기본적으로 순차적 가로로 정렬됨.
		//FlowPane flowPane = new FlowPane();

		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);//세로배치
		
		
		/*
		 * Button btn01 =new Button("버튼 01"); Button btn02 =new Button("버튼 02"); Button
		 * btn03 =new Button("버튼 03");
		 * 
		 * 
		 * flowPane.getChildren().add(btn01); flowPane.getChildren().add(btn02);
		 * flowPane.getChildren().add(btn03);
		 */
		// 이걸 반복문으로 해보기
		for (int i = 0; i < 15; i++) {
			flowPane.getChildren().add(new Button("버튼 " + (i + 1)));
		}
		
		//패딩 - 안쪽의 여백을 줌 		   위  오  아 왼
		//flowPane.setPadding(new Insets(10,10,10,10));
		
		//가로세로에 대한 gap을 줄 수 있음 (간격에 대한)
		flowPane.setVgap(10);//세로
		flowPane.setHgap(300);//가로
		
		

		// 이제 scene만들기 , 위에 올려줘야지
		Scene sc = new Scene(flowPane, 500, 200);
		arg0.setScene(sc);

		arg0.show();
		// 프로퍼티에서 ${javafxCompControls} 를 매번 넣어줘야함

	}
}
