package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Library{
    String[] listOfBooks = {"Java", "Python", "HTML", "JavaScript", "CSS", "C++"};
    Scanner sc = new Scanner(System.in);
    public void showAvailableBooks() {
        System.out.println("Books present in the library: ");
        for (String book: listOfBooks){
            System.out.println("*" + book);
        }
    }

    public void issueBook(){
        System.out.print("Enter the book name you want to issue: ");
        String issueBookName = sc.next();
         boolean check = Arrays.stream(listOfBooks).anyMatch(t -> t.equals(issueBookName));
        if (check) {
            //ArrayList<String>
            List<String> removingBook = new ArrayList<String>(Arrays.asList(listOfBooks));
            removingBook.remove(issueBookName);
            listOfBooks = removingBook.toArray(new String[listOfBooks.length-1]);
            System.out.println("You have issue " + issueBookName + " from the library.");
        }
        else {
            System.out.println(issueBookName + " is not present in the library.");
        }
    }

    public void returnBook(){
        System.out.print("Enter the book name you want to return: ");
        String returnBookName = sc.next();
        List<String> addBooks = new ArrayList<String>(Arrays.asList(listOfBooks));
        addBooks.add(returnBookName);
        listOfBooks = addBooks.toArray(new String[listOfBooks.length]);
        System.out.println("You have return " + returnBookName + " to the library.");
    }
    Library(){
        System.out.println("=====Welcome to KVS Library=====");
        System.out.println("Choose correct option for doing operations: ");
        System.out.println("\t1.Display all books");
        System.out.println("\t2.Issue book from the library");
        System.out.println("\t3.Return book to the library");
        System.out.println("\t4.Exit");
        System.out.println();

        while (true) {
            System.out.print("Enter your choice what you want from the library: ");
            int userInput = sc.nextInt();
            if (userInput == 1) {
                showAvailableBooks();
            } else if (userInput == 2) {
                issueBook();
            } else if (userInput == 3) {
                returnBook();
            } else if (userInput == 4) {
                System.out.println("Thank you for visit....");
                break;
            }
            else {
                System.out.println("Invalid Input!!!");
            }
        }
    }
}

public class CWH_Ex4_ch10 {
    public static void main(String[] args) {
        // You have to implement a library using Java Class Library
        // Methods: issueBook, returnBook, showAvailableBooks, addBook.
        // Properties: Array to store the available books, Array to store the issued books.
        Library library = new Library();
    }
}
