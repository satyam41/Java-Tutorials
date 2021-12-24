package com.company;
import  java.util.Scanner;

public class CWH_05_taking_input {
    public static void main(String[] args){
        System.out.println("Taking Input from User: ");

        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        float a = sc.nextFloat();

        int b = sc.nextInt();
        float b = sc.nextFloat();
        int sum = a + b;
        float sum = a + b;
        System.out.println("The sum of these number is:");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.print(b1);
 */
//        String str = sc.next(); // it reads only one word.
        String str = sc.nextLine(); // it read a whole sentence.
        System.out.println(str);
    }
}
