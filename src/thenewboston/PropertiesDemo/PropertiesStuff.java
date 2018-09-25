package thenewboston.PropertiesDemo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import javafx.scene.control.*;

/**
 * PropertiesStuff
 * Purpose: Properties video
 *
 * @author Denielle Kirk Abaquita
 * @version 6/28/18 @ 12:46 PM
 */

public class PropertiesStuff extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Properties");

        Person bob = new Person();

        // Called whenever first name changes
        bob.firstNameProperty().addListener( (v, oldValue, newValue) ->
        {
            System.out.println("Name changed to: " + newValue);
            System.out.println("firstNameProperty(): " + bob.firstNameProperty());      // tends to print out location of just firstNameProperty()
            System.out.println("getFirstName(): " + bob.getFirstName());
        });

        Button button = new Button("Submit");
        button.setOnAction(e -> {
            bob.setFirstName("Bob");
        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
