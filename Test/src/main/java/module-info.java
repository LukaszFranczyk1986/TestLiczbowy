module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zad to javafx.fxml;
    exports com.example.zad;
}