package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args){
        launch();

    }

    public void start(Stage stage) throws Exception{

        //01. set stage title
        stage.setTitle("Contact1");

        //02. set layout
        BorderPane layout = new BorderPane();
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        layout.setCenter(hBox);

        //03. set scene
        Scene scene = new Scene(layout, 400,300);

        //04. open stage
        stage.setScene(scene);
        stage.show();

        //05. add component -> a. button
        Button button = new Button("OK");
        Button button1 = new Button("No");
        hBox.getChildren().addAll(button, button1);

    }

}