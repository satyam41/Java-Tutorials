package com.company;

public class CWH_multidimensional {
    public static void main(String[] args) {
        int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int[2][3];
        
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;

        flats[1][0] = 201;
        flats[1][1] = 201;
        flats[1][2] = 201;

        // Displaying the Array (for loop)=
        for (int i=0; i<flats.length; i++) {
            for (int j = 0; j < flats[0].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
