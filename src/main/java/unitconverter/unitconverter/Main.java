package unitconverter.unitconverter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import java.util.Objects;

public class Main extends Application {
    String selectedunit="";
    private String instructionstext="Select the unit you would like to convert from and \n" +
            " the unit you want to convert to below: ";
    private final ComboBox<String> fromUnitList = new ComboBox<>();
    private final ComboBox<String> toUnitList = new ComboBox<>();
    Label convamount = new Label("Converted Value: ");

    @Override
    public void start(Stage stage) {
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
        ComboBox<String> unittypeselector = new ComboBox<>(units);
        HBox uspane = new HBox(unittypeselector);

        //setting label and styling
        Label instructions = new Label(instructionstext);
        instructions.getStyleClass().addAll("text", "h3", "strong");
        instructions.wrapTextProperty();
        HBox instructionspane = new HBox(instructions);



        //setting action event on the combo box when an item is clicked
        unittypeselector.setOnMouseClicked(mouseEvent -> {
            //TODO check maybe for a changre listner
            selectedunit = unittypeselector.getValue();
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
                //setting dropdowns for the units available to convert
                switch (selectedunit) {
                    case "Speed" -> {
                        fromUnitList.show();
                        fromUnitList.setItems(speed);
                        toUnitList.show();
                        toUnitList.setItems(speed);
                    }
                    case "Length" -> {
                        fromUnitList.show();
                        fromUnitList.setItems(length);
                        toUnitList.show();
                        toUnitList.setItems(length);
                    }
                    case "Mass" -> {
                        fromUnitList.show();
                        fromUnitList.setItems(mass);
                        toUnitList.show();
                        toUnitList.setItems(mass);
                    }
                }
            }
            else {
                fromUnitList.hide();
                toUnitList.hide();
            }
        });

        //Setting text field
        TextField amount = new TextField();

        //adding elements to the layout HBox
        HBox conversionPane = new HBox(amount, fromUnitList, convamount, toUnitList);

        //setting the convert button
        Button convert = new Button("Convert");
        convert.setOnAction(actionEvent -> {
            if(amount.getText().isEmpty()){
                //adding an alert to make sure that the user enters an entry
                Alert blank = new Alert(Alert.AlertType.INFORMATION);
                blank.setTitle("Invalid Entry!");
                blank.setHeaderText("You have not entered a value to be converted.");
                blank.setContentText("Please make sure to choose the unit you would like to convert from and convert " +
                        "too as well as entering a valid number in the text field.");
                blank.showAndWait();
            }
            double damount;
            try {
                damount = Double.parseDouble(amount.getText());
            } catch (NumberFormatException e){
                //catching exception is user does not enter a valid entry
                e.printStackTrace();
                Alert invalidEntry = new Alert(Alert.AlertType.INFORMATION);
                invalidEntry.setTitle("Invalid Entry!");
                invalidEntry.setHeaderText("You have not entered numbers.");
                invalidEntry.setContentText("Please make sure to enter valid numbers or decimal numbers.");
                invalidEntry.showAndWait();
                amount.setText("");
                return;
            }
            String fromUnit = fromUnitList.getValue();
            String toUnit = toUnitList.getValue();
            //Converting the values to the corresponding units
            switch (selectedunit) {
                case "Speed" -> {
                    Speed s1 = new Speed();
                    convamount.setText(Double.toString(s1.convert(fromUnit, toUnit, damount)));
                }
                case "Length" -> {
                    Length l1 = new Length();
                    l1.convert(fromUnit, toUnit, damount);
                }
                case "Mass" -> {
                    Mass m1 = new Mass();
                    m1.convert(fromUnit, toUnit, damount);
                }
            }
        });

        HBox convertPane = new HBox(convert);





        root.getChildren().addAll(title, uspane, instructionspane, conversionPane, convertPane);
        root.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}