package com.company;
import java.util.Scanner;

public class Ex1_percentageCalculator {
    public static void main(String[] args){
        /*
         Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects
         must be taken as input from the keyword. (Marks are out of 100).
        */
        System.out.println("Welcome to Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hindi marks: ");
        float mrk1 = sc.nextFloat();
        System.out.print("Enter English marks: ");
        float mrk2 = sc.nextFloat();
        System.out.print("Enter Maths marks: ");
        float mrk3 = sc.nextFloat();
        System.out.print("Enter Science marks: ");
        float mrk4 = sc.nextFloat();
        System.out.print("Enter SST marks: ");
        float mrk5 = sc.nextFloat();
        float sum = mrk1 + mrk2 + mrk3 + mrk4 + mrk5;
        float percentage = (sum/500)*100;
        System.out.print("Your percentage of the marks you gain: ");
        System.out.println(percentage);
    }
}
