package com.example.java_dummies_book6.Chapter_4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String cssLayout = "-fx-border-color: red;\n" +
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: dashed;\n";

        GridPane gPane = new GridPane();
        gPane.setStyle(cssLayout);

        Scene scene = new Scene(gPane, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
