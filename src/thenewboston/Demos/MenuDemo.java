package thenewboston.Demos;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;

import javafx.scene.control.*;

/**
 * MenuDemo
 * Purpose: Menu like at the top of
 * IntelliJ
 *
 * @author Denielle Kirk Abaquita
 * @version 6/24/18 @ 9:36 PM
 */

public class MenuDemo extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Menu Demo");


        // File menu
        Menu fileMenu = new Menu("File");

        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("Created new file but not rly"));       // Adding functionality to menu item

        fileMenu.getItems().add(newFile);

        fileMenu.getItems().addAll(new MenuItem("Open..."),
                                    new MenuItem("Save..."),
                                    new SeparatorMenuItem(),            // separator line
                                    new MenuItem("Settings..."),
                                    new SeparatorMenuItem(),            // separator line
                                    new MenuItem("Exit..."));

        // Edit menu
        Menu editMenu = new Menu("Edit");         // underscore is a shortcut
                                                        // within mac, option goes to file... why?
        editMenu.getItems().addAll(new MenuItem("Undo"),
                                new MenuItem("Copy"));

        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(e -> System.out.println("Pasting something but not rly"));
        paste.setDisable(true);                         // disables the paste button
        editMenu.getItems().add(paste);

        // Help menu
        Menu helpMenu = new Menu("Help");

        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e ->
        {
            if (showLines.isSelected())
                System.out.println("Program will display line numbers.");
            else
                System.out.println("Hiding line numbers.");
        });

        CheckMenuItem autoSave = new CheckMenuItem("Autosave");
        autoSave.setSelected(true);                     // selected by default

        helpMenu.getItems().addAll(showLines, autoSave);

        // Difficulty RadioMenuItems...selecting one menu at a time
        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");

        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);

        difficultyMenu.getItems().addAll(easy, medium, hard);

        // Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);

        // Layout
        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);

        // Scene
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
