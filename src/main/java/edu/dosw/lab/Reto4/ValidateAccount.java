package edu.dosw.lab.Reto4;

public class ValidateAccount {
    public boolean validateAccount(String numberAccount) {
        return numberAccount.startsWith("01") || numberAccount.startsWith("02");
    }
}
