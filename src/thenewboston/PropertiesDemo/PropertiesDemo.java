package thenewboston.PropertiesDemo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.StackPane;

import javafx.scene.control.*;

/**
 * PropertiesDemo
 * Purpose:
 *
 * @author Denielle Kirk Abaquita
 * @version 7/1/18 @ 5:22 AM
 */

public class PropertiesDemo extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Binding Demo");

        Button button = new Button("Submit");

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
