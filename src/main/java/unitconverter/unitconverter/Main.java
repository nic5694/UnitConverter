package unitconverter.unitconverter;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello!");
        //stage.setScene(scene); TODO set the scene
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}