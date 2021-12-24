package com.company;

import java.util.*;

public class CWH_advance_1_array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>(5);
        l2.add(1);
        l2.add(3);
        l2.add(4);
        l1.add(42);
        l1.add(20);
        l1.add(0,24);
        l1.add(402);
        l1.addAll(0, l2);
        // System.out.println(l1.size());
        // System.out.println(l1.contains(12));
        // l1.clear();
        // l1.clone();
        //System.out.println(l1.indexOf(5));
        //System.out.println(l1.lastIndexOf(2));
        System.out.println(l1.remove(5));
        l1.set(1, 250);
        l1.isEmpty();
        System.out.println(l1);

//        for (int i=0; i<l1.size(); i++) {
//            System.out.print(l1.get(i));
//            System.out.print(" , ");
//        }
    }
}
