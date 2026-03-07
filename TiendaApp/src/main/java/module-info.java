module com.example.tiendaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tiendaapp to javafx.fxml;
    exports com.example.tiendaapp;
}