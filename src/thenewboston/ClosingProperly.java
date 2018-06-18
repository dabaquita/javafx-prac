package thenewboston;

/**
 * ClosingProperly
 * Purpose: Execute lines of
 * code before exiting the program.
 *
 * @author Denielle Kirk Abaquita
 * @version 6/15/18 @ 8:22 PM
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Button;

public class ClosingProperly extends Application {

    Stage window;
    Button button;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("Title Here");

        // gets called whenever user requests to close window & WILL CLOSE by default
        window.setOnCloseRequest(e ->
                {
                    e.consume();                    // takes close event and "consumes" it (bypasses it)
                    closeProgram();
                });

        button = new Button("Close Program");
        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().addAll(layout, button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    /**
     * Closes the program after executing code
     * PLACE ANY CODE HERE AND THEN CLOSES WINDOW :)
     */
    private void closeProgram()
    {
        /*System.out.println("File is saved.");
        window.close();*/

        // Makes certain that the user wants to exit
        boolean answer = ConfirmBox.display("Title", "Are you sure you want to exit?");
        if (answer) window.close();
    }

}
