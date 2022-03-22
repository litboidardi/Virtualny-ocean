module com.example.virtualny_ocean {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.virtualny_ocean to javafx.fxml;
    exports com.example.virtualny_ocean;
}