package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

import static javafx.scene.paint.Color.*;

public class TimeFX extends Application {
    boolean ledIsOn = false;
    @Override
    public void start(Stage stage) {


        Label ledLabel = new Label("1");
        ledLabel.setFont(Font.font(70));
        Label ledLabe1 = new Label("2");
        ledLabel.setFont(Font.font(70));
        Label ledLabe2 = new Label("3");
        ledLabel.setFont(Font.font(70));
        Label ledLabe3 = new Label("4");
        ledLabel.setFont(Font.font(70));

        Timer timer = new Timer();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                timer.cancel();
            }
        });
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                ledIsOn = !ledIsOn;

                if (ledIsOn) {
                    ledLabel.setTextFill(RED);
                } else {
                    ledLabel.setTextFill(GRAY);
                }
            }
        }, 0, 500);

        TilePane root = new TilePane(Orientation.VERTICAL);
        root.getChildren().add(ledLabel);

        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
