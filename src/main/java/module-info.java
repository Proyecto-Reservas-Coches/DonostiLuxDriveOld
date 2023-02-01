module com.example.donostiluxdrive {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.donostiluxdrive to javafx.fxml;
    exports com.example.donostiluxdrive;
}