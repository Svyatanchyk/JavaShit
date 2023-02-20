module com.example.fuckingslave {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fuckingslave to javafx.fxml;
    exports com.example.fuckingslave;
}