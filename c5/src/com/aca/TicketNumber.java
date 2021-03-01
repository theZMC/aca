package com.aca;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class TicketNumber {
    public static void main(String[] args) {
        boolean isTesting = false;

        if(isTesting) {
            for (int i = 0; i < 20; i++){
                printIsGoodNumber(generateGoodTicket());
            }
        } 
        else {
            int     ticketNumber;
            Scanner scanner      = new Scanner(System.in);

            ticketNumber    = getTicketNumber(scanner);
            
            printIsGoodNumber(ticketNumber);
            
            scanner.close();
        }
    }

    private static void printIsGoodNumber(int ticketNumber) {
        System.out.printf(
            "%d is a %s Number.\n", 
            ticketNumber, 
            isGoodNumber(ticketNumber) ? "Good" : "Bad"
        );
    }

    private static int getTicketNumber(Scanner scanner) {
        String prompt       = "Please enter your ticket number: ";
        String invalid      = "\nThe ticket number cannot be 0. Please try again.\n";
        String notANumber   = "That's not a number. Please try again.";
        
        Predicate<Integer> isAboveZero = (i) -> (i > 0) ? true : false;

        return Prompter.prompt(prompt, invalid, notANumber, scanner, isAboveZero);
    }

    public static boolean isGoodNumber(int ticketNumber) {
        int lastDigit       = ticketNumber % 10;
        int ticketPrefix    = ticketNumber / 10;
        
        return ticketPrefix % 7 == lastDigit ? true : false;
    }

    public static int generateGoodTicket() {
        Random  rng             = new Random();
        int     ticketPrefix    = rng.ints(1000000, 9999999).findFirst().getAsInt();
        int     lastDigit       = ticketPrefix % 7;
        
        return ticketPrefix * 10 + lastDigit;
    }
}
