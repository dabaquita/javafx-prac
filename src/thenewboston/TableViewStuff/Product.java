package thenewboston.TableViewStuff;

/**
 * Product
 *
 * @author Denielle Kirk Abaquita
 * @version 6/19/18 @ 8:11 PM
 */

public class Product {

    // Instance variables
    private String name;
    private double price;
    private int quantity;

    /** Constructors */
    public Product()
    {
        name = "";
        price = 0;
        quantity = 0;
    }

    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
