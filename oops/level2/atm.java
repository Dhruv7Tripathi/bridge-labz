package oops.level2;

public class atm {
  private String accountHolder;
  private String accountNumber;
  private double balance;

  public atm(String accountHolder, String accountNumber, double initialBalance) {
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
    } else {
      System.out.println("Insufficient balance or invalid amount.");
    }
  }

  public void displayBalance() {
    System.out.println("Current Balance: " + balance);
  }
}
