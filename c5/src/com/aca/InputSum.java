package com.aca;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        getTo(1000);
    }

    private static void getTo(int goal) {
        Scanner scanner = new Scanner(System.in);
        int     total   = 0;

        while (total <= goal){
            System.out.println("Total is " + total + ". How much to add?");
            total += scanner.nextInt();
            scanner.nextLine();
        }
        
        scanner.close();
    }
}