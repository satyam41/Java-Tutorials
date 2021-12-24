package com.company;

import java.util.ArrayDeque;

public class CWH_advance_1_array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> lst = new ArrayDeque<>();
        lst.add(14);
        lst.addFirst(45);
        lst.addLast(75);
        lst.add(10);
        lst.add(20);
        System.out.println(lst);
        System.out.println(lst.getFirst()); // it return First element of the array.
        System.out.println(lst.getLast()); // it return last element of the array.
        System.out.println(lst.peek()); // it removes first value in the array.
        System.out.println(lst.pollLast()); // it remove last value in the array.
        System.out.println(lst);
    }
}

