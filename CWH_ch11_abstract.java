package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

abstract class Child2 extends Parent{
    public void sayGood(){
        System.out.println("Hi");
    }
}

public class CWH_ch11_abstract {
    public static void main(String[] args) {
        // Abstract class ki help se aur class banegi.
        Child child = new Child();
        // Parent parent = new Parent(); --> through error
        // Child2 child2 = new Child2(); --> through error
        child.sayHello();
    }
}
