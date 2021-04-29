package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Multi {

    static TextField MPlayer_One = new TextField();
    static TextField MPlayer_two = new TextField();
    static Button MButton = new Button("OK");
    private final   static Pane pane =new Pane();
    static Stage stage = new Stage();
    static Label Wrong = new Label("");

     public static void Multi_Info() {

         Label one = new Label("Player1 name");
         Label two = new Label("Player2 name");

         MPlayer_One.setTranslateX(250);
         MPlayer_One.setTranslateY(50);
         MPlayer_One.setPrefSize(200,50);

         MPlayer_two.setTranslateX(250);
         MPlayer_two.setTranslateY(150);
         MPlayer_two.setPrefSize(200,50);

         one.setTranslateX(75);
         one.setTranslateY(50);

         two.setTranslateX(75);
         two.setTranslateY(150);

         MButton.setTranslateX(200);
         MButton.setTranslateY(300);
         MButton.setPrefSize(200,50);

         Wrong.setTranslateX(200);
         Wrong.setTranslateY(225);
         Wrong.setStyle("-fx-text-fill: red");


         Pane p = new Pane();
         p.getChildren().addAll(MPlayer_One, MPlayer_two,one,two,MButton,Wrong);
         p.getStylesheets().add("sample/css.css");
         p.setId("pane");

         stage.setTitle("Multi Info");
         stage.setScene(new Scene(p,600,400));
         stage.setResizable(false);

         stage.show();
 ;
     }


         public static Pane getPane() {
             return pane;

     }
     public static void closed() {
         stage.close();
     }
}
