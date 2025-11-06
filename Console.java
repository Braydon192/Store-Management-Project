// Subclass of Product that represents a video game console.
// Inherits name, price, and stock from Product and adds console-specific details.
public class Console extends Product {

    // Extra instance variables that apply only to consoles
    private String brand;     // company that makes the console (Sony, Microsoft, etc.)
    private int storageGB;    // storage capacity in gigabytes

    // No-argument constructor
    // Creates a default console using the parent default product values.
    public Console() {
        super();            // calls Product() constructor
        brand = "Unknown";
        storageGB = 128;    // default storage size
    }

    // Constructor that sets name, price, and brand.
    // Uses super(name, price) to initialize inherited fields.
    public Console(String name, double price, String brand) {
        super(name, price); // passes values to Product constructor
        this.brand = brand;
        this.storageGB = 512; // default storage value if not specified
    }

    // Full constructor that sets all variables including inherited ones.
    // This is the most complete version of a Console object.
    public Console(String name, double price, int stock, String brand, int storageGB) {
        super(name, price, stock); // calls Product's full constructor
        this.brand = brand;
        this.storageGB = storageGB;
    }

    // Getter and setter methods for subclass-specific fields
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getStorageGB() { return storageGB; }
    public void setStorageGB(int storageGB) { this.storageGB = storageGB; }

    // Builds a formatted string showing console details.
    // Includes parent toString() so inherited fields are shown automatically.
    public String toString() {
        return "Console[" + super.toString() + ", brand=" + brand + ", storage=" + storageGB + "GB]";
    }
}
