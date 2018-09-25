package thenewboston.Styling;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * CSSStylingDemo
 * Purpose: Incorporating themes
 * and styles in a program
 *
 * @author Denielle Kirk Abaquita
 * @version 6/25/18 @ 11:36 AM
 */

public class CSSStylingDemo extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("CSS Themes and Styling");

        // GridPane with padding
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Name label - constraints use (child, column, row)
        Label nameLabel = new Label("Username:");
        //nameLabel.setStyle("-fx-text-fill: e8e8e8");                        // in-line styling
        nameLabel.setId("bold-label");                                        // sets an id
        GridPane.setConstraints(nameLabel, 0, 0);

        // Name input
        TextField nameInput = new TextField();
        nameInput.setPromptText("Name");
        GridPane.setConstraints(nameInput, 1, 0);

        // Password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);

        // Password input
        TextField passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1, 1);

        // Login button
        Button logIn = new Button("Log In");
        GridPane.setConstraints(logIn, 1, 2);

        // Sign up button
        Button signUp = new Button("Sign Up");
        signUp.getStyleClass().add("button-blue");
        GridPane.setConstraints(signUp, 1, 3);


        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, logIn, signUp);

        Scene scene = new Scene(grid, 300, 200);
        scene.getStylesheets().add(CSSStylingDemo.class.getResource("Viper.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
