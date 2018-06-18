package thenewboston;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * GridPaneStuff
 * Purpose: Layout intro to grid
 *
 * @author Denielle Kirk Abaquita
 * @version 6/16/18 @ 8:55 AM
 */

public class GridPaneStuff extends Application {

    private Stage window;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("Hello World");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Name label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);

        // Name input
        TextField nameInput = new TextField("name");
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

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, logIn);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }

}
