package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Settings {

    static ComboBox choices = new ComboBox<>();
    static Button Done = new Button("Done");
    private static Stage stage = new Stage();


    public static void settings_info() {
        Label b_t = new Label("Board Type");

        choices.getItems().addAll("Classic",new Separator(),"Colored");
        choices.setTranslateX(200);
        choices.setTranslateY(100);
        choices.setPrefSize(200,50);
        choices.getSelectionModel().selectFirst();
        b_t.setTranslateX(50);
        b_t.setTranslateY(100);

        Done.setTranslateX(150);
        Done.setTranslateY(200);
        Done.setPrefSize(200,50);

        Pane p = new Pane();
        p.getChildren().addAll(choices,b_t,Done);
        p.getStylesheets().add("sample/css.css");
        p.setId("pane");


        stage.setTitle("Settings");
        stage.setScene(new Scene(p, 400, 300));
        stage.setResizable(false);

        stage.show();
    }

    public static void closed() {
        stage.close();
    }
}
