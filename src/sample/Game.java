package sample;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.util.Random;


public class Game {

    static Button exit = new Button("Exit");
    static Button newGame = new Button("New Game");
    static GridPane gridPane = new GridPane();
    static Button[] button = new Button[9];
    static Label Player1 = new Label("", new ImageView(new Image("blueUser.png")));
    static Label computer = new Label("Computer", new ImageView(new Image("computer.png")));
    static boolean isGameEnd = false;
    static boolean firstPlayerTurn = true;
    static int count = 0;
    static Label symbol = new Label("X");
    static Label p_score = new Label("0");
    static Label c_score = new Label("0");
    static Label Winner = new Label("");


    public static Pane Single_Scene(){

        Pane pane = new Pane();
        pane.getStylesheets().add("sample/css.css") ;
        pane.setId("pane");

        Winner.setTranslateX(260);
        Winner.setTranslateY(25);
        Winner.setStyle("-fx-text-fill: Gold;-fx-font-size: 50");
        p_score.setTranslateX(900);
        p_score.setTranslateY(125);
        p_score.setStyle("-fx-font-size: 70");

        Player1.setTranslateX(750);
        Player1.setTranslateY(100);
        Player1.setText(Single.Player_One.getText());
        Player1.setContentDisplay(ContentDisplay.TOP);

           symbol.setTranslateX(790);
           symbol.setTranslateY(325);
           symbol.setStyle("-fx-font-size: 70");

           c_score.setTranslateX(900);
           c_score.setTranslateY(525);
           c_score.setStyle("-fx-font-size: 70");
        computer.setTranslateX(750);
        computer.setTranslateY(500);
        computer.setContentDisplay(ContentDisplay.TOP);

        exit.setTranslateX(500);
        exit.setTranslateY(700);
        exit.setPrefSize(200,50);

        newGame.setTranslateX(100);
        newGame.setTranslateY(700);
        newGame.setPrefSize(200,50);

        gridPane.setTranslateX(150);
        gridPane.setTranslateY(100);
        gridPane.setPrefSize(550,550);
        gridPane.setId("grid");
        int row = 0;
        int column = 0;
         for(int i = 0 ; i  < button.length;i++) {
             button[i] = new Button();
             button[i].setId("buttons");
             button[i].setPrefSize(200,200);
             GridPane.setMargin(button[i],new Insets(5) );
             gridPane.add(button[i],column ,row);
             button[i].addEventHandler(ActionEvent.ACTION, e -> {
                 actionPerformed(e);
             });
             column++;
             if(column == 3){
                 row++;
                 column= 0;
             }
         }

        pane.getChildren().addAll(exit,newGame,gridPane,Player1,computer,symbol,p_score,c_score,Winner);


        return pane;
    }

