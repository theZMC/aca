package com.aca;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;

        // Operates as expected
        System.out.print("No Bug\nWhat is your name? ");
        name = in.nextLine();
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);

        // Operates unexpectedly
        System.out.print("\nBug Introduced\nWhat is your age? ");
        age = in.nextInt();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

        // Operates as expected with the new in.nextline()
        System.out.print("\nBug Fixed\nWhat is your age? ");
        age = in.nextInt();
        in.nextLine();      // This makes it work again.
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

        in.close();
    }
}
