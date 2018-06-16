package thenewboston;

/**
 * AlertBox
 * Purpose: Self-explanatory window
 *
 * @author Denielle Kirk Abaquita
 * @version 6/15/18 @ 6:32 PM
 */

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {

    /**
     * Displays the alert window
     * @param title - title on window
     * @param message - message to be conveyed
     */
    public static void display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);    // block other window interactions until
        window.setTitle(title);                             // this window is taken care of
        window.setMinWidth(250);

        Label label = new Label(message);
        Button closeButton = new Button("Close the Window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);    // adds components to layout
        layout.setAlignment(Pos.CENTER);                    // center aligned

        // new scene with the made layout and now display
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();                   // displays window and waits to be closed
    }

}
