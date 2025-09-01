package edu.dosw.lab.Reto4;

import java.util.ArrayList;

import java.math.BigDecimal;

public class Movement {
    private ValidateAccount validate;

    public Movement() {
        validate = new ValidateAccount();
    }

    public void doMovement(Account account, BigDecimal amount, Account destination) throws Exception {
        if (validate.validateAccount(destination.getNumberAccount())) {
            account.setBalance(account.getBalance().subtract(amount));
            destination.setBalance(destination.getBalance().add(amount));
        } else {
            throw new Exception("Numero De Cuenta Invalido.");
        }
    }
}
