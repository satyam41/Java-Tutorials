package com.company;

public class CWH_ch5_break_continue_statement {
    public static void main(String[] args) {
        // Break and continue works with all loops.
        for (int i=0; i<5; i++){
            if (i==3){
                System.out.println("Hi, Here is continue.");
                continue;
            }
            System.out.println(i);
            System.out.println("Java");
        }

        int i = 0;
        do {
            i++;
            if (i==2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println("JAva");
            System.out.println(i);
        }while (i<5);
    }
}
