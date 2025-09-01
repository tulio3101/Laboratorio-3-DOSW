package edu.dosw.lab.Reto4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BankifyFacade {
    private ManagementAccount managementAccount;
    private ArrayList<Account> accounts;

    public BankifyFacade() {
        accounts = new ArrayList<>();
        managementAccount = new ManagementAccount();
    }

    public Account createAccount(String name) {
        Account newAccount = managementAccount.createAccount(name);
        accounts.add(newAccount);
        return newAccount;
    }

    public String consultAccount(int numberAccount) {
        return "Hola";
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void doMovement(Account account, BigDecimal amount, String numberAccount) throws Exception {
        for (Account a : accounts) {
            if (a.getNumberAccount() == numberAccount) {
                Account newAccount = account;
                account.doMovement(amount, newAccount);
            }
        }
    }

}
