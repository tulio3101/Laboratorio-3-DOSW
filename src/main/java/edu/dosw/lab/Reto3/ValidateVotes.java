package edu.dosw.lab.Reto3;

import java.util.*;

public class ValidateVotes {
    private static Fibonacci fibonacci;

    public static boolean validateVotesFibonacci(int n, List<Integer> votes) {
        for (int vote : votes) {
            if (!Fibonacci.isValidVote(vote)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAmountVotes(List<Integer> votes){
        int firstVote = votes.get(0);
        for (int vote : votes) {
            if (vote != firstVote) {
                return false;
            }
        }
        return true;
    }
}