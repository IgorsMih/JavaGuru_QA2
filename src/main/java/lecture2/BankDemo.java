package lecture2;

public class BankDemo {

    public static void main(String[] args) {
        Bank bankVariable = new Bank();
        bankVariable.checkBalance();
        bankVariable.deposit(10000);
        bankVariable.checkBalance();
        bankVariable.withdraw(800);
        bankVariable.checkBalance();
    }
}
