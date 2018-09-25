package Random.Random2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.control.*;

/**
 * Random2
 * Purpose: Screen testing with data
 * handling
 *
 * @author Denielle Kirk Abaquita
 * @version 7/1/18 @ 6:11 AM
 */

public class Random2 extends Application {

    private String username, password;
    private Stage loginWindow;

    public static void main(String[] args)
    {
        launch(args);
    }

    /** BEGINNING
     * Launches the starting screen
     */
    @Override
    public void start(Stage primaryStage)
    {
        // launch the welcome screen
        welcomeScreen(primaryStage);
    }

    /**
     * Launches and maintains a data
     */
    private void welcomeScreen(Stage welcomeWindow)
    {
        welcomeWindow.setTitle("Welcome");

        // Welcome label
        Label welcomeLabel = new Label("Welcome!");
        welcomeLabel.setId("welcome-title");

        // Continue button
        Button continueButton = new Button("Continue");
        continueButton.setOnAction( e ->                        // launches the login screen, closes welcome screen
        {
            welcomeWindow.close();
            loginScreen();
        });

        // Layout
        VBox welcomeRoot = new VBox(10);
        welcomeRoot.setPadding(new Insets(10, 10, 10, 10));
        welcomeRoot.setAlignment(Pos.CENTER);

        welcomeRoot.getChildren().addAll(welcomeLabel, continueButton);

        // Scene
        Scene welcomeScene = new Scene(welcomeRoot, 400, 500);
        welcomeScene.getStylesheets().add(Random2.class.getResource("R2Style.css").toExternalForm());

        welcomeWindow.setScene(welcomeScene);
        welcomeWindow.show();
    }

    /**
     * Launches and maintains a login screen
     */
    private void loginScreen()
    {
        loginWindow = new Stage();            // new window
        loginWindow.setTitle("Login");

        GridPane loginRoot = new GridPane();        // grid layout for components

        // Login label
        Label loginLabel = new Label("Login");
        GridPane.setConstraints(loginLabel, 0, 0);
        loginLabel.setId("login-title");

        // Username Label
        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 1);

        // Username Text Field
        TextField usernameText = new TextField();
        GridPane.setConstraints(usernameText, 1, 1);

        // Password Label
        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 2);

        // Password Field
        PasswordField passwordField = new PasswordField();
        GridPane.setConstraints(passwordField, 1, 2);

        // Login Button
        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 3);

        loginButton.setOnAction(e ->
        {
            password = passwordField.getText();
            username = usernameText.getText();

            dashboardScreen(username, password);
        });

        // Layout edits
        loginRoot.getChildren().addAll(loginLabel, usernameLabel, usernameText,
                passwordField, passwordLabel, loginButton);

        loginRoot.setVgap(10);
        loginRoot.setHgap(10);
        loginRoot.setAlignment(Pos.CENTER);

        // Scene
        Scene loginScene = new Scene(loginRoot, 400, 500);
        loginScene.getStylesheets().add(Random2.class.getResource("R2Style.css").toExternalForm());

        // Launching the screen
        loginWindow.setScene(loginScene);
        loginWindow.show();
    }

    /**
     * Launches the dashboard of the program
     */
    private void dashboardScreen(String username, String password)
    {
        Stage dashboardWindow = new Stage();
        dashboardWindow.setTitle("Dashboard");

        dashboardWindow.show();
    }

    private void checkLogin(String usernmae, String password)
    {

    }

}
