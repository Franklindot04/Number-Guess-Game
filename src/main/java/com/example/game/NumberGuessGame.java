package com.example.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1; // random number between 1 and 100
        int guess = 0;

        System.out.println("Welcome to Number Guess Game!");
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! The number was " + number);
            }
        }

        scanner.close();
    }
}

