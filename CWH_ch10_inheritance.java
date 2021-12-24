package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor.");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_ch10_inheritance {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.setX(5);
        derived.setY(7);
        System.out.println(derived.getX());
        System.out.println(derived.getY());

        // base
        Base base = new Base();
        // base.setY(6);
        // System.out.println(base.getY());
    }
}
