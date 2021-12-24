package com.company;
import java.util.Scanner;

public class CWH_ch4_ps {
    public static void main(String[] args) {
        /*
 Question 2:
        Scanner sc = new Scanner(System.in);
        byte m1, m2, m3;
        System.out.print("Enter your marks in Physics: ");
        m1 = sc.nextByte();
        System.out.print("Enter your marks in Chemistry: ");
        m2 = sc.nextByte();
        System.out.print("Enter your marks in Math: ");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You have been passed this class.");
        }
        else{
            System.out.println("You have been fail.");
        }
*/

        /*
 Question 3
        float tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre your income in Lakhs per year: ");
        float income = sc.nextFloat();
        if (income<=2.5f){
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5f && income<=10f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if (income>10f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Worker give the tax to the government is: " + tax);
*/

        /*
 Question 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        byte day = sc.nextByte();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input!!! Please enter correct input.");
        }
*/

        /*

        // Question 6
        Scanner sc = new Scanner(System.in);
        String web = sc.next();
        if (web.endsWith(".org")){
            System.out.println("It is a Organisation Website.");
        }
        else if (web.endsWith(".in")){
            System.out.println("It is a Indian Website.");
        }
        else if (web.endsWith(".com")){
            System.out.println("It is a Commercial Website");
        }
*/

        // Question 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year to check year is leap or not: ");
        int year = sc.nextInt();
        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.println(year + " is a leap year.");
                }
                else{
                    System.out.println(year + " is not a leap year.");
                }
            }
            else {
                System.out.println(year + " is a leap year.");
            }
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
