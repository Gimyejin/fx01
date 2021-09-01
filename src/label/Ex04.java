package label;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex04 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane anch = new AnchorPane();
		Label la = new Label("value");

		la.setFont(new Font(32));
		la.setRotate(48);
		la.setTranslateX(100);
		la.setTranslateY(70);
		//[방법1]
		EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				la.setScaleX(1.5);// 가로로 1.5배
				la.setScaleY(1.5);// 세로로 1.5배

			}

		};

		// 마우스포인트 왓다갓다
		la.setOnMouseEntered(entered);
		//[방법2]
		//위에꺼랑 똑같은 내용임
		la.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				la.setScaleX(1);
				la.setScaleY(1);

			}
		});
		//[방법3]
		la.setOnMousePressed(e->{
			la.setRotate(0);
		});
		
		
		anch.getChildren().addAll(la);
		anch.setPrefSize(300, 200);

		arg0.setScene(new Scene(anch));
		arg0.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
