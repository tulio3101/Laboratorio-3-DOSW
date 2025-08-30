package edu.dosw.lab.Reto3;

import java.util.*;

public class ValidateVotes {
    private static Fibonacci fibonacci;

    public static boolean validateVotesFibonacci(int n, List<Integer> votes) {
        for (int vote : votes) {
            if (vote == fibonacci.calculateFibonacci(n)) {
                return true;
            }
        }
        return false;
    }
}