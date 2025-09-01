package edu.dosw.lab.testing;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import edu.dosw.lab.Reto4.Account;
import edu.dosw.lab.Reto4.BankifyFacade;
import edu.dosw.lab.Reto4.Customer;
import edu.dosw.lab.Reto4.ValidateAccount;
import edu.dosw.lab.Reto4.ManagementAccount;

public class TestReto4 {

    @Test
    public void shouldValidateAccount() {
        Customer customer = new Customer("Pedro");
        ValidateAccount validate = new ValidateAccount();
        Account account = customer.createAccount(customer.getName());
        String numberAccount = account.getNumberAccount();

        assertTrue(validate.validateAccount(numberAccount));
    }

    @Test
    public void shouldCreateAnAccount() {
        Customer customer = new Customer("Juan");
        Account account = customer.createAccount(customer.getName());
        assertEquals(customer.getBankifyFacade().getAccounts().get(0), account);
    }

    @Test
    public void shouldDoDeposit() {
        Customer customer = new Customer("Juan");
        Customer customer2 = new Customer("Pedro");
        Account account = customer.createAccount(customer.getName());
        account.setBalance(new BigDecimal(100.000));
        Account account2 = customer2.createAccount(customer2.getName());
        try {
            account.doMovement(new BigDecimal(50.000), account2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(new BigDecimal(50.000).toBigInteger(), account2.getBalance().toBigInteger());
        System.out.println("Hola");
        assertEquals(new BigDecimal(50.000).toBigInteger(), account.getBalance().toBigInteger());
    }

}