package sample;

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

abstract class EventH {

    protected  static void MouseHandler(Stage stage) {

        Start.getSingle_B().addEventHandler(MouseEvent.ANY,(MouseEvent e)->{

            DropShadow dropShadow = new DropShadow(5, Color.RED);

            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Start.getSingle_B().setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Start.getSingle_B().setEffect(null);
            }
            else if(e.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
                Single.Single_Info();
            }
        });

        Start.getMulti_B().addEventHandler(MouseEvent.ANY,(MouseEvent e)->{

            DropShadow dropShadow = new DropShadow(5, Color.RED);

            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Start.getMulti_B().setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Start.getMulti_B().setEffect(null);
            }
            else if(e.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
                Multi.Multi_Info();
            }
        });

        Start.getSetting_B().addEventHandler(MouseEvent.ANY,(MouseEvent e)->{

            DropShadow dropShadow = new DropShadow(5, Color.RED);

            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Start.getSetting_B().setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Start.getSetting_B().setEffect(null);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
                Settings.settings_info();
            }
        });

        Start.getAbout_B().addEventHandler(MouseEvent.ANY,(MouseEvent e)->{

            DropShadow dropShadow = new DropShadow(5, Color.RED);

            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Start.getAbout_B().setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Start.getAbout_B().setEffect(null);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
                About.about_info();
            }
        });

        Settings.Done.addEventHandler(MouseEvent.ANY,(MouseEvent e) ->{

            DropShadow dropShadow = new DropShadow(5, Color.RED);

            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Settings.Done.setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Settings.Done.setEffect(null);
            }
            else if(e.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
                Settings.closed();
            }
        });

        Single.button.addEventHandler(MouseEvent.ANY, (MouseEvent e)->{

            DropShadow dropShadow = new DropShadow(5, Color.RED);

            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Single.button.setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Single.button.setEffect(null);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
                if(!Single.Player_One.getText().isEmpty()) {

                    stage.setScene(new Scene(Game.Single_Scene(), 1000, 800));
                    Single.Player_One.clear();
                    Single.Wrong.setText("");
                    Single.closed();
                }
               else{
                   Single.Wrong.setText("Please Enter Name");
                }
            }
        });

        Multi.MButton.addEventHandler(MouseEvent.ANY,(MouseEvent e)->{
            DropShadow dropShadow = new DropShadow(5, Color.RED);

            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Multi.MButton.setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Multi.MButton.setEffect(null);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
                if(!Multi.MPlayer_One.getText().isEmpty() && !Multi.MPlayer_two.getText().isEmpty()) {
                    stage.setScene(new Scene(mgame.MultiScene(), 1000, 800));
                    Multi.closed();
                    Multi.MPlayer_One.clear();
                    Multi.MPlayer_two.clear();
                    Multi.Wrong.setText("");
                }
                else
                {
                    Multi.Wrong.setText("Please Enter Name");
                }
            }
        });

        Game.exit.addEventHandler(MouseEvent.ANY,(MouseEvent e)->{
            DropShadow dropShadow = new DropShadow(5, Color.RED);


            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Game.exit.setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Game.exit.setEffect(null);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
                Game.exits();
                stage.setScene(new Scene(Start.getStart(), 700, 700));
            }
        });

        Game.newGame.addEventHandler(MouseEvent.ANY,(MouseEvent e)->{
            DropShadow dropShadow = new DropShadow(5, Color.RED);


            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                Game.newGame.setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                Game.newGame.setEffect(null);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
                Game.newGames();
            }
        });

        mgame.exit.addEventHandler(MouseEvent.ANY,(MouseEvent e)->{
            DropShadow dropShadow = new DropShadow(5, Color.RED);


            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                mgame.exit.setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                mgame.exit.setEffect(null);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
                mgame.exits();
                stage.setScene(new Scene(Start.getStart(), 700, 700));
            }
        });

        mgame.newGame.addEventHandler(MouseEvent.ANY,(MouseEvent e)->{
            DropShadow dropShadow = new DropShadow(5, Color.RED);


            if(e.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
                mgame.newGame.setEffect(dropShadow);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_EXITED)){
                mgame.newGame.setEffect(null);
            }
            else if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
                mgame.newGames();
            }
        });
    }



}
