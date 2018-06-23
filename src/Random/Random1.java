package Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

/**
 * Random1
 * Purpose: Experimenting with the
 * putting things like alert boxes
 * and layouts together.
 *
 * @author Denielle Kirk Abaquita
 * @version 6/23/18 @ 7:07 PM
 */

public class Random1 extends Application {

    private Label nameLabel;
    private Button submitButton;
    private Scene loginScreen, dataScene;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Login Screen");

        Label topLabel = new Label("Login for Some Fun");


    }

}
