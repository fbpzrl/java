package _07_Construtores_This_Sobrecarga_Encapsulamento.entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        balance = initialDeposit;
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
            balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f\n", balance);
    }
}
