class Bank {
  private String acntHolderName;
  private int acntNumber;
  private double balance;
  private int pin;

  public void setAcntHolderName(String name) {
    acntHolderName = name;
  }

  public String getAcntHolderName() {
    return acntHolderName;
  }

  public int getAcntNumber() {
    return acntNumber;
  }

  public void setPin(int pin) {
    this.pin = pin;
  }

  public double getBalance(int pass) {

    if (pass == pin) {
      return balance;
    } else {
      System.out.println("Access denied");
      return -1;
    }
  }

  public double deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit Successful");
    } else {
      System.out.println("Deposit is Invalid");
    }
    return balance;
  }

  public double withDraw(double amount, int pass) {

    if (pass != pin) {
      System.out.println("Invalid pin");
    } else if (amount <= 0) {
      System.out.println("Invalid withdrawal");
    } else if (amount > balance) {
      System.out.println("Insufficient Balance");
    } else {
      balance -= amount;

    }
    return balance;
  }

  Bank(String name, int number, int pass, double bal) {
    this.acntHolderName = name;
    this.acntNumber = number;
    this.pin = pass;
    this.balance = bal;
  }
}

public class BankAccount {
  public static void main(String[] args) {
    Bank b = new Bank("nani", 1234567899, 2424, 90000);
    System.out.println("Account Holder's Name:- " + b.getAcntHolderName());
    System.out.println("Account Number:- " + b.getAcntNumber());
    System.out.println("balance :- " + b.getBalance(2124));
    System.out.println("balance :- " + b.getBalance(2424));
    b.setPin(2323);
    System.out.println("balance :- " + b.getBalance(2323));
    System.out.println("balance :- " + b.getBalance(2424));
    b.deposit(-12);
    System.out.println(b.deposit(12));
    System.out.println(b.withDraw(2000, 2323));

  }
}
