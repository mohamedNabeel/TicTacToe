package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

 abstract class  Start {

  private static final Button single_B = new Button("Single");
  private static final Button multi_B =  new Button("Multi");
  private static final Button setting_B = new Button("Settings");
  private static final Button About_B = new Button("About");


  private static void setCoordinate() {

      single_B.setTranslateX(250);
      single_B.setTranslateY(125);
      single_B.setPrefSize(200,50);

      multi_B.setTranslateX(250);
      multi_B.setTranslateY(225);
      multi_B.setPrefSize(200,50);

      setting_B.setTranslateX(250);
      setting_B.setTranslateY(325);
      setting_B.setPrefSize(200,50);

      About_B.setTranslateX(250);
      About_B.setTranslateY(425);
      About_B.setPrefSize(200,50);
  }

     public static Button getSingle_B() {
         return single_B;
     }

     public static Button getMulti_B() {
         return multi_B;
     }

     public static Button getSetting_B() {
         return setting_B;
     }

     public static Button getAbout_B() {
         return About_B;
     }

     public static VBox getStart() {

         VBox start = new VBox();

         start.setId("vbox");
         start.getStylesheets().add("sample/css.css");
         setCoordinate();
         start.getChildren().addAll(single_B,multi_B,setting_B,About_B);

         return start;
     }
 }
