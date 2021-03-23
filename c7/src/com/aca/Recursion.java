package com.aca;

public class Recursion {
    public static void main(String[] args) {
        iterativeCountDown(1_000);
        recursiveCountDown(1_000);
    }

    private static void iterativeCountDown(int i) {
        while(i > 0){
            System.out.println(i);
            i--;
        }
    }
    private static void recursiveCountDown(int i) {
        if(i == 0) return;
        System.out.println(i);
        recursiveCountDown(i-1);
    }
}
