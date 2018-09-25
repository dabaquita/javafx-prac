package thenewboston.Demos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;

/**
 * ListViewDemo
 * Purpose: Demonstrates the
 * ListView object in a Stage setting
 *
 * @author Denielle Kirk Abaquita
 * @version 6/18/18 @ 2:13 PM
 */

public class ListViewDemo extends Application {

    private ListView<String> listView;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("ListView Demo");

        Button button = new Button("Submit");

        // ListView
        listView = new ListView<>();
        listView.getItems().addAll("Iron Man", "Batman");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);      // allows for multiple selection

        button.setOnAction(e -> buttonClicked());

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);

        // Scene and Stage
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Handles the event of the "Submit" button being clicked
     */
    public void buttonClicked()
    {
        String message = "";
        ObservableList<String> movies;

        movies = listView.getSelectionModel().getSelectedItems();       // holds all items selected

        for (String movie: movies)
        {
            message += movie + "\n";
        }

        System.out.println(message);
    }

}
