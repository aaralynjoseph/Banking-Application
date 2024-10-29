
import java.util.Scanner;

public class Bank {
    private BankAccount[] accounts;
    private int accountCount;

    public Bank() {
        accounts = new BankAccount[10]; // Array to store up to 10 accounts
        accountCount = 0;

        // Adding initial accounts
        accounts[accountCount++] = new BankAccount(1001, 1234, "John Doe", 500.00);
        accounts[accountCount++] = new BankAccount(1002, 2345, "Jane Smith", 1200.00);
        accounts[accountCount++] = new BankAccount(1003, 3456, "Alice Johnson", 850.00);
    }

    public BankAccount findAccount(int accountNumber, int pin) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber && accounts[i].validatePin(pin)) {
                return accounts[i];
            }
        }
        System.out.println("Invalid account number or PIN.");
        return null;
    }

    public void performTransaction(BankAccount account) {
        Scanner scan = new Scanner(System.in);
        boolean continueTransaction = true;

        while (continueTransaction) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scan.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scan.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    continueTransaction = false;
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
