//********************************
//Aaralyn Joseph
//Banking Application Assignment 
//BankAccount class
//***********************************

public class BankAccount {
  //creating and defining the accountNumber, pin, name, and currentBalance variables
  private int accountNumber;
  private int pin;
  private String name;
  private double currentBalance;

  //constructor to initialize a new BankAccount object
  public BankAccount(int accountNumber, int pin, String name, double initialBalance) {
    this.accountNumber = accountNumber;
    this.pin = pin;
    this.name = name;
    this.currentBalance = initialBalance;
  }

  //getter for the account number
  public int getAccountNumber() {
    return accountNumber;
  }

  //method to validate an entered pin
  public boolean validatePin(int inputPin) {
    return this.pin == inputPin;
  }

  //method to deposit money into the account
  public void deposit(double amount) {
    //making sure the amount entered by the user is a valid deposit amount
    if (amount > 0) {
      currentBalance += amount;
      System.out.println("Succesfully deposited $" + amount);
    //output for if the amount entered by the user to deposit is not a valid amount
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }
  
  //method to withdraw money from the account
  public void withdraw(double amount) {
    //making sure there is enough money in the account to withdraw how much the user wants to
    if (amount > 0 && amount <= currentBalance) {
      currentBalance -= amount;
      System.out.println("Succesfully withdrew $" + amount);
    //output for if there isn't enough money for requested withdrawal
    } else if (amount > currentBalance) {
      System.out.println("Insufficient funds for this withdrawal.");
    //output for an invalid input by user
    } else {
      System.out.println("Invalid withdrawal amount.");
    }
  }

  //method to print the current balance of the account
  public void checkBalance() {
    System.out.println("Current Balance: $" + currentBalance);

  }
}














    
