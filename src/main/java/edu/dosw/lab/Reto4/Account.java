package edu.dosw.lab.Reto4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Account {
    private String name;
    private BigDecimal balance;
    private String numberAccount;

    private ArrayList<Movement> movements;

    public Account() {
    }

    public Account(String name, String numberAccount) {
        this.name = name;
        this.numberAccount = numberAccount;
        movements = new ArrayList<>();
        balance = new BigDecimal(0);
    }

    public String getName() {
        return name;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void consultAccount(int numberAccount) {

    }

    public void doMovement(BigDecimal amount, Account destination) throws Exception {
        Movement movement = new Movement();
        movements.add(movement);
        movement.doMovement(this, amount, destination);
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
