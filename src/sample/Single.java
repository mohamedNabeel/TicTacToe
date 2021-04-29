package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Single {

    static TextField Player_One = new TextField();
    static Button button = new Button("OK");
   static Stage stage = new Stage();
   static Label Wrong = new Label("");
  private final static Pane pane = new Pane();

    public static void Single_Info() {

        Label one = new Label("Player1 name");

        Player_One.setTranslateX(250);
        Player_One.setTranslateY(75);
        Player_One.setPrefSize(200, 50);

        Wrong.setTranslateX(250);
        Wrong.setTranslateY(130);
        Wrong.setStyle("-fx-text-fill: red");

        one.setTranslateX(75);
        one.setTranslateY(75);

        button.setTranslateX(200);
        button.setTranslateY(200);
        button.setPrefSize(200,50);

        Pane p = new Pane();
        p.getChildren().addAll(Player_One, one,button,Wrong);
        p.getStylesheets().add("sample/css.css");
        p.setId("pane");

        stage.setTitle("Single Info");
        stage.setScene(new Scene(p, 500, 300));
        stage.setResizable(false);

        stage.show();



    }

    public static void  closed() {
        stage.close();
    }
}
