package com.aca;

public class DisplayNames {
    public static void main(String[] args) {
        String[] cities = {"Joplin", "Honolulu", "London", "Toronto"};
        displayArrayValues(cities);
        displayArrayValues(shiftRight(cities));
        displayArrayValues(shiftLeft(cities));
    }

    private static void displayArrayValues(String[] names) {
        for(String name : names){
            System.out.println(name);
        }
    }
    
    private static String[] shiftLeft(String[] array) {
        String[] outArray = new String[array.length];
        outArray[array.length-1] = array[0];
        for(int i = 0; i < array.length-1; i++){
            outArray[i] = array[i+1];
        }
        return outArray;
    }

    private static String[] shiftRight(String[] array){
        String[] outArray = new String[array.length];
        outArray[0] = array[array.length-1];
        for(int i = array.length-1; i > 0; i--){
            outArray[i] = array[i-1];
        }
        return outArray;
    }
}