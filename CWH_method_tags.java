package com.company;


import java.util.concurrent.ExecutionException;

/**
 * Hello I am class method and I am top of the all class.
 * @author Satyam
 */
public class CWH_method_tags {
    /**
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method.");
    }

    /**
     * Hello this is the method beautiful method of this class.
     * @param a This is the first number to add.
     * @param b This is the second number to add.
     * @return Sum of the two number.
     * @throws Exception if a = 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int a, int b) throws Exception {
        if (a == 0){
            throw new Exception();
        }
        int c;
        c = a + b;
        return c;
    }
}
