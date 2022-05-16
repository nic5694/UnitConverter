module unitconverter.unitconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens unitconverter.unitconverter to javafx.fxml;
    exports unitconverter.unitconverter;
}