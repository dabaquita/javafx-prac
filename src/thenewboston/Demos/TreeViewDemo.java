package thenewboston.Demos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * TreeViewDemo
 * Purpose: Special type of list,
 * taking list items and arranging them
 * into a hierarchy
 *
 * @author Denielle Kirk Abaquita
 * @version 6/18/18 @ 2:28 PM
 */

public class TreeViewDemo extends Application {

    private TreeView<String> treeView;


    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("TreeView Demo");

        TreeItem<String> root, man, woman;

        // Set up for root
        root = new TreeItem<>();                // container for branches (man, woman)
        root.setExpanded(true);                 // list expanded by default

        // Man branch
        man = makeBranch("man", root);
        makeBranch("Bob", man);

        // Woman branch
        woman = makeBranch("woman", root);
        makeBranch("Briana", woman);

        // Create tree
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);            // don't show the root bc not needed

        // Lambda to print out selected
        treeView.getSelectionModel().selectedItemProperty()
                .addListener( (v, oldValue, newValue) -> {

                    if (newValue != null) System.out.println( newValue.getValue() );

                });

        // Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(treeView);

        // Scene and stage
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Creating a branch based on root
     * @param name - name of the branch
     * @param parent - parent of the branch
     */
    public TreeItem<String> makeBranch(String name, TreeItem<String> parent)
    {
        TreeItem<String> item = new TreeItem<>(name);       // new list item
        item.setExpanded(true);                             // list expanded by default

        parent.getChildren().add(item);
        return item;                                        // return the branch
    }


}
