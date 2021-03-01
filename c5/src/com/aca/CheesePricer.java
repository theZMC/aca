package com.aca;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class CheesePricer {
    public static void main(String[] args) {        
        boolean isTesting   = false;
        int testNumOfLoops  = 10;

        if(isTesting) {
            for(int i = 0; i < testNumOfLoops; i++){
                int order[] = generateOrder();
                printFinalOrder(order[0], order[1], order[2]);
            }
        }

        else {
            String greeting = "Welcome to Crazy Ed's Wholesale String Cheese Emporium.\nPlease answer the questions below.\n";
            System.out.println(greeting);
            
            int order[] = getOrder();
            
            printFinalOrder(order[0], order[1], order[2]);
            
        }
    }

    private static int[] getOrder() {
        int order[]     = new int[3];
        Scanner scanner = new Scanner(System.in);

        Predicate<Integer> diamValidator     = (i) -> (i > 3 || i < 1) ? false : true;
        Predicate<Integer> lengthValidator   = (i) -> (i < 1) ? false : true;
        
        order[0] = getDiam(scanner, diamValidator);
        order[1] = getLength(scanner, lengthValidator);
        order[2] = calcPrice(order[0], order[1]);
        
        scanner.close();

        return order;
    }
    
    private static void printFinalOrder(int diam, int length, int cost) {
        System.out.print("\n\n\tCHEESE ORDER SUMMARY\n");
        System.out.print("\t------------------------\n");
        System.out.printf("\tDIAMETER:\t%d inches\n", diam);
        System.out.printf("\tLENGTH:\t\t%d yards\n", length);
        System.out.print("\t------------------------\n");
        System.out.printf("\tTOTAL:\t\t$%d.00\n\n\n", cost);
    }

    private static int getDiam(Scanner scanner, Predicate<Integer> validator) {
        String prompt       = "What diameter of cheese? (1\", 2\", or 3\") ";
        String invalid      = "That order's too crazy, Ed.\n";
        String notANumber   = "That's not a number, Ed.\n";

        return Prompter.prompt(prompt, invalid, notANumber, scanner, validator);
    }

    private static int getLength(Scanner scanner, Predicate<Integer> validator) {
        String prompt       = "How many yards of cheese? (enter a number) ";
        String invalid      = "That order's too crazy, Ed.\n";
        String notANumber   = "That's not a number, Ed.\n";

        return Prompter.prompt(prompt, invalid, notANumber, scanner, validator);
    }

    private static int calcPrice(int diam, int length) {
        int price = 5;

        switch (diam){
            case 1:
                price = price + (2 * length);                               // Add the price of the cheese
                price = price + ((length > 50) ? 2 * length : 4 * length);  // and shipping if applicable
                break;
            case 2:
                price = price + (4 * length);                               // Add the price of the cheese
                price = price + ((length > 75) ? 4 * length : 6 * length);  // and shipping if applicable
                break;
            case 3:                                                         // Add the price of the cheese
                price = price + ((length > 25) ? 6 * length : 10 * length); // and shipping if applicable
                break;
        }

        return price;

        // if(length > 50 && diam == 1){
        //     price = price + (2 * length);
        //     return price;
        // }

        // if(length > 75 && diam == 2){
        //     price = price + (4 * length);
        //     return price;
        // }

        // if(length > 25 && diam == 3){
        //     price = price + (6 * length);
        //     return price;
        // }

        // if(diam == 3){
        //     price = price + (4 * length) + (6 * length);
        //     return price;
        // }
        
        // price = price + (2 * length) + ((diam * 2) * length);
        // return price;
    }

    // Order generator for testing purposes
    private static int[] generateOrder() {
        Random rng  = new Random();

        int order[] = new int[3];

        order[0]    = rng.ints(1, 4).findFirst().getAsInt();
        order[1]    = rng.ints(1, 150).findFirst().getAsInt();
        order[2]    = calcPrice(order[0], order[1]);

        return order;
    }
}
