//********************************
//Aaralyn Joseph
//Banking Application Assignment 
//Bank class
//***********************************


//import scanner
import java.util.Scanner;

public class Bank {
    //array to store bank accounts
    private BankAccount[] accounts;
    private int accountCount;

    //constructor to initialize the bank with the sample accounts
    public Bank() {
        accounts = new BankAccount[10]; // Array to store up to 10 accounts
        accountCount = 0;

        //adding the predefined accounts
        accounts[accountCount++] = new BankAccount(1001, 1234, "John Doe", 500.00);
        accounts[accountCount++] = new BankAccount(1002, 2345, "Jane Smith", 1200.00);
        accounts[accountCount++] = new BankAccount(1003, 3456, "Alice Johnson", 850.00);
    }

    // method to find a BankAccount and validate the pin entered by user
    public BankAccount findAccount(int accountNumber, int pin) {
        for (int i = 0; i < accountCount; i++) {
            //checking account number and pin
            if (accounts[i].getAccountNumber() == accountNumber && accounts[i].validatePin(pin)) {
                return accounts[i]; //returning the account if it's found and the entered pin matches
            }
        }
        System.out.println("Invalid account number or PIN."); //output for if there is no account found based on user's input
        return null;
    }

    //method for transactions for a given account
    public void performTransaction(BankAccount account) {

        //creating scanner
        Scanner scan = new Scanner(System.in);

        boolean continueTransaction = true;

        //loop until the user chooses to exit, to choose which transaction/option they want to do
        while (continueTransaction) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int choice = scan.nextInt();
            switch (choice) {
                //to show the current balance in an account
                case 1:
                    account.checkBalance();
                    break;

                //to deposit how much money a user wants to deposit into their account
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scan.nextDouble();
                    account.deposit(depositAmount);
                    break;

                //to withdraw how much money a user wants to withdraw from their account
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scan.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                //to exit the transaction option menu
                case 4:
                    continueTransaction = false;
                    System.out.println("Thank you for banking with us!");
                    break;
                    
                //invalid choice output
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
