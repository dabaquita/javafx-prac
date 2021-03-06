package thenewboston;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.layout.StackPane;

import javafx.scene.control.Button;

public class Intro extends Application implements EventHandler<ActionEvent> {

    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello World");
        button = new Button("Click Me!");

        button.setOnAction(this);                   // this indicates usage of handle method in class

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 350);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    /** Method called whenever the user clicks a button */
    public void handle(ActionEvent event) {
        if (event.getSource() == button) {
            System.out.println("Hello World!");     // prints to console
        }
    }
}
