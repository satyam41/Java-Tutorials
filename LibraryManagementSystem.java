package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


class SchoolLibrary{
    ArrayList<String> listOfBooks = new ArrayList<>();

    public void DisplayBooks() {
        System.out.println("The book present in the library are: ");
        for (String books : listOfBooks) {
            System.out.println("*" + books);
        }
    }
    public void IssueBook(String bookName){
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dt.format(df);
        System.out.println(date);
        if (listOfBooks.contains(bookName)) {
            listOfBooks.remove(bookName);
            System.out.println(bookName + " is issue to you. Please handle carefully.");
        }
        else{
            System.out.println(bookName + " is issued to someone else. Please wait until they return book to the library.");
        }
    }
    public void ReturnIssueBook(String bookName){
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dt.format(df);
        System.out.println(date);
        listOfBooks.add(bookName);
        System.out.println("You return the book to the library.");
    }
    public void AddBook(String bookName){
        listOfBooks.add(bookName);
        System.out.println("Your book is add to the library.");
    }

    /**
     * This is the constructor of the SchoolLibrary class and this is used for adding the books into the library manually.
     */
    SchoolLibrary(){
        listOfBooks.add("Java");
        listOfBooks.add("Python");
        listOfBooks.add("C++");
        listOfBooks.add("JavaScript");
    }
}

/**
 * This is a library management system. In this program the method use is displayAllBook(), IssueBook(), ReturnAllBook(), AddBook() and in the main method the main code is executed and the class the of the library is also contains constructor and with the help of the constructor this project is running and you can enjoy this project.
 * @author Satyam
 * @since 2021
 * @version 1.0
 * @see <a href="https://docs.oracle.com/en/java/javase/16/docs/api/index.html">Java Docs</a>
 */


public class LibraryManagementSystem {
    ArrayList<String> listOfBooks = new ArrayList<>();

    /**
     * This method is used for display all books present in the library. In this method you see all books when you call this method.
     */
    public void  DisplayAllBook(){
        System.out.println("The book present in the library are: ");
        for (String books : listOfBooks){
            System.out.println(books);
        }
    }

    /**
     * This method is used for issue the book from the library.
     * @param bookName user input the name of the books which the books they wants to issue from the library.
     * @return the name of the book which user have issue.
     */
    public String IssueBook(String bookName){
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dt.format(df);
        System.out.println(date);
        if (listOfBooks.contains(bookName)) {
            listOfBooks.remove(bookName);
            System.out.println(bookName + " is issue to you. Please handle carefully.");
        }
        else{
            System.out.println(bookName + " is issued to someone else. Please wait until they return book to the library.");
        }
        return bookName;
    }

    /**
     * This method is used for return the book to the library.
     * @param bookName user input the name of the books which the books they wants to return to the library.
     * @return Return book name which is return to the library.
     */
    public String ReturnIssueBook(String bookName){
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dt.format(df);
        System.out.println(date);
        listOfBooks.add(bookName);
        System.out.println("You return the book to the library.");
        return bookName;
    }

    /**
     * This method is used for adding new books into the library.
     * @param bookName- user input the name of the books for add the books into the library.
     * @return the name of the book which is add to the library.
     */
    public String AddBook(String bookName){
        listOfBooks.add(bookName);
        System.out.println("Your book is add to the library.");
        return bookName;
    }

    /**
     * This is the main method and below this method all the main code is written there
     * @param args These are arguments supplied to the command line.
     */
    public static void main(String[] args) {
        SchoolLibrary scLib = new SchoolLibrary();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("======Welcome to SK Library======");
                System.out.println("1.Display all Books.");
                System.out.println("2.Issue Books.");
                System.out.println("3.Return Books.");
                System.out.println("4.Add Book to the library.");
                System.out.println("5.Exit from to the library.");

            while (true) {

                System.out.print("Enter your choice: What you want to do: ");
                int userInput = sc.nextInt();

                if (userInput == 1) {
                    scLib.DisplayBooks();
                }
                else if (userInput == 2) {
                    System.out.print("Enter the name of book you want to issue: ");
                    String bookName = sc.next();
                    scLib.IssueBook(bookName);
                }
                else if (userInput == 3) {
                    System.out.print("Enter the name of book you want to return: ");
                    String bookName = sc.next();
                    scLib.ReturnIssueBook(bookName);

                }
                else if (userInput == 4) {
                    System.out.print("Enter the name of book you want to add to the library: ");
                    String bookName = sc.next();
                    scLib.AddBook(bookName);

                }
                else if (userInput == 5) {
                    System.out.println("Thank You for visit.\nVisit Again :)");
                    break;
                }
                else {
                    throw new InvalidInputException();
                }
            }
        }
        catch (InvalidInputException e){
            System.out.println("Invalid Input!!!Please try again and this time enter correct option.....");
        }
    }
}
