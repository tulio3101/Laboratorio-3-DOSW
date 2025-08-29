package edu.dosw.lab.Reto3;

public class Fibonacci{
    public static int calculateFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);

    }
}