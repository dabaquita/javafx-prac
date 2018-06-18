package thenewboston;

/**
 * EmbeddedLayouts
 * Purpose: Embedding multiple
 * styles of layouts
 *
 * @author Denielle Kirk Abaquita
 * @version 6/15/18 @ 8:45 PM
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.Button;

import java.util.Stack;

public class EmbeddedLayouts extends Application {

    private Stage window;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("Title");

        // NEVER USE HBOX FOR MENUS --- USE LIBRARIES
        HBox topMenu = new HBox();
        Button fButton = new Button("File");
        Button eButton = new Button("Edit");
        Button vButton = new Button("View");
        topMenu.getChildren().addAll(fButton, eButton, vButton);

        VBox leftMenu = new VBox();
        Button aButton = new Button("A");
        Button bButton = new Button("B");
        Button cButton = new Button("B");
        leftMenu.getChildren().addAll(aButton, bButton, cButton);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();
    }

}
