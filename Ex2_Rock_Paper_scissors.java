package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ex2_Rock_Paper_scissors {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Welcome to Game of World");

        int rock_count = 0;
        int paper_count = 0;
        int scissor_count = 0;

        int computer_score = 0;
        int player_score = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Choose correct choice: '0' for Rock, '1' for Paper and '2' for Scissor: ");
            int userInput = sc.nextInt();
            int predict;

            if (userInput == 0){
                rock_count = rock_count + 1;
            }
            else if (userInput == 1){
                paper_count = paper_count + 1;
            }
            else if (userInput == 2){
                scissor_count = scissor_count + 1;
            }

            if (rock_count > paper_count && rock_count > scissor_count){
                predict = 0;
            }
            else if (paper_count > rock_count && paper_count > scissor_count){
                predict = 1;
            }
            else if (scissor_count > rock_count && scissor_count > paper_count){
                predict = 2;
            }
            else{
               predict = random.nextInt(3);
            }

            if (userInput == predict) {
                System.out.println("Match Tie.");
                System.out.println("Computer Score: " + computer_score);
                System.out.println("Player Score: " + player_score);
            }
            else {
                switch (userInput) {
                case 0:
                    if (predict == 1) {
                        System.out.println("Player choose ROCK and Computer choose PAPER");
                        computer_score = computer_score + 1;
                        System.out.println("Computer Score: " + computer_score);
                        System.out.println("Player Score: " + player_score);
                    }
                    else if (predict == 2) {
                        System.out.println("Player choose ROCK and Computer choose SCISSOR");
                        player_score = player_score + 1;
                        System.out.println("Computer Score: " + computer_score);
                        System.out.println("Player Score: " + player_score);
                        break;
                    }
                case 1:
                    if (predict == 0) {
                        System.out.println("Player choose PAPER and Computer choose ROCK");
                        player_score = player_score + 1;
                        System.out.println("Computer Score: " + computer_score);
                        System.out.println("Player Score: " + player_score);
                    }
                    else if (predict == 2) {
                        System.out.println("Player choose PAPER and Computer choose SCISSOR");
                        computer_score = computer_score + 1;
                        System.out.println("Computer Score: " + computer_score);
                        System.out.println("Player Score: " + player_score);
                    }
                    break;
                case 2:
                    if (predict == 0) {
                        System.out.println("Player choose SCISSOR and Computer choose ROCK");
                        computer_score = computer_score + 1;
                        System.out.println("Computer Score: " + computer_score);
                        System.out.println("Player Score: " + player_score);
                    }
                    else if (predict == 1) {
                        System.out.println("Player choose SCISSOR and Computer choose PAPER");
                        player_score = player_score + 1;
                        System.out.println("Computer Score: " + computer_score);
                        System.out.println("Player Score: " + player_score);
                    }
                    break;
                default:
                    System.out.println("Invalid Input!!! Try Again");
                    break;
                }
            }

            if (computer_score == 10) {
                System.out.println("Computer is won!!! Bad Luck next time...");
                break;
            }
            else if (player_score == 10) {
                System.out.println("You Won!!! Congratulations");
                break;
            }
        }
    }
}
