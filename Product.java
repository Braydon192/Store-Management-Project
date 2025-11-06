// Superclass that represents a general product sold in the store.
// This class is extended by more specific product types like Console, VideoGame, and Accessory.
public class Product {

    // Shared instance variables that all products have in common.
    // Subclasses will also inherit these.
    private String name;     // name of the product
    private double price;    // price in dollars
    private int stock;       // how many are available in the store

    // No-argument constructor
    // Creates a default product when no information is provided.
    public Product() {
        name = "Unnamed Product";
        price = 0.0;
        stock = 0;
    }

    // Constructor that sets name and price, but leaves stock at 0.
    // Useful when the item has a set cost but hasn't been stocked yet.
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.stock = 0;
    }

    // Full constructor that sets all instance variables.
    // Used when all product data is known at creation time.
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter and setter methods allow controlled access
    // to private instance variables from outside the class.
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Method that decreases stock if enough items are available.
    // Returns true if successful, false if not enough stock.
    public boolean sell(int amount) {
        if (amount > 0 && amount <= stock) {
            stock -= amount;
            return true;
        }
        return false;
    }

    // Returns a formatted String that displays product information.
    // Subclasses will reuse this by calling super.toString().
    public String toString() {
        return "Product[name=" + name + ", price=$" + price + ", stock=" + stock + "]";
    }
}
