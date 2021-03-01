package com.aca;

public class MathUtil {
    public static void printDifference(int val1, int val2) {
        int difference = val1 - val2;
        printAbsValue(difference);
    }
    public static void printAbsValue(int value) {
        System.out.printf("value is: %d and abs value is: %d\n", value, Math.abs(value));        
    }
    public static void main(String[] args) {
        printDifference(1_000, 4_000_000);
    }
}
