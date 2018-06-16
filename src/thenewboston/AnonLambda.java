package thenewboston;

/**
 * AnonLambda
 * Purpose: Anonymous Inner Class / Lambda Expressions
 *
 * @author Denielle Kirk Abaquita
 * @version 6/14/18 @ 7:05 PM
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Button;

public class AnonLambda extends Application {

    private Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Hello World");
        button = new Button("Click Me!");

        // This class will handle all button events - ANONYMOUS INNER CLASS
        // You don't have to add an event source using this method :)
        /*button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });*/

        // LAMBDA EXPRESSION
        button.setOnAction(e -> System.out.println("Hello"));
        //button.setOnAction(e -> AlertBox.display("You dun messed up", "Whoa"));
        /*button.setOnAction(e ->
        {
            boolean result = ConfirmBox.display("You dun messed up", "You sure?");
            System.out.println(result);
        });*/

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
