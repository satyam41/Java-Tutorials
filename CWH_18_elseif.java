package com.company;
import  java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You are become a Adult!!!");
            case 24 -> System.out.println("You are going to join a job!!!");
            case 60 -> System.out.println("You are going to retired!!!");
            default -> System.out.println("Enjoy your life.");
        }

        /*
        if-else-if-else ladder:

        if (age>50){
            System.out.println("You are ultra-experienced");
        }
        else if (age>40){
            System.out.println("You are semi-experienced");
        }
        else if (age>30){
            System.out.println("You are under-experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
*/

        // Switch Statement

    }
}
