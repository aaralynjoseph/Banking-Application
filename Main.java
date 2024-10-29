import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to the Bank Application!");

        System.out.print("Enter Account Number: ");
        int accountNumber = scan.nextInt();

        System.out.print("Enter PIN: ");
        int pin = scan.nextInt();

        BankAccount account = bank.findAccount(accountNumber, pin);

        if (account != null) {
            System.out.println("Login successful! Welcome, " + account.getAccountNumber());
            bank.performTransaction(account);
        } else {
            System.out.println("Login failed. Exiting application.");
        }
    }
}
