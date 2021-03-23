package com.greatestgame;

import java.util.Scanner;

public class Player {
    private int     guess;
    private String  name;

    public void getNameFromPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();
        scanner.close();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean guessIsCorrect(int random) {
        return this.guess == random;        
    }

    public boolean guessIsHigh(int random) {
        return this.guess > random;
    }
}
