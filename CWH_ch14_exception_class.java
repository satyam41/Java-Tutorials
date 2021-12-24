package com.company;

import java.util.Scanner;

class MyException extends Exception{
    // we can write own custom exception

    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class CWH_ch14_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<20){
            try{
                //throw new MyException();
                throw new ArithmeticException("This is ArithmeticException");
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}
