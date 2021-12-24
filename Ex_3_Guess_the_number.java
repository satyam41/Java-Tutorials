package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Satyam
 * @version 1.2
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/16/docs/api/index.html">Java Docs</a>
 */

class Game {
    private int userInput;
    private int computerGuess;
    private int noOfGuess;

    /**
     * This is a game constructor contains all the function to run this game.
     */
    Game() {
        Random random = new Random();
        this.computerGuess = random.nextInt(50);
    }

    /**
     * takeUserInput method is used for taking input from user.
     */
    public void takeUserInput() {
        System.out.print("Guess a number between 0-50: ");
        Scanner sc = new Scanner(System.in);
        this.userInput = sc.nextInt();
    }

    /**
     * isCorrectNumber method is used for check the user number and compare with computer number and check the number is equal or not if the number is equal the game is over and you will win the match.
     * @return the number is equal to the computer number.
     */
    public boolean isCorrectNumber() {
        noOfGuess++;
        if (userInput == computerGuess) {
            System.out.println("You Win!!!");
            System.out.println("You guessed it in " + noOfGuess + " attempts");
            return true;
        } else if (userInput < computerGuess) {
            System.out.println("Guess greater number....");
        } else if (userInput > computerGuess) {
            System.out.println("Guess smaller number....");
        }
        return false;
    }
}

/**
 * This is a game you can play and enjoy this game. In this game you have to guess a number and the parallel computer also guess a number if you guess the correct number you can win the match and game is over and one message is popped up the message is you want to play? if you want to play enter y else enter n. else you don't able to a guess correct number the computer message is display the number is greater/smaller than computer number. And your chance will also count and when the game is over your chance is display to you.
 */
public class Ex_3_Guess_the_number {
    /**
     * In this game you have to guess a number if number is equal to the computer guess you will win this match else the games is continue.
     * @param args These are arguments supplied to the command line.
     */
    public static void main(String[] args) {

        Game game = new Game();
        String ans = "y";
        while (ans.equals("y")){
            boolean chance = false;
            while (!chance) {
                game.takeUserInput();
                chance = game.isCorrectNumber();
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Want to play more press y for yes or n for no: ");
            ans = sc.next();
        }
        System.out.println("Thank You for playing this game!!!");
    }
}
