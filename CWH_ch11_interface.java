package com.company;

import org.w3c.dom.ls.LSOutput;

interface Bicycle{
    int a = 12;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHorn();
    void blowHornMovie();
}
class Cycle implements Bicycle, HornBicycle{
    public void applyBreak(int decrement){
        System.out.println("Applying Break.......");
    }
    public void speedUp(int increment){
        System.out.println("Speed up the cycle....");
    }
    public void blowHorn(){
        System.out.println("Peeeeeeee Pooooo");
    }
    public void blowHornMovie(){
        System.out.println("PooooPeeee");
    }
}

public class CWH_ch11_interface {
    public static void main(String[] args) {
        // You can create properties in Interfaces.
        // You cannot modify the properties in Interfaces as they are final.
        Cycle cycle = new Cycle();
        cycle.applyBreak(cycle.a);
        //cycle.a = 13;
        cycle.blowHornMovie();
        cycle.blowHorn();
    }
}
