package com.company;

import java.util.Scanner;

public class CWH_ch5_loop {
    public static void main(String[] args) {
        /*
 While loops in Java

        int i = 100;
        while (i<=200){
            System.out.println(i);
            i++;
        }
         */

        /*
 do-while loops in Java
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while (a<=10);
*/

        /*
 for loop in Java.
        for (int i= 1; i<=10; i++){
            System.out.println(i);
        }
*/
        for (int i = 0; i<=5; i++) {
            if (i % 2 == 0) {
//                System.out.println(i);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many natural number is you want to print: ");
        int n = sc.nextInt();
        for (int i=n; i!=0; i--){
            System.out.println(i);
        }
    }
}
