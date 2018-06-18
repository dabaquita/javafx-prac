package thenewboston;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

/**
 * ChoiceBoxDemo
 * Purpose: To demo the choicebox
 * drop down object
 *
 * @author Denielle Kirk Abaquita
 * @version 6/17/18 @ 10:12 AM
 */

public class ChoiceBoxDemo extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("ChoiceBox Demo");

        // Button
        Button button = new Button("Click Me");

        // ChoiceBox (Drop Down)
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        // getItems() returns the ObservableList object that you can use to add items
        choiceBox.getItems().addAll("Apples", "Bananas", "Mangoes");

        // Set the default value
        choiceBox.setValue("Apples");


        // Listen for selection changes
        choiceBox.getSelectionModel().selectedIndexProperty().addListener( (v, oldValue, newValue) -> System.out.println(newValue));


        // Handle the choice
        button.setOnAction(e -> getChoice(choiceBox));

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        // Setting up scene and stage
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Handles the data passed from the choiceBox
     * @param choiceBox - string drop down
     */
    private void getChoice(ChoiceBox<String> choiceBox)
    {
        String food = choiceBox.getValue();
        System.out.println(food);
    }

}
