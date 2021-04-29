package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){

        Scene scene = new Scene(Start.getStart(),700,700);
        scene.getStylesheets().add("sample/css.css");

        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe");
        stage.show();
        stage.setResizable(false);

        EventH.MouseHandler(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
