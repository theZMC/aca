package com.aca;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cels;

        System.out.print("Enter the temperature in celsius: ");
        cels = in.nextDouble();
        System.out.printf("\n%.1f\u00B0C is %.1f\u00B0F", cels, convert(cels));

        in.close();
    }

    private static double convert(double cels){
        return (cels * 1.8) + 32.0; 
    }
}