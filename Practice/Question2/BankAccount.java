package Practice.Question2;

public class BankAccount {
    private double balance;

    public BankAccount(double openingBalance) {
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);
            System.out.println("Current amount"+balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void getBalance() {

        System.out.println("The current balance is:\t"+balance);
    }

    public void withdraw(double amount) {
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount Withdrawn:\t"+amount);
            System.out.println("The current balance is:\t"+balance);
        }else{
            System.out.println("Insufficient funds or Invalid Amount ");
        }

    }
}