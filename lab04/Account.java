package lab04;

public class Account {
    private int number;
    private double balance;

    public Account(int number){
        this.number = number;
        this.balance=0.0;
    }
    public Account(int number, double balance){
        this.number = number;
        this.balance=balance;
    }

    /**Returns the number */
    public int getNumber() { return this.number; }
    /**Returns the balance */
    public double getBalance() { return this.balance; }
    /**Returns a string description of this instance */
    public String toString() {
        return  String.format("Account[number=%d,balance=$%.2f]", number, balance);
    }
    /**Add the given amount to the balance */
    public void credit(double amount) { balance += amount; }

    /** Subtract the given amount from balance,if balance >= amount */
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }else {
            System.out.println("amount exceeded");
        }
    }
    /**Transfer the given amount to Account another,if balance >= amount */
    public void transferTo(double amount, Account another) {
        if (balance >= amount) {
            this.balance -= amount;
            another.balance += amount;
        }else {
            System.out.println("amount exceeded");
        }
    }
}
