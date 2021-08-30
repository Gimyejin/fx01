package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Mainclass01 extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		Label lb = new Label("hello");
		lb.setFont(new Font(20));
		
		
		Scene scene = new Scene(lb,500,250);		
		
		arg0.setScene(scene);
		arg0.setTitle("연습중");
		arg0.show();
		// 기본틀을 보여주고 있음
		// stage라는 틀 위에 sencen이 올라가고 그 위에 컨테이너가 깔림
		
		
		//컨테이너 > 왜 필요한가? 글씨만 단순하게 올리지는 않잖음.
		//하나의 장판에 여러개가 들어가야하는데 scene은 하나밖에 넣을 수 없음
		//컨테이너 틀에 모양을 만들어 쌓아넣을 것임 > 그리고 그 컨테이너를 scene에 넣을 것임
		//안에는 여러개지만 컨테이너 자체는 틀 1개임
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
