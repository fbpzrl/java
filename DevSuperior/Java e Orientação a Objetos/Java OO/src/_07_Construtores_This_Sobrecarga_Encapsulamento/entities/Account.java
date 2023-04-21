package _07_Construtores_This_Sobrecarga_Encapsulamento.entities;

public class Account {

    private int number;
    private String holder;

    private double balance;
    private double initialDeposit;

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

    
}
