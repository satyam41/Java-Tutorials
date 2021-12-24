package com.company;

import java.util.Scanner;

public class CWH_ch14_ps {
    public static int cal(int a, int b){

        int c = a / b;
        return c;
    }
    public static void main(String[] args) {
        // Question 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        try {
            int d = cal(a,b);
            System.out.println(d);
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
    }
}
