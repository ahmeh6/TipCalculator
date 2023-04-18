module huzaifa.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens huzaifa.tipcalculator to javafx.fxml;
    exports huzaifa.tipcalculator;
}
