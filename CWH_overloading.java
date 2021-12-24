package com.company;

public class CWH_overloading {
    static void foo(){
        System.out.println("Hi, Good Morning");
    }
    static void foo(String a){
        System.out.println("Good Morning " + a);
    }
    static void change(int a){
        a = 29;
    }
    static void changeArray(int [] arr){
        arr[0] = 45;
    }
    static void tellJoke(){
        System.out.println("Hi, I am Prime Minster of the India.....");
    }
    public static void main(String[] args) {
        // void is nothing return from the function/method.
        // tellJoke();

        /* Case 1: Changing the Integer
         int x = 23;
         change(x);
         System.out.println("The value of x after running change -->" + x);
         */

        /* Case 2: Changing the Array
        int [] marks = {34, 56, 45, 50, 44};
        changeArray(marks);
        System.out.println("The value of 1st element of marks is --> " + marks[0]);
         */

        // Method Overloading --> you can't change the datatype/return of the function to make a new function of same name.
        foo();
        foo("Satyam");
        // Arguments are actual!
    }
}
