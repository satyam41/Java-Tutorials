package com.company;

public class CWH_33_varargs {
/*
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
*/
    static int add(int x, int ...arr){
        int sum = x;
        for (int a: arr){
            sum += a;
        }
        return sum;
    }
public static void main(String[] args) {
        System.out.println("The sum of 2 and 3 is: " + add(2, 3));
        System.out.println("The sum of 2, 3 and 4 is: " + add(2, 3, 4));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + add(2, 3, 4, 5));
    }
}
