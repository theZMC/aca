package com.aca;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println();
        
        i = 2;
        while (i <= 8) {
            System.out.println(i + ", ");
            i += 2;
        }
        System.out.println("Who do we appreciate?");
    }
}
