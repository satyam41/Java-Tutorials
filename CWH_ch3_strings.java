package com.company;
import java.util.Scanner;

public class CWH_ch3_strings {
    public static void main(String[] args) {
        String name = new String("Satyam");
        // System.out.println(name); //String is immutable same as python.

        int a = 23;
        float b = 3.23212f;
        /*
         %d for int
         %f for float
         %c for char
         %s for string
         */
         System.out.printf("The value of a is %d and the value of b is %3.2f", a, b);
         //System.out.format("The value of a is %d and the value of b is %f", a, b);


        Scanner sc = new Scanner(System.in);
        //String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);
    }
}
