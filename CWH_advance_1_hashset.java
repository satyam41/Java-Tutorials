package com.company;

import java.util.HashSet;

public class CWH_advance_1_hashset {
    public static void main(String[] args) {
        /*
     Hashing Technique:- Technique to convert key, value pair --> Indices
     class of hashing technique:
         --> HashSet
         --> HashMap
         --> LinkedHashMap
         --> HashTable
*/
        HashSet<Integer> myHas = new HashSet<>(6, 0.5f);
        myHas.add(120);
        myHas.add(13);
        myHas.add(11);
        myHas.add(12);
        System.out.println(myHas);
    }
}
