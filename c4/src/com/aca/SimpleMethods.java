package com.aca;

public class SimpleMethods {
    public static void printCount(int count) {
        System.out.println("This count is: " + count);        
    }
    public static void printName(String name) {
        System.out.println("My name is: " + name);
    }
    public static void printBoolean(boolean isRich) {
        System.out.println("I am rich: " + isRich);        
    }
    public static void printSum(int val1, int val2) {
        System.out.printf("%d + %d = %d\n", val1, val2, val1+val2);
    }
    public static void main(String[] args) {
        printCount(5);
        printName("Slimshady");
        printBoolean(true);
        printSum(4, 6);
        printSum(7, 2);
    }
}
