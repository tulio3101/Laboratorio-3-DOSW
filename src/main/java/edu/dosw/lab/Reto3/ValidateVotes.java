package edu.dosw.lab.Reto3;
import java.util.*;

public class ValidateVotes {
    List<Integer> votes = new ArrayList<>();
    private Fibonacci fibonacci;
    public boolean validateVotesFibonacci(int n){
        for(int vote : votes){
            if(vote ==  fibonacci.calculateFibonacci(n)){
                return true;
            }
        }
        return false;
    }
}