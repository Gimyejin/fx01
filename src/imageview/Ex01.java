package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/img/smilerere.png");
		//iv.setImage(new Image("/img/calender.png"));

		
		//iv.setFitHeight(100);
		iv.setFitWidth(50);
		iv.setPreserveRatio(true);
		//하나만 설정하게 되면 자동적으로 사이즈 설정됨
		
		iv.setRotate(45);
		//회전
		
		ap.getChildren().add(iv);
		
		arg0.setScene(new Scene(ap, 300, 300));

		arg0.show();

	}

}
