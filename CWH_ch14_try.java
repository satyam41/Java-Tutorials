package com.company;

public class CWH_ch14_try {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch (Exception e){
            System.out.print("We failed to divide the two number. Reason: because ");
            System.out.println(e);
        }
        System.out.println("End of the program.");
    }
}
