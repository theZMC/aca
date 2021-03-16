package com.aca;

import java.util.Scanner;

public class InternetUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the customer's state abbreviation? ");
        String state = scanner.nextLine();

        System.out.print("What is the customer's current internet speed? ");
        int speed = scanner.nextInt();

        printUpgrade(calcUpgrade(state, speed));

        scanner.close();
        
        // runTests();
    }

    public static int calcUpgrade(String state, int speed) {
        int upgrade = 0;

        if(state.toLowerCase().equals("mo") && speed < 25){
            upgrade = 50;
            if(speed < 10){
                upgrade = 20;
            }
        }
        if(state.toLowerCase().equals("ia") && speed < 30){
            upgrade = 50;
        }
        
        return upgrade;
    }
    
    public static void printUpgrade(int upgrade) {
        if(upgrade == 0){
            System.out.println("User does not get a free upgrade.");
        } else {
            System.out.printf("User gets a free upgrade to %dM.\n", upgrade);
        }
    }

    public static void runTests(){
        System.out.println("Test Cases:");
        printUpgrade(calcUpgrade("IA", 5));
        printUpgrade(calcUpgrade("AR", 10));
        printUpgrade(calcUpgrade("MO", 5));
        printUpgrade(calcUpgrade("MO", 10));
        printUpgrade(calcUpgrade("MO", 20));
    }
}  