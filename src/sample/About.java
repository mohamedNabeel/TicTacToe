package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class About {

    static void about_info() {
        Label label = new Label("This app is done by MN9 2021/3/7");
        label.getStylesheets().add("sample/css.css");
        label.setAlignment(Pos.CENTER);
        label.setBackground(new Background(new BackgroundFill(Color.rgb(236,82,75), CornerRadii.EMPTY, Insets.EMPTY)));
        Stage stage = new Stage();

        stage.setScene(new Scene(label,500,200));
        stage.setResizable(false);
        stage.show();
    }
}
