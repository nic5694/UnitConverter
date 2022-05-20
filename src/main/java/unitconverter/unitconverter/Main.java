package unitconverter.unitconverter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Objects;

public class Main extends Application {
    String selectedunit="";
    private String instructionstext="Select the unit you would like to convert from and \n" +
            " the unit you want to convert to below: ";
    private final ComboBox fromUnitList = new ComboBox();
    private final ComboBox toUnitList = new ComboBox();

    /*
    private final SplitMenuButton fromUnitList = new SplitMenuButton();
    private final SplitMenuButton toUnitList = new SplitMenuButton();

     */
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
        ComboBox unittypeselector = new ComboBox(units);
        HBox uspane = new HBox(unittypeselector);

        //setting label and styling
        Label instructions = new Label(instructionstext);
        instructions.getStyleClass().addAll("text", "h3", "strong");
        instructions.wrapTextProperty();
        HBox instructionspane = new HBox(instructions);



        //setting action event on the combo box when an item is clicked
        unittypeselector.setOnMouseClicked(mouseEvent -> {
            selectedunit = (String) unittypeselector.getValue();
            instructionstext = "Select the " + selectedunit + " unit you would like to convert from and \n" +
                    " the unit you want to convert to below: ";

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
            if(selectedunit!=null) {
                switch (selectedunit) {
                    case "Speed":
                        fromUnitList.setItems(speed);
                        toUnitList.setItems(speed);
                        break;
                    case "Length":
                        fromUnitList.setItems(length);
                        toUnitList.setItems(length);
                        break;
                    case "Mass":
                        fromUnitList.setItems(mass);
                        toUnitList.setItems(mass);
                        break;
                }
            }
        });
        //setting string and making sure it does not return null in the text field placeholder.
        String targetUnit=(String) toUnitList.getValue();
        if (targetUnit==null)
            targetUnit="";

        //Setting text field and text-field placeholder
        TextField amount = new TextField("Enter the amount you would like to convert to " + targetUnit);


        //setting converted amount label
        Label convamount = new Label("Converted Value: ");

        //adding elements to the layout HBox
        HBox conversionPane = new HBox(amount, fromUnitList, convamount, toUnitList);






        root.getChildren().addAll(title, uspane, instructionspane, conversionPane);
        root.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}