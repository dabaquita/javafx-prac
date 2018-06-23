package thenewboston;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

import javafx.scene.control.ComboBox;

/**
 * ComboBoxDemo
 * Purpose: Improved drop down menu
 *
 * @author Denielle Kirk Abaquita
 * @version 6/18/18 @ 6:32 AM
 */

public class ComboBoxDemo extends Application {

    ComboBox<String> comboBox;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("ComboBox");
        Button button = new Button("Click Me");

        // ComboBox
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good Will Hunting",
                "Deadpool",
                "The Avengers"
        );

        comboBox.setPromptText("What is your favorite movie?");

        comboBox.setEditable(true);         // drop down options can be edited

        button.setOnAction(e -> printMovie(comboBox));                          // occurs upon pressing button
        comboBox.setOnAction(e -> System.out.println(comboBox.getValue()));     // occurs upon selection

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        // Scene and Stage
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * Prints out the selection from a combo box
     * @param comboBox - string drop down menu
     */
    private void printMovie(ComboBox<String> comboBox)
    {
        System.out.println(comboBox.getValue());
    }

}
