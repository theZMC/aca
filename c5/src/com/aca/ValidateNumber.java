package com.aca;

import java.util.Scanner;

public class ValidateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number");

        if(scanner.hasNextInt()){
            int value = scanner.nextInt();
            System.out.println("thanks for entering a whole number: " + value);
        } else {
            System.out.println("your number is not valid.");
        }
        
        scanner.close();
    }
}
