package com.company;

public class CWH_for_each_loop {
    public static void main(String[] args) {

        /*
        float [] marks = {98.5f, 56.5f, 65.5f, 77.5f, 90.5f};
        String[] student = {"Satyam", "Vivega", "Aditi", "Chesta", "Arpana"};
        System.out.println(student.length);
        System.out.println(student[3]);
         */

        int[] marks = {98, 56, 65, 77, 90};
        // System.out.println(marks.length);

        // Displaying the Array (Naive Ways)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing reverse order using for loop");
        for (int n=marks.length-1; n>=0; n--){
            System.out.println(marks[n]);
        }

        // Displaying the Array (foreach loop)
        System.out.println("Printing using foreach loop");
        for (int element: marks){
            System.out.println(element);
        }
    }
}
