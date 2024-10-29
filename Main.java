//********************************
//Aaralyn Joseph
//Banking Application Assignment 
//Main class
//***********************************


//import scanner
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        //creating scanner
        Scanner scan = new Scanner(System.in);

        //referencing bank class
        Bank bank = new Bank();

        //intro to bank application
        System.out.println("Welcome to the Bank Application!");

        //asking users for their account number and pin
        System.out.print("Enter Account Number: ");
        int accountNumber = scan.nextInt();
        
        System.out.print("Enter PIN: ");
        int pin = scan.nextInt();

        //finding their bank account details referencing the BankAccount class
        BankAccount account = bank.findAccount(accountNumber, pin);

        if (account != null) {
            //if the user entered their login successfully, goes to options for transaction
            System.out.println("Login successful! Welcome, " + account.getAccountNumber());
            bank.performTransaction(account);
        } else {
            //if the user has invalid logins
            System.out.println("Login failed. Exiting application.");
        }
    }
}
