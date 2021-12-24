package com.company;

public class CWH_09_ch2_operator_pre {
    public static void main(String[] args){
        // Precedence & Associativity
//        int a = 6*4-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity.
            = 24-34/2
            = 24-17 = 7
         */
//        int b = 60/5+34*2;
        /*
            = 12 + 68
            = 80
         */
        // System.out.println(a);
        // System.out.println(b);

        // Quick Quiz
        int x = 8;
        int y = 2;
        int k = x*y/2;
        System.out.println(k);

        int a = 6;
        int b = 4;
        int c = 2;
        int d = (b*b-4*a*c)/(2*a);
        System.out.println(d);
    }
}
