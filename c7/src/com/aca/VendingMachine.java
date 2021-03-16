package com.aca;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int[] sales = new int[5];

        while(true){
            Scanner scanner = new Scanner(System.in);
            int pick = getCustomerPick(scanner);

            if(pick == 99){
                System.out.println("\nGoodbye!");
                printSales(sales);
                scanner.close();
                return;
            }

            sales[pick] = sales[pick] + 1;
            printSales(sales);
        }
    }

    private static int getCustomerPick(Scanner scanner) {
        System.out.println("\nPick an item from 0 to 4.");
        
        int pick = scanner.nextInt();
        scanner.nextLine();
        
        return pick;
    }

    private static void printSales(int[] sales) {
        System.out.println("\nLifetime sales summary:");
        for(int i = 0; i < sales.length; i++){
            System.out.println("Item "+i+" has been sold "+sales[i]+" times.");
        }
    }
}