package thenewboston;

/**
 * ConfirmBox
 * Purpose: An alert box but
 * with the purpose of interacting
 * with the other window
 *
 * @author Denielle Kirk Abaquita
 * @version 6/15/18 @ 7:56 PM
 */

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {

    private static boolean answer;

    /**
     * Displays the alert window
     * @param title - title on window
     * @param message - message to be conveyed
     */
    public static boolean display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label(message);

        // Create two buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e ->
        {
            answer = true;
            window.close();
        });

        noButton.setOnAction(e ->
        {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }

}

