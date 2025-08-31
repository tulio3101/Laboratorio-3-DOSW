package edu.dosw.lab.Reto3;

public class Fibonacci{
    private static int[] validVotes = {1, 2, 3, 5, 8, 13};
    public int calculateFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }

    public static boolean isValidVote(int vote) {
        for (int v : validVotes) {
            if (vote == v) {
                return true;
            }
        }
        return false;
    }
}