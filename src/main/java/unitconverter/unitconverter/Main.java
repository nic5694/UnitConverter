package unitconverter.unitconverter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import java.util.Locale;


//TODO before handing it
/*
MAke a New UML
try and space more the objects
make video to hand in
clean up code
add comments in the code
check for comments left behind and take out the TODO's
 */

public class Main extends Application {
    private String selectedUnit ="";
    private final ComboBox<String> fromUnitList = new ComboBox<>();
    private final ComboBox<String> toUnitList = new ComboBox<>();
    private final Label convertedAnswer = new Label();
    private final String [] speedUnitsList = {"m/s", "ft/s", "km/h", "mph", "kn"};
    private final String [] lengthUnitsList = {"mm", "cm", "in", "ft", "yd", "m", "km", "mile"};
    private final String [] massUnitsList = {"mg", "g", "oz", "lb", "kg", "stone", "mt", "st",
            "lt"};
    private final String [] unitsList = {"Speed", "Mass", "Length"};
    private final String infoString = "Select the unit you would like to convert from and \n" +
            " the unit you want to convert to below: ";
    private TextField amount = new TextField();

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
        Label headerTitle = new Label("Dimensional Analysis Calculator");
        headerTitle.setStyle("-fx-text-fill: #cfdbd5");

        //setting and placing title
        HBox title = new HBox(headerTitle);

        //setting style and positioning for the title
        title.getStyleClass().addAll("text", "h1", "strong");
        title.setAlignment(Pos.CENTER);

        //Adding label for unit drop-down
        Label unitLabel = new Label("Unit type you would like to be converting : ");
        unitLabel.setStyle("-fx-text-fill: #f5cb5c");

        //placing and setting the combo box and adding it to the layout with the label
        ObservableList <String> units = FXCollections.observableArrayList(unitsList);
        ComboBox<String> unitTypeSelector = new ComboBox<>(units);
        HBox selectorPane = new HBox(unitLabel, unitTypeSelector);
        selectorPane.setAlignment(Pos.CENTER);

        //placing, setting label and styling for the information paragraph
        Label instructionsLabel = new Label(infoString);
        instructionsLabel.setTextAlignment(TextAlignment.CENTER);
        instructionsLabel.getStyleClass().addAll("text", "h3", "strong");
        instructionsLabel.setStyle("-fx-text-fill: #cfdbd5");
        HBox instructionsPane = new HBox(instructionsLabel);
        instructionsPane.setAlignment(Pos.CENTER);


            //creating the action dropdownClickEvent
            EventHandler<ActionEvent> dropdownClickEvent = actionEvent -> {
        selectedUnit = unitTypeSelector.getValue();
        instructionsLabel.setText("Select the " + selectedUnit.toLowerCase(Locale.ROOT) + " unit you would like to " +
                "convert from and \n the unit you want to convert to below: ");
        amount.setText("");

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
            };

        Label convertToLabel = new Label("Convert to: ");
        convertToLabel.setStyle("-fx-text-fill: #f5cb5c");

            //setting on action
        unitTypeSelector.setOnAction(dropdownClickEvent);

        amount.setPromptText("converting unit value");

        //creating and styling the print significant digit checkbox
        CheckBox significantDigits = new CheckBox("Print only significant digits");
        significantDigits.setSelected(true);
        significantDigits.setStyle("-fx-text-fill: #f5cb5c");


        HBox fromUnitPane = new HBox(15,amount,fromUnitList);
        HBox toUnitPane = new HBox(15, convertToLabel, toUnitList);

        //placing and adding elements to the layout HBox
        HBox conversionPane = new HBox(50,fromUnitPane, toUnitPane, significantDigits);
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
                        "too as well as entering a valid number in the text field. Please try again ;)");
                blank.showAndWait();
                //checking if selection has been made
            } else if (fromUnitList.getValue()==null || toUnitList.getValue()==null) {
                Alert nullConversionUnits = new Alert(Alert.AlertType.INFORMATION);
                nullConversionUnits.setTitle("Invalid Selection");
                nullConversionUnits.setHeaderText("You have not chosen your conversion units.");
                nullConversionUnits.setContentText("Please make sure to choose the unit type you would like to convert " +
                        "and the unit you would like to convert from and convert to before clicking the convert " +
                        "button. Please try again ;)");
                nullConversionUnits.showAndWait();
                //checking if user enters a valid entry
            } else if(amount.getText().matches("^(\\d+\\.?\\d*)$")) {
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
                        if (significantDigits.isSelected())
                        convertedAnswer.setText("Converted Value: " +  f1.formater(s1.convert(fromUnit, toUnit, damount)));
                        else
                            convertedAnswer.setText("Converted Value: " + s1.convert(fromUnit, toUnit, damount));
                    }
                    case "Length" -> {
                        Length l1 = new Length();
                        if (significantDigits.isSelected())
                            convertedAnswer.setText("Converted Value: " + f1.formater(l1.convert(fromUnit, toUnit, damount)));
                        else
                            convertedAnswer.setText("Converted Value: " + l1.convert(fromUnit, toUnit, damount));
                    }
                    case "Mass" -> {
                        Mass m1 = new Mass();
                        if (significantDigits.isSelected())
                            convertedAnswer.setText("Converted Value: " + f1.formater(m1.convert(fromUnit, toUnit, damount)));
                        else
                            convertedAnswer.setText("Converted Value: " + m1.convert(fromUnit, toUnit, damount));
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

        //setting the reset button and its actions
        Button clear = new Button("clear");
        clear.setOnAction(actionEvent -> {
           amount.setText("");
           convertedAnswer.setText("");
           unitTypeSelector.setValue("");
           fromUnitList.setItems(null);
           toUnitList.setItems(null);
           instructionsLabel.setText(infoString);
        });

        //styling the answer
        convertedAnswer.setStyle("-fx-text-fill: #f5cb5c");

        //placing and setting the pane to print out the value
        HBox convertedAmountPane = new HBox(convertedAnswer);
        convertedAmountPane.setAlignment(Pos.CENTER);


        //placing and setting the pane for the convert button
        HBox convertPane = new HBox(15,convert, clear);
        convertPane.setAlignment(Pos.CENTER);

        //adding all layout panes to the root layout node
        root.getChildren().addAll(title, selectorPane, instructionsPane, conversionPane, convertedAmountPane, convertPane);
        root.setStyle("-fx-background-color: #333533");
        root.setPadding(new Insets(15));


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