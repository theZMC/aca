package com.aca;

import java.util.Scanner;

public class ConvertInches {
    public static void main(String[] args) {
        Scanner         in          = new Scanner(System.in);
        final double    CM_PER_INCH = 2.54d;
        int             inch        = 0;
        double cm;

        while(inch == 0) {
            
            System.out.println("How many inches? ");
            
            inch = (in.hasNextInt()) ? in.nextInt() : 0;
            in.nextLine();
            
            if(inch == 0) {
                System.out.println("\nI need a non-zero number. Try again.");
            }
        }

        cm = (double) inch * CM_PER_INCH;
        System.out.printf("There are %.2fcm in %din.", cm, inch);

        in.close();

    }
}