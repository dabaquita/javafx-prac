package thenewboston;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;

/**
 * Input
 * Purpose: Extract and validate
 * input
 *
 * @author Denielle Kirk Abaquita
 * @version 6/16/18 @ 9:43 AM
 */

public class Input extends Application {

    private Button button;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Input Stuff");

        // Form
        TextField nameInput = new TextField();
        nameInput.setPromptText("Name");

        button = new Button("Click Me");
        // button.setOnAction( e -> System.out.println(nameInput.getText()) );     // extracts the text entered in textfield
        button.setOnAction( e -> isInt(nameInput, nameInput.getText()) );


        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput, button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(250);

        primaryStage.show();
    }

    /**
     * Validation for text input and catches errors
     * @param input - field itself in order to make operations on it
     * @param message - value typed in
     * @return if the message is an integer
     */
    private boolean isInt(TextField input, String message)
    {
        try
        {
            int age = Integer.parseInt(message);
            System.out.println("User is " + age);
            return true;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: " + message + " is not a numerical value");
            return false;
        }
    }

}
