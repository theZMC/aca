package com.aca;

import java.util.Scanner;

public class CountMe {
    public static void main(String[] args) {
        printCount(44);
        printCount(21);
        printCount(13);

        waitForZero();
    }
    
    private static void printCount(int i) {
        for(int j = 0; j <= i; j++){
            System.out.println(j);
        }
    }

    private static void waitForZero() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        System.out.println("Give me a zero!");

        while(i != 0){
            scanner.nextLine();
            System.out.println("Give me a zero!");
            i = scanner.nextInt();
        }
        scanner.close();
    }
}
