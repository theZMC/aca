package com.aca;

import java.util.Random;
import java.util.Scanner;

public class GreatestGame {
    public static void main(String[] args) {
        runGame();
    }

    private static void runGame(){
        Scanner scanner     = new Scanner(System.in);

        boolean isCorrect   = false;
        boolean isPlaying   = true;
        
        String  name        = getPlayerName(scanner);
        
        int     guessCount  = 0;
        int     gameCount   = 0;
        int     winCount    = 0;
        int     random      = getRandBetween(1, 100);
        int guessCountTotal = 0;

        while(isPlaying || (guessCount < 5 && !isCorrect)){
            int guess = getPlayerGuess(scanner, 1, 100);
            isCorrect = (guess == random);
            guessCount++;

            if(isCorrect){
                congratulatePlayer(name, guessCount);
                isPlaying = askStillPlaying(scanner);
                guessCountTotal += guessCount;
                guessCount = 0;
                gameCount++;
                winCount++;
                printGameHistory(gameCount, winCount, guessCountTotal);
            } else {
                printHighLow(guess, random);
            }

            if(guessCount == 5){
                playerLost(name, guessCount);
                isPlaying = askStillPlaying(scanner);
                guessCount = 0;
                gameCount++;
                printGameHistory(gameCount, winCount, guessCountTotal);
            }
        }
        scanner.close();
    }

    private static void printGameHistory(int gameCount, int winCount, int guessCountTotal) {
        int lossCount = gameCount - winCount;
        int avgGuess = guessCountTotal / winCount;

        System.out.println("\n  HISTORICAL GAME SUMMARY");
        System.out.println(  "---------------------------");
        System.out.printf(   "Total Wins\t\t%3d\n", winCount);
        System.out.printf(   "Total Losses\t\t%3d\n", lossCount);
        System.out.printf(   "Average Guesses\\Win\t%3d\n", avgGuess);
        System.out.println(  "---------------------------\n");
    }

    private static void playerLost(String name, int guessCount) {
        System.out.printf("\nSorry %s :( That was %d guesses, so game over...\n", name, guessCount);
    }

    private static void printHighLow(int guess, int random) {
        System.out.printf("Your guess was a tad too %s.\n", guess > random ? "high" : "low");
    }

    private static void congratulatePlayer(String name, int guessCount) {
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
