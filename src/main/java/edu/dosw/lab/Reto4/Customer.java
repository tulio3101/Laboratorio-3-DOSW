package edu.dosw.lab.Reto4;

import java.math.BigDecimal;

public class Customer {
    private String name;
    private BankifyFacade bankifyFacade;
    private Account account;

    public Customer(String name) {
        this.name = name;
        bankifyFacade = new BankifyFacade();
    }

    public Account createAccount(String name) {
        return bankifyFacade.createAccount(name);
    }

    public void doMovement(Account account, BigDecimal amount, String numberAccount) {
        try {
            bankifyFacade.doMovement(account, amount, numberAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String consultAccount(int numberAccount) {
        return bankifyFacade.consultAccount(numberAccount);
    }

    // GET
    public String getName() {
        return name;

    }

    public BankifyFacade getBankifyFacade() {
        return bankifyFacade;
    }

    // SET
    public void setName(String name) {
        this.name = name;
    }

}