package com.example.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("Correct! You win!");
        } else {
            System.out.println("Wrong! The number was " + number);
        }
        scanner.close();
    }
}

