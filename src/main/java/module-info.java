module com.example.tankstars {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tankstars to javafx.fxml;
    exports com.example.tankstars;
}