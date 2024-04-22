import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        int accNumber = scanner.nextInt();

        System.out.println("Enter Initial Balance: ");
        double initBalance = scanner.nextDouble();

        System.out.println("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(accNumber, initBalance, interestRate);

        System.out.println("\nAccount Information:");
        savingsAccount.displayInfo();

        scanner.close();
    }
}
