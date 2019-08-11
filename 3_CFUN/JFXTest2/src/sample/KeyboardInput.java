package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class KeyboardInput extends Application {
    @Override
    public void start(Stage stage) {
        AudioClip submarineSound = new AudioClip("https://github.com/opendream/ODOpenAlarm/blob/master/sounds/Tink.aiff?raw=true");
        TilePane index = new TilePane(Orientation.VERTICAL);
        Scene scene = new Scene(index);
        Label result = new Label("");

        scene.setOnKeyPressed(event -> {
            System.out.println(event.getCode());;
            result.setText("");
                submarineSound.play();

        });
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
