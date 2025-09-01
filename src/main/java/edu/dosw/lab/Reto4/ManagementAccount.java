package edu.dosw.lab.Reto4;

import java.util.*;

public class ManagementAccount {
    private ValidateAccount ValidateRegister;
    private Random random;

    public ManagementAccount() {
        random = new Random();
    }

    public Account createAccount(String name) {
        String number = "";
        List<String> initials = Arrays.asList("01", "02");
        number += initials.get(random.nextInt(2));
        for (int i = 0; i < 8; i++) {
            String numberAccount = Integer.toString(random.nextInt(10));
            number += numberAccount;
        }
        return new Account(name, number);
    }

}