package com.aca;

public class Chaining {
    public static void main(String[] args) {
        String message = getValueMessage(45);
        System.out.println("message: " + message);
    }
    private static String getValueMessage(int num) {
        String message;
        if(num > 0){
            message = "positive";
        }
        else
        if(num < 0){
            message = "negative";
        }
        else {
            message = "zero";
        }
        return num + " is " + message;
    }
}