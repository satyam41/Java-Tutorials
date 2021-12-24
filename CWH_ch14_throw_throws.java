package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative.";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!!!";
    }
}

public class CWH_ch14_throw_throws {
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static double area(float radius) throws NegativeRadiusException{
        if (radius<0){
            throw new NegativeRadiusException();
        }
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        // throws keyword declare the exception
        // throw keyword the throw keyword
        try {
//            int a = divide(2, 0);
//            System.out.println(a);
            float ar = (float) area(-2);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception occurred!!!");
        }

    }
}
