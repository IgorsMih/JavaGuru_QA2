package lecture2;

public class Bank {

    private int bankBalance = 500;

    public void deposit(int amount) {
        if (amount >= 10000) {
            System.out.println("ERROR - Need to register sum in VID");
        } else {
            bankBalance = bankBalance + amount;
            System.out.println("You have deposited " + amount + " euros");
        }
    }

    public void withdraw(int amount) {
        if (amount > 700) {
            System.out.println("ERROR - daily limit exceeded");
        } else if (bankBalance - amount < 0) {
            System.out.println("ERROR - You don't have enough money");
        } else bankBalance = bankBalance + amount;
    }

    public void checkBalance() {
        System.out.println("You have " + bankBalance + " euros on your bank account");
    }

}
