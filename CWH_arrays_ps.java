package com.company;

public class CWH_arrays_ps {
    public static void main(String[] args) {
 /*
 Question 1
        float[] arr = {2.2f, 3.3f, 4.4f, 5.5f};
        float sum = 0;
        for (float element: arr) {
            sum = sum + element;
        }
        System.out.println(sum);
*/

/*
Question 2
        int[] array = {1, 2, 3, 4, 5};
        int num = 14;
        boolean isInArray = false;
        for (int element:array){
            if (num == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array.");
        }
        else{
            System.out.println("The value is not present in the array.");
        }
*/

        /*
 Question 3
        float[] marks = {50.5f, 48.5f, 79.5f, 75.5f};
        float sum = 0;
        float avg;
        for (float element:marks){
            sum = sum + element;
        }
        avg = sum/marks.length;
        System.out.println(avg);
*/

        // Question 4
        int[][] mat1 = {{1,2,3},
                       {4,5,6}};
        int[][] mat2 = {{2, 5, 7},
                        {7,9,5}};
        int [][] result = {{0,0,0},
                          {0,0,0}};
        for (int i=0; i<mat1.length;i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0; i<mat1.length;i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println();
        }   

        /* Question 5
        int[] reverseArray = {1, 2, 3, 4, 5};
        for (int i=reverseArray.length-1; i>=0; i--){
            System.out.println(reverseArray[i]);
        }
         */

        /*
 Question 6
        int[] maxArray = {1, 20, 3, 4, 5};
        System.out.println(Arrays.stream(maxArray).max());
*/

        /*
 Question 7
        int[] minArray = {1, 20, 3, 4, 5, 0};
        System.out.println(Arrays.stream(minArray).min());
*/

        // Question 8
//        int[] sort = {4, 2, 5, 1, 3};
    }
}
