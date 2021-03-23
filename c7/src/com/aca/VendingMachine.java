package com.aca;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        vend();
    }
    
    private static void vend(){
        // Use an array to keep track of how many of each item has been purchased
        int[]   sales   = new int[5];
        Scanner scanner = new Scanner(System.in);
        int     pick;

        System.out.println();

        // the program should keep accepting new requests for product forever
        while(true){

            // allows a customer to select from 5 delicious instantly prepared meals
            pick = getCustomerPick(scanner);

            // the secret number 99 causes...
            if(pick == 99){
                // the program to say "Goodbye!"...
                System.out.println("\nGoodbye!");

                // printing a final list of how many of each item was sold...
                printSales(sales);
                
                // and quit running.
                scanner.close();
                return;
            }

            // track how many of each item is sold
            sales[pick]++;

            // After each purchase
            // output the number of each item sold so far
            printSales(sales);
        }
    }

    // allows the customer to pick item 0 to 4
    private static int getCustomerPick(Scanner scanner) {
        boolean waiting = true;
        int     pick    = 0;

        while(waiting){
            System.out.println("\nPick an item from 0 to 4.");

            if(scanner.hasNextInt()){
                pick = scanner.nextInt();
                if(pick == 99 || (pick <= 4 && pick >= 0)){
                    waiting = false;
                }
            }

            scanner.nextLine();
        }
        return pick;
    }

    // output the number of each item sold so far
    private static void printSales(int[] sales) {
        System.out.println("\nLifetime sales summary:");
        for(int i = 0; i < sales.length; i++){
            System.out.println("Item "+i+" has been sold "+sales[i]+" times.");
        }
    }
}