

public class BankAccount {

  private int accountNumber;
  private int pin;
  private Stringname;
  private double currentBalance;

  public BankAccount(int accountNumber, int pin, String name, double initialBalance) {
    this.accountNumber = accountNumber;
    this.pin = pin;
    this.name = name;
    this.currentBalance = initialBalance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public boolean validatePin(int inputPin) {
    return this.pin == inputPin;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      currentBalance += amount;
      System.out.println("Succesfully deposited $" + amount);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= currentBalance) {
      currentBalance -= amount;
      System.out.println("Succesfully withdrew $" + amount);
    } else if (amount > currentBalance) {
      System.out.println("Insufficient funds for this withdrawal.");
    } else {
      System.out.println("Invalid withdrawal amount.");
    }
  }

  public void checkBalance() {
    System.out.println("Current Balance: $" + currentBalance);

  }
}














    
