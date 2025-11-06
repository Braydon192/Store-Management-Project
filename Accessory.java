// Subclass of Product that represents a gaming accessory.
// Inherits name, price, and stock from Product and adds accessory-specific details.
public class Accessory extends Product {

    // Extra instance variables only for accessories
    private String type;        // what kind of accessory (Controller, Headset, etc.)
    private boolean wireless;   // true if the accessory is wireless

    // No-argument constructor
    // Creates a basic accessory with default values.
    public Accessory() {
        super();               // calls Product() default constructor
        type = "Generic";
        wireless = false;
    }

    // Constructor that sets name, price, and type.
    // Wireless defaults to false if not specified.
    public Accessory(String name, double price, String type) {
        super(name, price);    // initializes inherited fields
        this.type = type;
        this.wireless = false;
    }

    // Full constructor that sets all inherited and accessory fields.
    public Accessory(String name, double price, int stock, String type, boolean wireless) {
        super(name, price, stock); // passes values to Product constructor
        this.type = type;
        this.wireless = wireless;
    }

    // Getter and setter methods for the new variables
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean isWireless() { return wireless; }
    public void setWireless(boolean wireless) { this.wireless = wireless; }

    // Builds a formatted string showing accessory details.
    // Includes parent toString() to show name, price, and stock.
    public String toString() {
        return "Accessory[" + super.toString() + ", type=" + type + ", wireless=" + wireless + "]";
    }
}
