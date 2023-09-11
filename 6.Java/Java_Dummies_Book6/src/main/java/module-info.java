module com.example.java_dummies_book6 {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.java_dummies_book6.Chapter_1;
    opens com.example.java_dummies_book6.Chapter_1 to javafx.fxml;
    exports com.example.java_dummies_book6.Chapter_2;
    opens com.example.java_dummies_book6.Chapter_2 to javafx.fxml;
    exports com.example.java_dummies_book6.Chapter_3;
    opens com.example.java_dummies_book6.Chapter_3 to javafx.fxml;
    exports com.example.java_dummies_book6.Chapter_4;
    opens com.example.java_dummies_book6.Chapter_4 to javafx.fxml;
    exports com.example.java_dummies_book6.Chapter_5;
    opens com.example.java_dummies_book6.Chapter_5 to javafx.fxml;
    exports com.example.java_dummies_book6.Chapter_6;
    opens com.example.java_dummies_book6.Chapter_6 to javafx.fxml;
}