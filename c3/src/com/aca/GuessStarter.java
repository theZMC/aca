package com.aca;

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {

        Random rng = new Random();
        Scanner in = new Scanner(System.in);
        int guess;
        int myNumber = rng.nextInt(101);

        System.out.print("I'm thinking of a number between 1 and 100\n");
        System.out.print("(including both.) Can you guess what it i`s?\n");
        System.out.print("Type a number: ");
        guess = in.nextInt();

        if(guess > 100 || guess < 1){
            System.out.printf("%d is not between 1 and 100, buddy.", guess);
            in.close();
            return;
        }

        System.out.printf("Your guess is: %d", guess);
        System.out.printf("\nThe number I was thinking of is: %d", myNumber);

        if(guess == myNumber){
            System.out.printf("\nYou were right on!\n");
            in.close();
            return;
        }

        System.out.printf("\nYou were off by: %d\n", Math.abs(guess - myNumber));
        in.close();
    }
}
