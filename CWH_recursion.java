package com.company;

public class CWH_recursion {
    static int factorial(int n){
        //factorial(n) = n * n-1 * ....1
        // factorial(0) = 1
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int fibonacci(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
//        int n = 5;
//        System.out.println("The value of factorial n is: " + factorial(n));
        System.out.println(factorial(10));
    }
}
