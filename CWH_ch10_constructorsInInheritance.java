package com.company;

import javax.swing.text.AsyncBoxView;

class Base1{
    Base1(){
        System.out.println("I am a constructor.");
    }
    Base1(int x){
        System.out.println("I am a constructor with the value of a is: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(75);
        System.out.println("I am in derived 1");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor with value of y as: " + y);
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constructor.");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor with value of z as: " + z);
    }
}

public class CWH_ch10_constructorsInInheritance {
    public static void main(String[] args) {
        // Base1 base1 = new Base1(4);
        // Derived1 derived1 = new Derived1(10, 25);
        childOfDerived cd = new childOfDerived(12, 21, 112);
    }
}
