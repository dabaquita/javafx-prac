package Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Random1
 * Purpose: Experimenting with the
 * putting things like alert boxes
 * and layouts together.
 *
 * Edit - an instance of a login
 * screen set up that passes
 * data to another scene object
 *
 * @author Denielle Kirk Abaquita
 * @version 6/23/18 @ 7:07 PM
 */

public class Random1 extends Application {

    private Stage window;
    private Scene loginScene, dataScene;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("Login Screen");
        

        // Title label
        Label topLabel = new Label("Login for Some Fun");
        GridPane.setConstraints(topLabel, 0, 0);                // set constraints

        // Username
        Label usernameLabel = new Label("Username:");
        TextField usernameTextField = new TextField();
        usernameTextField.setPromptText("TheSyndicateProject");                      // default text
        
        GridPane.setConstraints(usernameLabel, 1, 1);           // set constraints
        GridPane.setConstraints(usernameTextField, 2, 1);

        // Password
        Label passwordLabel = new Label("Password:");
        PasswordField passwordTextField = new PasswordField();
        
        GridPane.setConstraints(passwordLabel, 1, 2);           // set constraints
        GridPane.setConstraints(passwordTextField, 2, 2);

        // Button and use information from inputs
        Button logButton = new Button("Log In");
        logButton.setOnAction( e ->
        {
            // Initialize the 2nd scene that shows the data from log in
            initDataScene(usernameTextField, passwordTextField);

            window.setScene(dataScene);
        });
        GridPane.setConstraints(logButton, 1, 3);

        // Layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        
        gridPane.getChildren().addAll(topLabel, usernameLabel, usernameTextField,   // adds all scene components
                                    passwordLabel, passwordTextField, logButton);

        // Login Scene
        loginScene = new Scene(gridPane, 400, 300);
        window.setScene(loginScene);
        window.show();
    }

    /**
     * Initializes the 2nd scene
     * @param usernameTextField - holds the username
     * @param passwordTextField - holds the password
     */
    private void initDataScene(TextField usernameTextField, TextField passwordTextField)
    {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        Label username = new Label(usernameTextField.getText());
        GridPane.setConstraints(username, 1, 1);

        Label password = new Label(passwordTextField.getText());
        GridPane.setConstraints(password, 1, 2);

        Button backButton = new Button("Back");
        backButton.setOnAction(e -> window.setScene(loginScene));       // function: head back to previous
        GridPane.setConstraints(backButton, 0, 0);

        gridPane.getChildren().addAll(username, password, backButton);

        dataScene = new Scene(gridPane, 400, 300);
    }


}
