package com.greatestgame;

import java.util.Random;

public class Round {
    private int random;
    private int guessCount;
    private int maxGuesses;

    public Round(int low, int high, int maxGuesses) {
        Random rng = new Random();
        this.random = rng.nextInt(high - low) + low;
        this.maxGuesses = maxGuesses;
    }
    
    public boolean isOver() {
        return this.guessCount == this.maxGuesses;
    }

    public int getRandom(){
        return this.random;
    }
}