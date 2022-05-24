package unitconverter.unitconverter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import java.util.Locale;


//TODO before handing it
/*
MAke a New UML and README look on how ot write one
TRy and make a placeholder for the textbo
try and space more the objects
make video to hand in
clean up code
add comments in the code
check for comments left behind and take out the TODO's
 */

public class Main extends Application {
    String selectedUnit ="";
    private final ComboBox<String> fromUnitList = new ComboBox<>();
    private final ComboBox<String> toUnitList = new ComboBox<>();

    private Label convertedAnswer = new Label();
    private final String [] speedUnitsList = {"m/s", "ft/s", "km/h", "mph", "kn"};

    private final String [] lengthUnitsList = {"mm", "cm", "in", "ft", "yd", "m", "km", "mile"};

    private final String [] massUnitsList = {"mg", "g", "oz", "lb", "kg", "stone", "mt", "st",
            "lt"};

    private final String [] unitsList = {"Speed", "Mass", "Length"};

    private String infoString = "Select the unit you would like to convert from and \n" +
            " the unit you want to convert to below: ";

    @Override
    public void start(Stage stage) {
        ///Setting stage
        stage.setTitle("Unit Converter");
        stage.setWidth(800);
        stage.setHeight(400);
        stage.setResizable(false);
        stage.centerOnScreen();

        //Creating root layout pane
        VBox root = new VBox(30);



        //setting label
        Label headerTitle = new Label("Welcome to your personal unit converter!");
        headerTitle.setStyle("-fx-text-fill: #cfdbd5" +
                "");

        //setting and placing title
        HBox title = new HBox(headerTitle);

        //setting style and positioning for the title
        title.getStyleClass().addAll("text", "h1", "strong");
        title.setAlignment(Pos.CENTER);


        //TODO Maybe put the unit names in an array list or find a way to get all the names that extend UNIT
        //placing and setting the combo box and adding it to the layout
        ObservableList <String> units = FXCollections.observableArrayList(unitsList);
        ComboBox<String> unitTypeSelector = new ComboBox<>(units);
        HBox selectorPane = new HBox(unitTypeSelector);
        selectorPane.setAlignment(Pos.CENTER);

        //placing, setting label and styling for the information paragraph
        Label instructionsLabel = new Label(infoString);
        instructionsLabel.getStyleClass().addAll("text", "h3", "strong");
        instructionsLabel.setStyle("-fx-text-fill: #cfdbd5");
        instructionsLabel.wrapTextProperty();
        HBox instructionspane = new HBox(instructionsLabel);
        instructionspane.setAlignment(Pos.CENTER);


            //creating the action dropdownClickEvent
            EventHandler<ActionEvent> dropdownClickEvent = new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
            selectedUnit = unitTypeSelector.getValue();
            instructionsLabel.setText("Select the " + selectedUnit.toLowerCase(Locale.ROOT) + " unit you would like to " +
                    "convert from and \n the unit you want to convert to below: ");

            //units dropdown speed class
            ObservableList <String> speed = FXCollections.observableArrayList(speedUnitsList);
            //units dropdown length class
            ObservableList <String> length = FXCollections.observableArrayList(lengthUnitsList);
            //units dropdown mass class
            ObservableList <String> mass = FXCollections.observableArrayList(massUnitsList);

            if(selectedUnit !=null) {
                //setting dropdowns for the type of Unit conversion chosen by the user
                switch (selectedUnit) {
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
                }
            };

        Label convertToLabel = new Label("Convert to which unit: ");
        convertToLabel.setStyle("-fx-text-fill: #f5cb5c");

            //setting on action
        unitTypeSelector.setOnAction(dropdownClickEvent);

        //Setting text field
        TextField amount = new TextField();

        HBox fromUnitPane = new HBox(15,amount,fromUnitList);
        HBox toUnitPane = new HBox(15, convertToLabel, toUnitList);

        //placing and adding elements to the layout HBox
        HBox conversionPane = new HBox(50,fromUnitPane, toUnitPane);
        conversionPane.setAlignment(Pos.CENTER);

        //setting the convert button
        Button convert = new Button("Convert");
        convert.setOnAction(actionEvent -> {
            double damount=0;
            if(amount.getText().isEmpty()){
                //adding an alert to make sure that the user enters an entry
                Alert blank = new Alert(Alert.AlertType.INFORMATION);
                blank.setTitle("Invalid Entry!");
                blank.setHeaderText("You have not entered a value to be converted.");
                blank.setContentText("Please make sure to choose the unit you would like to convert from and convert " +
                        "too as well as entering a valid number in the text field.");
                blank.showAndWait();
                //checking if user enters a valid entry
            }else if(amount.getText().matches("^([0-9]+\\.?[0-9]*)$")) {
                try {
                    damount = Double.parseDouble(amount.getText());
                } catch (NumberFormatException e) {
                    //catching exception
                    e.printStackTrace();
                }

                String fromUnit = fromUnitList.getValue();
                String toUnit = toUnitList.getValue();

                //Converting the values to the corresponding units
                Format f1 = new Format();
                switch (selectedUnit) {
                    case "Speed" -> {
                        Speed s1 = new Speed();
//                        format(s1.convert(fromUnit, toUnit, damount));
                        convertedAnswer.setText("Converted Value: " +  f1.formater(s1.convert(fromUnit, toUnit, damount)));

                    }
                    case "Length" -> {
                        Length l1 = new Length();
                        convertedAnswer.setText("Converted Value: " + f1.formater(l1.convert(fromUnit, toUnit, damount)));
                    }
                    case "Mass" -> {
                        Mass m1 = new Mass();
                        convertedAnswer.setText("Converted Value: " + f1.formater(m1.convert(fromUnit, toUnit, damount)));
                    }
                }
            } else {
                Alert invalidEntry = new Alert(Alert.AlertType.INFORMATION);
                invalidEntry.setTitle("Invalid Entry!");
                invalidEntry.setHeaderText("You have not entered a valid entry.");
                invalidEntry.setContentText("Please make sure to enter valid numbers or decimal numbers.");
                invalidEntry.showAndWait();
                amount.setText("");
            }
        });

        //TODO add a clear button
        //setting the reset button
        Button reset = new Button("reset");
        reset.setOnAction(actionEvent -> {
           amount.setText("");
           convertedAnswer.setText("");
           unitTypeSelector.setValue("");
           fromUnitList.setValue("");
           toUnitList.setValue("");
           instructionsLabel.setText(infoString);
        });

        //styling the answer
        convertedAnswer.setStyle("-fx-text-fill: #f5cb5c");

        //placing and setting the pane to print out the value
        HBox convertedAmountPane = new HBox(convertedAnswer);
        convertedAmountPane.setAlignment(Pos.CENTER);


        //placing and setting the pane for the convert button
        HBox convertPane = new HBox(15,convert, reset);
        convertPane.setAlignment(Pos.CENTER);

        //adding all layout panes to the root layout node
        root.getChildren().addAll(title, selectorPane, instructionspane, conversionPane, convertedAmountPane, convertPane);
        root.setStyle("-fx-background-color: #333533");


        Scene scene = new Scene(root);

        //adding bootstrap stylesheet
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}