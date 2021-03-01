package com.aca;

public class Comparison {
    public static void main(String[] args) {
        String txt  = "Fantastic ";
        String lang = "Java";
        int dozen   = 12;
        int score   = 20;

        boolean state = (txt == lang);
        System.out.println("String Equality Test: " + state);

        state = (txt != lang);
        System.out.println("String Inequality Test: " + state);

        state = (dozen < score);
        System.out.println("Less Than Test: " + state);
    }
}
