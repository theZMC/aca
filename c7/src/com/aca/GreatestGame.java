package com.aca;

import java.util.Random;
import java.util.Scanner;

public class GreatestGame {
    public static void main(String[] args) {
        runGame();
    }

    private static void runGame(){
        Scanner scanner     = new Scanner(System.in);       // make one scanner and use it over and over again
        String  name        = getPlayerName(scanner);       // get the player's name. only need to do this once.

        boolean isCorrect   = false;                        // by default, the player has not guessed correctly
        boolean isPlaying   = true;                         // by default, the player is playing the game
                
        int     randomHighBound = 100;                      // the upper bound for our random number (100 in the prompt)
        int     randomLowBound  = 1;                        // the lower bound for our random number (1 in the prompt)

        int     guessCountTotal = 0;                        // this keeps track of the total guesses for games that are won
        int     maxGuesses      = 5;                        // the total number of guesses we will allow per game
        int     guessCount      = 0;                        // the total number of guesses for the current game
        int     gameCount       = 0;                        // the total number of games that have been played
        int     winCount        = 0;                        // the total number of games that have been won

        while(isPlaying){                                                           // while the player wants to play...
            int guess = getPlayerGuess(scanner, randomLowBound, randomHighBound);   // get the guess from the player
            int random = getRandBetween(randomLowBound, randomHighBound);           // generate a random number
            guessCount++;                                                           // increment the guess counter
            isCorrect = (guess == random);                                          // check if the player won

            if(isCorrect){                                                          // if the player is correct...
                printPlayerWon(name, guessCount);                                   // tell the player they won
                isPlaying = askStillPlaying(scanner);                               // ask if the player wants to play again
                guessCountTotal += guessCount;                                      // add the guess count to the winning guess total
                guessCount = 0;                                                     // reset the guess count
                gameCount++;                                                        // increment the total game count
                winCount++;                                                         // increment the win count
                printGameHistory(gameCount, winCount, guessCountTotal);             // print the game history

            } else {                                                                // if the player is not correct...
                printGuessHighLow(guess, random);                                   // tell the player if they're high or low
            }

            if(guessCount == maxGuesses){                                           // if the player used all their guesses...
                printPlayerLost(name, guessCount);                                  // tell the player they lost
                isPlaying = askStillPlaying(scanner);                               // ask if they want to play agian
                guessCount = 0;                                                     // reset the guess count
                gameCount++;                                                        // increment the total game count
                printGameHistory(gameCount, winCount, guessCountTotal);             // print the game history
            }
        }

        scanner.close();                                    // close our scanner since we're done.                                     
    }

    private static void printGameHistory(int gameCount, int winCount, int guessCountTotal) {
        int lossCount = gameCount - winCount;                           // the number of losses is the total games minus the wins
        int avgGuess = 0;                                               // default to 0 in case there are no wins.
        if(winCount != 0){                                              // if the player has won a game...
            avgGuess = guessCountTotal / winCount;                      // the average guess is the total guesses in winning games
        }                                                               // divided by the wins

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
