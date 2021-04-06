package com.aca;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Stock {
    private String          name;
    private String          symbol;
    private double          lastPrice;
    private int             volume;
    private List<String>    reviews = new ArrayList<String>();

    private static String   formatString = "%-5s %-16s %4.2f %,10d";

    public Stock(){
    }
    public Stock(String name, String symbol, double lastPrice, int volume){
        this.name = name;
        this.symbol = symbol;
        this.lastPrice = lastPrice;
        this.volume = volume;
    }

    public void addReview(String review){
        reviews.add(review);
    }

    public void displayReviews(){
        System.out.printf("\nStock reviews for %s\n", getName());
        for(String review : reviews){
            System.out.printf("=> %s\n", review);
        }
    }

    public String toString(){
        return String.format(formatString, symbol, name, lastPrice, volume);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public double getLastPrice() {
        return lastPrice;
    }
    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static void main(String[] args) {
        // Stock tesla = new Stock("Tesla Inc.", "TSLA", 476.40d, 57_096_724);
        // System.out.println(tesla);

    }
}
