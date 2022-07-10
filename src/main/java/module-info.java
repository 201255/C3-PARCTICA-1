module com.example.practica1c3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practica1c3 to javafx.fxml;
    exports com.example.practica1c3;
}