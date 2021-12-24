package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_file_handling {
    public static void main(String[] args) {
        // code to create a new file
        /*
        File myFile = new File("CWH_file_handling");
        try {
            myFile.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        */
        // code to write to file
        /*
        try {
            FileWriter fileWriter = new FileWriter("CWH_file_handling");
            fileWriter.write("This is our first file from this have course.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */

        // Reading a file
        /*
        File file = new File("CWH_file_handling");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         */

        // Deleting a file
        File file = new File("CWH_file_handling");
        if (file.delete()){
            System.out.println("I have deleted: " + file.getName());
        }
        else {
            System.out.println("Some problem occurred.");
        }
    }
}
