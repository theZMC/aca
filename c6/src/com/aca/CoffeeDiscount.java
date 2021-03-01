package com.aca;

import java.util.Scanner;

public class CoffeeDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you take a bicycle or a bus to work? (1 for bus, 2 for bicycle) ");
        boolean isBikeRider = scanner.nextInt() == 2 ? true : false;

        System.out.print("How many miles is your commute? ");
        int commute = scanner.nextInt();

        System.out.printf("You qualify for a %d%% discount.\n", calcDiscount(isBikeRider, commute));
        
        scanner.close();

        // System.out.println("Test Cases:");
        // System.out.printf("You qualify for a %d%% discount.\n", calcDiscount(true, 20));
        // System.out.printf("You qualify for a %d%% discount.\n", calcDiscount(true, 30));
        // System.out.printf("You qualify for a %d%% discount.\n", calcDiscount(true, 52));
        // System.out.printf("You qualify for a %d%% discount.\n", calcDiscount(false, 35));
        // System.out.printf("You qualify for a %d%% discount.\n", calcDiscount(false, 50));
    }

    public static int calcDiscount(boolean isBikeRider, int commute) {
        int discount = 0;
        
        if(commute < 21){
            discount = 100;
        }

        else
        if(isBikeRider && commute < 50){
            discount = 20;
            if(commute < 30){
                discount = 30;
            }
        }

        else
        if(!isBikeRider && commute >= 35){
            discount = 20;
            if(commute < 50){
                discount = 50;
            }
        }

        return discount;
    }
}
