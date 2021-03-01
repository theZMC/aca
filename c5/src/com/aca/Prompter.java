package com.aca;

import java.util.Scanner;
import java.util.function.Predicate;

public class Prompter {
    public static int prompt(String prompt, String invalid, String notANumber, Scanner scanner, Predicate<Integer> validator){
        int value = 0;

        while(value == 0){
            scanner.reset();
            System.out.print(prompt);
            if(scanner.hasNextInt()){
                value = scanner.nextInt();
                if(!validator.test(value)){
                    System.out.println(invalid);
                    value = 0;
                    scanner.nextLine();
                }
            } 
            else {
                System.out.println(notANumber);
            }
        }

        return value;
    }
}
