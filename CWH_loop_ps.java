package com.company;

public class CWH_loop_ps {
    public static void main(String[] args) {
        /*
         Question 1
        int n = 4;
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
*/

        /*
 Question 2
        int n = 1;
        // 2 * n = even
        while (n<=10){
            if (n%2==0) {
                System.out.println(n);
            }
            n++;
        }
*/

        /*
 Question 3
        int n = 12;
        for (int i=1; i<=10; i++){
            System.out.println(n * i);
        }
*/

        /*
 Question 4
        int n = 10;
        for (int i=10; i>=1; i--){
            System.out.println(n * i);
        }
*/

        /*
 Question 51)
        int fac = 1;
        int num = 12;
        for (int i=1; i<=(num-1); i++){
            fac = fac*(i+1);
            //System.out.println(fac);
        }
        System.out.println(fac);
        */

         /*
Question 6
        int fac = 1;
        int n = 4;
        int i = 1;
        while (i<=(n-1)){
            fac = fac*(i+1);
            i++;
        }
        System.out.println(fac);
*/
        // Question 7
        int n = 4;
        int i = n;
        while (i>0){
            int j = 0;
            while (j<i){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }


         //Question 8 --> True


/*
         Question 9
                int n = 8;
                int sum = 0;
                for (int i=1; i<=10; i++){
                    //System.out.println(n * i);
                    sum += n * i;
                }
                System.out.println(sum);
        */

    }
}
