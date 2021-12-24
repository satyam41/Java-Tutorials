package com.company;

import java.util.Scanner;

public class CWH_ch14_handling_specific_exception {
    public static void main(String[] args) {
        int[] mraks = new int[3];
        mraks[0] = 12;
        mraks[1] = 15;
        mraks[2] = 22;

        System.out.print("Enter the value index present in the array: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.print("Enter the number which you have to divide: ");
        int num = sc.nextInt();

        try{
            System.out.println("At the index the value present in the array is: " + mraks[i]);
            System.out.println("After the divide the original value of that index is: " + mraks[i]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred!!!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred!!!");
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException occurred!!!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception has occurred!!!");
            System.out.println(e);
        }
    }
}
