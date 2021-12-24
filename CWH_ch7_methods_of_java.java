package com.company;

public class CWH_ch7_methods_of_java {

     static int logic(int x, int y){
        int z;
        if (x>y){
            z = y+x;
        }
        else{
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        // DRY --> Do not Repeat Yourself
        int a = 2;
        int b = 10;
        int c;
        //CWH_ch7_methods_of_java obj = new CWH_ch7_methods_of_java(); // Method invocation using object creation
        c = logic(a, b);
        System.out.println(c);
    }
}
