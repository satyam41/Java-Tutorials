package com.company;

class C1{
    public int x = 1;
    protected int y = 2;
    int z = 3;
    private int a = 4;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class CWH_ch12_access_modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}
