package com.company;

import java.util.ArrayList;

class MyGenerics<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }
}

public class CWH_advance_2_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //arrayList.add("str1");
        arrayList.add(32);
        arrayList.add(123);

        //int a = arrayList.get(2);
        // System.out.println(a);
        MyGenerics<String, Integer> g1 = new MyGenerics(23, "MyString", 524);
        String b = g1.getT1();
        int b1 = g1.getT2();
        System.out.println(b);
    }
}
