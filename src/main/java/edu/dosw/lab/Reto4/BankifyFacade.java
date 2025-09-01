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

    public String consultAccount(String numberAccount) {
        Account result = accounts.stream()
                .filter(a -> a.getNumberAccount().equals(numberAccount))
                .findFirst()
                .orElse(null);
        return result.consultAccount(numberAccount);
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
