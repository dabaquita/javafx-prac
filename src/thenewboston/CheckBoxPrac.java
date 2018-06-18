package thenewboston;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * CheckBoxPrac
 * Purpose: Creating and handling
 * a checkbox within a window
 *
 * @author Denielle Kirk Abaquita
 * @version 6/16/18 @ 10:19 AM
 */

public class CheckBoxPrac extends Application {

    private Scene scene;
    private Button button;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception
    {
        window.setTitle("CheckBoxPrac Program");

        // Checkboxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);                         // checks the box by default


        // Button
        button = new Button("Order");
        button.setOnAction(e ->
        {;
            handleOptions(box1, box2);
        });

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, button);


        // Setting the scene
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    /**
     * handles the checkboxes
     * @param box1 - checkbox 1
     * @param box2 - checkbox 2
     */
    private void handleOptions(CheckBox box1, CheckBox box2)
    {
        String message = "User's order:\n";

        if (box1.isSelected())
            message += "Bacon";
        if (box2.isSelected())
            message += "Tuna";

        System.out.println(message);
    }

}
