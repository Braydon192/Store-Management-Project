import java.util.Scanner;

// Tester class that creates objects from all subclasses
// and uses Scanner input to allow the user to build a VideoGame object.
public class StoreRunner {
    public static void main(String[] args) {

        // Example objects created using constructors (no Scanner needed)
        Console ps5 = new Console("PlayStation 5", 499.99, 12, "Sony", 825);
        Accessory headset = new Accessory("Wireless Headset", 79.99, 18, "Headset", true);

        // Print the hardcoded objects to show they work
        System.out.println(ps5);
        System.out.println(headset);

        // Scanner for user-created VideoGame (extra credit)
        Scanner input = new Scanner(System.in);

        System.out.println("\nCreate a new Video Game:");

        // Ask user for game title
        System.out.print("Enter game title: ");
        String title = input.nextLine();

        // Ask user for game price
        System.out.print("Enter price: ");
        double price = input.nextDouble();

        // Ask user for stock amount
        System.out.print("Enter stock amount: ");
        int stock = input.nextInt();
        input.nextLine(); // clears input buffer

        // Ask user for genre
        System.out.print("Enter genre: ");
        String genre = input.nextLine();

        // Ask user for platform
        System.out.print("Enter platform: ");
        String platform = input.nextLine();

        // Create the VideoGame object using user's input
        VideoGame userGame = new VideoGame(title, price, stock, genre, platform);

        // Print the object they created
        System.out.println("\nYou created:");
        System.out.println(userGame);

        // Always close Scanner when done
        input.close();
    }
}
