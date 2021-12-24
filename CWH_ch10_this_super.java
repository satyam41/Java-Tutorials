package com.company;

class EkClass{
    int a;
    EkClass(int a){
        this.a = a;
        // a = a;
    }

    public int getA() {
        return a;
    }

    public int returnOne(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int s){
        super(s);
        System.out.println("I am a constructor.");
    }
}

public class CWH_ch10_this_super {
    public static void main(String[] args) {
        EkClass ekClass = new EkClass(6);
        DoClass doClass = new DoClass(34);
        System.out.println(ekClass.getA());

    }
}
