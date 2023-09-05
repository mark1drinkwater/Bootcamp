module com.example.java_dummies_book6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_dummies_book6 to javafx.fxml;
    exports com.example.java_dummies_book6;
}