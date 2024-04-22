import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a sports field
        SportsField field = new SportsField("Field 1", "Soccer");

        // Get user input for renter's name, phone number, and rental duration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the renter's name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the renter's phone number: ");
        String customerPhone = scanner.nextLine();
        System.out.print("Enter the rental duration (in hours): ");
        int duration = scanner.nextInt();

        // Create a rental for the sports field
        Rental rental = new Rental(field, customerName, customerPhone, duration, 150000);

        // Print the details of the rental
        System.out.println(rental.getDetails());
    }
}