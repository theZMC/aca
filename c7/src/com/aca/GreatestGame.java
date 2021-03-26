package com.aca;

import java.util.Random;
import java.util.Scanner;

public class GreatestGame {

    public static void main(String[] args) {
        runGame(1, 100, 5);
    }

    private static void runGame(int randomLowBound, int randomHighBound, int maxGuesses) {
        Scanner scanner     = new Scanner(System.in);
        String  name        = getPlayerName(scanner);

        boolean isCorrect   = false;
        boolean isPlaying   = true;
        boolean isGameOver  = false;

        int     winGuessCount   = 0;
        int     guessCount      = 0;
        int     gameCount       = 0;
        int     winCount        = 0;

        int random = getRandBetween(randomLowBound, randomHighBound);

        while(isPlaying){
            int guess = getPlayerGuess(scanner, randomLowBound, randomHighBound);
            guessCount++;
            isCorrect = (guess == random);

            if(isCorrect){
                printPlayerWon(name, guessCount);
                isPlaying = askStillPlaying(scanner);
                winGuessCount += guessCount;
                guessCount = 0;
                gameCount++;
                winCount++;
                random = getRandBetween(randomLowBound, randomHighBound);
                printGameHistory(gameCount, winCount, winGuessCount);

            } else {
                printGuessHighLow(guess, random);
            }

            isGameOver = (guessCount == maxGuesses);

            if(isGameOver){
                printPlayerLost(name, guessCount);
                isPlaying = askStillPlaying(scanner);
                guessCount = 0;
                gameCount++;
                random = getRandBetween(randomLowBound, randomHighBound);
                printGameHistory(gameCount, winCount, winGuessCount);
            }
        }

        scanner.close();
    }

    private static void printGameHistory(int gameCount, int winCount, int winGuessCount) {
        int lossCount = gameCount - winCount;
        int avgGuess = 0;
        if(winCount != 0){
            avgGuess = winGuessCount / winCount;
        }

        System.out.println("\n  HISTORICAL GAME SUMMARY");
        System.out.println(  "---------------------------");
        System.out.printf(   "Total Wins\t\t%3d\n", winCount);
        System.out.printf(   "Total Losses\t\t%3d\n", lossCount);
        System.out.printf(   "Average Guesses\\Win\t%3d\n", avgGuess);
        System.out.println(  "---------------------------\n");
    }

    private static void printPlayerLost(String name, int guessCount) {
        System.out.printf("\nSorry %s :( That was %d guesses, so game over...\n", name, guessCount);
    }

    private static void printGuessHighLow(int guess, int random) {
        System.out.printf("Your guess was a tad too %s.\n", guess > random ? "high" : "low");
    }

    private static void printPlayerWon(String name, int guessCount) {
        System.out.printf("\nCongratulations %s! You won with %d guesses!\n", name, guessCount);
    }

    private static boolean askStillPlaying(Scanner scanner) {
        System.out.println("\nDid you want to play again? (yes to play again, anything else to quit)");

        return scanner.nextLine().toLowerCase().equals("yes");
    }

    private static int getPlayerGuess(Scanner scanner, int low, int high) {
        System.out.printf("\nPick a number between %d and %d.\n", low, high);
        int guess = scanner.nextInt();
        scanner.nextLine();

        return guess;
    }

    private static int getRandBetween(int low, int high) {
        Random rng = new Random();

        return rng.nextInt(high-low) + low;
    }

    private static String getPlayerName(Scanner scanner) {
        System.out.println("\nWhat is your name?");

        return scanner.nextLine();
    }
}
