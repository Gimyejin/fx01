package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application{
	static int i =0;

	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		HBox hb =new HBox();
		hb.setPadding(new Insets(10));
		
		Label lb =new Label("a label that needs to be wrapped");
		hb.getChildren().addAll(lb);
		hb.setPrefSize(100, 100);
		
		lb.setWrapText(true);
		lb.setFont(new Font(20));
		lb.setRotate(45);
		lb.setTranslateY(50);
		
		
		
		//람다식(따로 관리가 되면서 돌아감)
		//마우스클릭이 이뤄지면 각도를 0으로 하는 이벤트를 넣음
		lb.setOnMouseClicked(e->{
			if(i==0) {
				lb.setRotate(0);
				lb.setTranslateY(0);
				i=1;
			}else {
				lb.setRotate(45);
				lb.setTranslateY(50);
				i=0;
			}
			
		});
		
		arg0.setScene(new Scene(hb));
		arg0.show();
		
	}

}
