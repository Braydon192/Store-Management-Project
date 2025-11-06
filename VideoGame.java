// Subclass of Product that represents a video game.
// Inherits name, price, and stock from Product and adds game-specific details.
public class VideoGame extends Product {

    // Extra instance variables only for video games
    private String genre;      // type of game (Action, Sports, RPG, etc.)
    private String platform;   // system it runs on (PS5, Xbox, PC, etc.)

    // No-argument constructor
    // Creates a basic video game with default values.
    public VideoGame() {
        super();              // calls Product() constructor
        genre = "Action";
        platform = "Multi-platform";
    }

    // Constructor that sets name, price, and platform.
    // Genre is assigned a default value if not specified.
    public VideoGame(String name, double price, String platform) {
        super(name, price);   // passes name and price to Product
        this.platform = platform;
        this.genre = "Adventure"; // default genre
    }

    // Full constructor that sets all inherited and subclass fields.
    public VideoGame(String name, double price, int stock, String genre, String platform) {
        super(name, price, stock); // calls Product's full constructor
        this.genre = genre;
        this.platform = platform;
    }

    // Getter and setter methods for new variables
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    // Builds a formatted string showing game details.
    // Uses parent toString() to show the shared fields.
    public String toString() {
        return "VideoGame[" + super.toString() + ", genre=" + genre + ", platform=" + platform + "]";
    }
}
