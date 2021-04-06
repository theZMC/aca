package com.aca;

import java.math.BigDecimal;

public class Player{
    private String name;
    private BigDecimal score;

    public Player(String name){
        this.name = name;
        this.score = new BigDecimal(0.00d);
    }

    public void increaseScore(){
        score = score.add(new BigDecimal(1.5d));
    }

    public void resetScore(){
        score = new BigDecimal(0.00d);
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n", name, score.toString());
    }
}
