package gui;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sorgu.Sorgu;

public class Traffi extends Application {

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		Text scenetitle = new Text("Trafik Uygulamasi");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label tcKimlik = new Label("Vatandaslik No:");
		grid.add(tcKimlik, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);



		Button btn = new Button("Borc Sorgula");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);

		final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

		btn.setOnAction(new EventHandler<ActionEvent>() {

		    @Override
		    public void handle(ActionEvent e) {
		    	try {
					double borc= Sorgu.borcSorgula(userTextField.getText());
					actiontarget.setFill(Color.FIREBRICK);
			        actiontarget.setText("Toplam borcunuz: " + borc);
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
		    }
		});

		grid.add(hbBtn, 1, 4);


		Button btn2 = new Button("Rapor Hazirla");
		HBox hbBtn2 = new HBox(2);
		hbBtn2.setAlignment(Pos.BOTTOM_LEFT);
		hbBtn2.getChildren().add(btn2);
		grid.add(hbBtn2, 0, 4);

		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
