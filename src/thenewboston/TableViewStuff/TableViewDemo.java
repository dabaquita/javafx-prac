package thenewboston.TableViewStuff;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 * TableViewDemo
 * Purpose: Row and Column table
 * view demo
 *
 * @author Denielle Kirk Abaquita
 * @version 6/19/18 @ 4:40 PM
 */

public class TableViewDemo extends Application
{
    private TextField nameInput, priceInput, quantityInput;
    private TableView<Product> table;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("TableView Demo");

        /** Column Stuff */
        // Name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Price column
        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        // Quantity column
        TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        /** TextFields */
        // Name input
        nameInput = new TextField();
        nameInput.setPromptText("Enter Name Here");
        nameInput.setMinWidth(100);

        // Price input
        priceInput = new TextField();
        priceInput.setPromptText("Enter Price Here");

        // Quantity input
        quantityInput = new TextField();
        quantityInput.setPromptText("Enter Quantity Here");

        /** Buttons */
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());

        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());


        /** Table */
        // Table set up
        // has to have at least one column
        table = new TableView<>();
        table.setItems(getProduct());           // items used in the table
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        /** Layout */
        // Hbox set up
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);

        // Vbox set up
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.getChildren().addAll(table, hBox);

        // Scene and stage set up
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * Gets all of the products (similar to looking at a file or database)
     * @return list of products
     */
    public ObservableList<Product> getProduct()
    {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.addAll(new Product("Laptop", 500, 20),
                        new Product("Mouse", 50, 30),
                        new Product("Lamp", 69, 40),
                        new Product("Sunglasses", 250, 10));

        return  products;
    }

    /**
     * Adds a new row with name, price, and quantity
     */
    public void addButtonClicked()
    {
        Product product = new Product();

        // Data basic validation and insertion
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(quantityInput.getText()));

        table.getItems().add(product);          // adds the new product into the table

        // Clear all input fields
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    /**
     * Removes the specified product from the table
     */
    public void deleteButtonClicked()
    {
        ObservableList<Product> productSelected, allProducts;
;
        allProducts = table.getItems();                                     // all the products in the table
        productSelected = table.getSelectionModel().getSelectedItems();     // any product that is selected

        productSelected.forEach(allProducts::remove);                       // removes specified product from table
        // try and catch statement can inform user if item is nonexistent
    }
}