    public static void start(){

        String b00 = button[0].getText();
        String b01 = button[1].getText();
        String b02 = button[2].getText();
        String b10 = button[3].getText();
        String b11 = button[4].getText();
        String b12 = button[5].getText();
        String b20 = button[6].getText();
        String b21 = button[7].getText();
        String b22 = button[8].getText();

        if(b00.equals(b01) && b00.equals(b02) && !b00.equals("")){
            isGameEnd = true;
            setBackground(button[0],button[1],button[2]);
            if(firstPlayerTurn){
                p_score.setText(Integer.valueOf(p_score.getText()) + 1 +"");
                Winner.setText(Player1.getText()+" Won");

            }
            else {
                c_score.setText(Integer.valueOf(c_score.getText()) + 1 + "");
                Winner.setText("Computer won");

            }
        
        }
        else if(b00.equals(b10) && b00.equals(b20) && !b00.equals("")){
            isGameEnd = true;
            setBackground(button[0],button[3],button[6] );
            if(firstPlayerTurn){
                p_score.setText(Integer.valueOf(p_score.getText()) + 1 +"");
                Winner.setText(Player1.getText()+" Won");

            }
            else {
                c_score.setText(Integer.valueOf(c_score.getText()) + 1 + "");
                Winner.setText("Computer won");

            }
        }
      else  if(b00.equals(b11) && b00.equals(b22) && !b00.equals("")){
            isGameEnd = true;
            setBackground(button[0],button[4],button[8]);
            if(firstPlayerTurn){
                p_score.setText(Integer.valueOf(p_score.getText()) + 1 +"");
                Winner.setText(Player1.getText()+" Won");

            }
            else {
                c_score.setText(Integer.valueOf(c_score.getText()) + 1 + "");
                Winner.setText("Computer won");

            }
        }
        else if(b10.equals(b11) && b10.equals(b12) && !b10.equals("")){
            isGameEnd = true;
            setBackground(button[3],button[4],button[5] );
            if(firstPlayerTurn){
                p_score.setText(Integer.valueOf(p_score.getText()) + 1 +"");
                Winner.setText(Player1.getText()+" Won");
            }
            else {
                c_score.setText(Integer.valueOf(c_score.getText()) + 1 + "");
                Winner.setText("Computer won");

            }
        }

        else if(b20.equals(b21) && b20.equals(b22) && !b20.equals("")){
            isGameEnd = true;
            setBackground(button[6],button[7],button[8]);
            if(firstPlayerTurn){
                p_score.setText(Integer.valueOf(p_score.getText()) + 1 +"");
                Winner.setText(Player1.getText()+" Won");

            }
            else {
                c_score.setText(Integer.valueOf(c_score.getText()) + 1 + "");
                Winner.setText("Computer won");

            }
        }
    else    if(b20.equals(b11) && b20.equals(b02) && !b20.equals("")){
            isGameEnd = true;
            setBackground(button[6],button[4],button[2]);
            if(firstPlayerTurn){
                p_score.setText(Integer.valueOf(p_score.getText()) + 1 +"");
                Winner.setText(Player1.getText() + " Won");

            }
            else {
                c_score.setText(Integer.valueOf(c_score.getText()) + 1 + "");
                Winner.setText("Computer won");

            }
        }

     else    if(b01.equals(b11) && b01.equals(b21) && !b01.equals("")){
            isGameEnd = true;
            setBackground(button[1],button[4],button[7]);
            if(firstPlayerTurn){
                p_score.setText(Integer.valueOf(p_score.getText()) + 1 +"");
                Winner.setText(Player1.getText() + " Won");

            }
            else {
                c_score.setText(Integer.valueOf(c_score.getText()) + 1 + "");
                Winner.setText("Computer won");

            }
        }

     else   if(b02.equals(b12) && b02.equals(b22) && !b02.equals("")){
            isGameEnd = true;
            setBackground(button[5],button[2],button[8] );
            if(firstPlayerTurn){
                p_score.setText(Integer.valueOf(p_score.getText()) + 1 +"");
                Winner.setText(Player1.getText() + " Won");

            }
            else {
                c_score.setText(Integer.valueOf(c_score.getText()) + 1 + "");
                Winner.setText("Computer won");
            }
        }

    if(count >= 9){
        isGameEnd = true;
        count = 0;
        if(Winner.getText().equals("")){
            Winner.setText("Draw");
        }
    }

    }

    public static void actionPerformed(ActionEvent e){
        Button item = (Button) e.getSource();

        if(!isGameEnd && item.getText().equals("")) {
                item.setText("X");
                item.setStyle("-fx-text-fill: #1D5984;-fx-font-size: 70");
                symbol.setText("O");

            firstPlayerTurn = true;
            count++;
            start();

            if(!isGameEnd) {


                Random random = new Random();
                count++;
                firstPlayerTurn = false;
                int R;
                for(;;) {
                    R = random.nextInt(9);
                    if(button[R].getText().equals("")){
                        button[R].setText("O");
                        button[R].setStyle("-fx-text-fill: #ce5122;-fx-font-size: 70");
                        symbol.setText("X");
                        break;
                    }
                }
                start();


            }
        }

    }

    public static void newGames() {
        isGameEnd = false;
        firstPlayerTurn = true;
        count =0;
        Winner.setText("");

        for(Button b : button){
            b.setText("");
            b.setStyle("-fx-background-color: #52b788");
        }
    }

    public static void exits(){
        p_score.setText("0");
        c_score.setText("0");
        newGames();
    }
    public static void setBackground(Button one, Button two, Button three) {
        one.setStyle("-fx-background-color: gold;-fx-font-size: 70");
        two.setStyle("-fx-background-color: gold; -fx-font-size: 70");
        three.setStyle("-fx-background-color: gold; -fx-font-size: 70");
    }
}
