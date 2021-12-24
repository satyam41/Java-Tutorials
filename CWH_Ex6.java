package com.company;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input!!!\nPlease try again.";
    }

    @Override
    public String getMessage() {
        return "Invalid Input";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "You cannot divide any number by 0.";
    }

    @Override
    public String getMessage() {
        return "Java arithmetic rule is disobey.";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "You cannot input greater than 100000.";
    }

    @Override
    public String getMessage() {
        return "This calculator is not able to calculate greater than 100000.";
    }
}

class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString() {
        return "You cannot multiply greater than 7000 number";
    }

    @Override
    public String getMessage() {
        return "Access Deny to multiply the number greater than 7000";
    }
}

public class CWH_Ex6 {
    public static int Addition(int x, int y){
        return x + y;
    }
    public static int Subtraction(int x, int y){
        return x - y;
    }
    public static int Multiplication(int x, int y){
        return x * y;
    }
    public static int Division(int x, int y) throws CannotDivideByZeroException{
        return x / y;
    }
    public static void main(String[] args) {
        /*
You have to create a custom calculator with following:
            1. + --> Addition
            1. - --> Subtraction
            1. * --> Multiplication
            1. / --> Division
Which throws the following exceptions:
     1. InvalidInputException
     2. CannotDivideByZeroException
     3. MaxInputException --> if any of the inputs is greater than 100000
     4. MaxMultiplierReachedException -> Don't allow any multiplication input to be greater than 7000
        */
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to World of calculator: ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("");

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
            try {
                System.out.print("Enter which operation you have to do: ");
                int userInput = sc.nextInt();
                if (userInput == 1) {
                    if (a>=100000 || b>=100000) {
                        try {
                            Addition(a, b);
                            throw new MaxInputException();
                        }
                        catch (MaxInputException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    else {
                        int add = Addition(a, b);
                        System.out.println("The result is: " + add);
                    }
                }
                else if (userInput == 2) {
                    if (a >= 100000 || b >= 100000){
                        try {
                            Subtraction(a, b);
                            throw new MaxInputException();
                        }
                        catch (MaxInputException e){
                            System.out.println(e);
                        }
                    }
                    else {
                        int sub = Subtraction(a, b);
                        System.out.println("The result is: " + sub);
                    }
                }
                else if (userInput == 3) {
                    if (a >= 100000 || b >= 100000) {
                        try {
                            Multiplication(a, b);
                            throw new MaxInputException();
                        }
                        catch (MaxInputException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    else if (a>=7000 || b>=7000) {
                            try {
                                Multiplication(a, b);
                                throw new MaxMultiplierReachedException();
                            }
                            catch (MaxMultiplierReachedException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        else {
                            int multi = Multiplication(a, b);
                            System.out.println(multi);
                        }
                }
                else if (userInput == 4) {
                    if (b == 0) {
                        try {
                            int div = Division(a, b);
                            System.out.println(div);
                            throw new CannotDivideByZeroException();
                        } catch (CannotDivideByZeroException | ArithmeticException e) {
                            System.out.println("Calculator is stop because you cannot " + e.getMessage());
                        }
                    }
                    else if (a>=100000 || b>=100000){
                        try {
                            Division(a, b);
                            throw new MaxInputException();
                        }
                        catch (MaxInputException e){
                            System.out.println(e);
                        }
                    }
                    else {
                        int div = Division(a, b);
                        System.out.println("The result is: " + div);
                    }
                }
                else {
                    throw new InvalidInputException();
                }
            } catch (InvalidInputException e) {
                System.out.println("Calculator is stop working due to " + e);
            } catch (CannotDivideByZeroException e) {
                System.out.println(e.getMessage());
            }
    }
}
