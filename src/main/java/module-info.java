module com.example.r {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.r to javafx.fxml;
    exports com.example.r;
}