package com.aca;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        getTo1000();
    }

    private static void getTo1000() {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;

        while (total <= 1000){
            System.out.println("Total is " + total + ". How much to add?");
            total += scanner.nextInt();
            scanner.nextLine();
        }
        
        scanner.close();
    }
}
