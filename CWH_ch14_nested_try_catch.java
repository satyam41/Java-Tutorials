package com.company;

import java.util.Scanner;

public class CWH_ch14_nested_try_catch {
    public static void main(String[] args) {
        int[] mraks = new int[3];
        mraks[0] = 12;
        mraks[1] = 15;
        mraks[2] = 22;

        System.out.print("Enter the value index present in the array: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        try {
            System.out.println("Welcome to video number 82.");
            try {
                System.out.println(mraks[i]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Exception level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception level 1");
        }
    }
}
