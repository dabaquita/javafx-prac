package Random;

/**
 * Review
 * Purpose: To review stuff
 *
 * @author Denielle Kirk Abaquita
 * @version 9/24/18 @ 2:16 PM
 */

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;

import javafx.scene.control.*;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Review extends Application implements EventHandler<ActionEvent> {

    // Instance variable
    private Button welcomeButton;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // Variables
        Label label = new Label("Welcome!");
        welcomeButton = new Button("Start");
        Scene scene;
        VBox layout;

        // Sets title of the window
        primaryStage.setTitle("This is a Review!");

        // Ties an action to a button's click
        welcomeButton.setOnAction(this);

        // Specifying layout by adding button and positions
        layout = new VBox();
        layout.getChildren().addAll(label, welcomeButton);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(12);

        // Sets the scene and shows the scene based on layout
        scene = new Scene(layout, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Handles any action called from a variety of
     * specific listener objects
     * @param event - action from event
     */
    @Override
    public void handle(ActionEvent event)
    {
        if (event.getSource() == welcomeButton)
            System.out.println("Welcome!");
    }


}
