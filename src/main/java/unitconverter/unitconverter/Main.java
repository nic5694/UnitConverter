package unitconverter.unitconverter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    private String instructionstext="";
    @Override
    public void start(Stage stage) throws IOException {
        ///Setting stage
        stage.setTitle("Unit Conversion");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.setResizable(false);
        stage.centerOnScreen();

        //Creating root layout pane
        VBox root = new VBox();

        //Creating css sheet link
        String csslink = Objects.requireNonNull(getClass().getResource("/css/style.css")).toExternalForm();
        root.getStylesheets().add(csslink);

        //setting and placing title
        HBox title = new HBox(new Label("Welcome to your personal unit converter!"));
        //title.setAlignment(Pos.CENTER);
        //setting style for the title
        title.getStyleClass().addAll("text", "h1", "strong");



        //Maybe put the unit names in an array list or find a way to get all the names that extend UNIT
        //setting the combo box and adding it to the layout
        ObservableList <String> units = FXCollections.observableArrayList(
                "Speed",
                    "Mass",
                    "Length"
        );
        ComboBox unitselector = new ComboBox(units);
        HBox uspane = new HBox(unitselector);

        //setting action event when an item is clicked
        unitselector.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String selectedunit = (String) unitselector.getValue();
                instructionstext = "Select the " + selectedunit + " unit you would like to convert from and \n" +
                        " the unit you want to convert to below: ";
            }
        });


        

        

        //units dropdown speed class
        ObservableList <String> speed = FXCollections.observableArrayList(
                "m/s",
                    "ft/s",
                    "km/h",
                    "mph",
                    "kn"
        );
        //units dropdown length class
        ObservableList <String> length = FXCollections.observableArrayList(
                "mm",
                    "cm",
                    "in",
                    "ft",
                    "yd",
                    "m",
                    "km",
                    "mile"
        );
        //units dropdown mass class
        ObservableList <String> mass = FXCollections.observableArrayList(
                "mg",
                    "g",
                    "oz",
                    "lb",
                    "kg",
                    "stone",
                    "metric ton",
                    "short ton (US)",
                    "long ton (UK)"
        );

        //setting label and styling 
        Label instructions = new Label(instructionstext);
        instructions.getStyleClass().addAll("text", "h3", "strong");
        instructions.wrapTextProperty();
        HBox instructionspane = new HBox(instructions);



        root.getChildren().addAll(title, uspane, instructionspane);
        root.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}