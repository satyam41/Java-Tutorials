package com.company;

public class CWH_ch7_ps {
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.println(i * n);
        }
    }

    static void pattern(int n){
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static int sum(int n){
        int result = 0;
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n + sum(n-1);
        }
    }

//    static int fibonacci(int n){
//        int result=0;
//        if (n == 0 || n == 1){
//            return 1;
//        }
//        else{
//            for (int i=0; i<=n; i++) {
//                 result = n * fibonacci(n - 1);
//            }
//        }
//        return result;
//    }

    static int avg(int ...arr){
        int avg=0;
        int sum=0;
        for (int element: arr){
            sum += element;
            sum /= arr.length;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Question 1
         //multiplication(5);
         // Question 4
        //pattern(4);
        //System.out.println(sum(0));
//        System.out.println(fibonacci(10));
        System.out.println(avg(5+2+3));
    }
}
