package com.aca;

public class EvenOrOdd {
    public static void main(String[] args) {
        printEvenOrOdd(55);
        printEvenOrOdd(88);
    }

    private static void printEvenOrOdd(int num) {
        System.out.printf(
            "value '%d' is %s\n", 
            num, 
            (num % 2 == 0) ? "even" : "odd"
        );
    }
}
