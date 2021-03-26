package com.aca;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        vend();
    }

    private static void vend(){
        Scanner scanner = new Scanner(System.in);
        int[]   sales   = new int[5];
        int     pick;

        System.out.println();
        while(true){
            pick = getCustomerPick(scanner);
            if(pick == 99){
                System.out.println("\nGoodbye!");
                printSales(sales);
                scanner.close();
                return;
            }
            sales[pick]++;
            printSales(sales);
        }
    }

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

    private static void printSales(int[] sales) {
        System.out.println("\nLifetime sales summary:");
        for(int i = 0; i < sales.length; i++){
            System.out.println("Item "+i+" has been sold "+sales[i]+" times.");
        }
    }
}