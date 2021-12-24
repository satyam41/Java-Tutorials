package com.company;

import java.util.Scanner;

class Myadd{
    @Deprecated
    public int mySum(int a, int b){
        return a + b;
    }
}
interface MyClass{
    void meth1();
    void meth2();
}
public class CWH_advance_2_ps {
    public static void main(String[] args) {
        /*
        Question 1&2
        @SuppressWarnings("deprecated")
        Myadd myadd = new Myadd();
        myadd.mySum(4,5);
       */

        // Question 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which number of table you want: ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(n * i);
        }
    }
}
