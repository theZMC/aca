package com.aca;

public class SwitchTest {
    public static void main(String[] args) {
        isFruitOrVegetable("cherry");
        isFruitOrVegetable("carrot");
        isFruitOrVegetable("ice cream");
    }
    private static void isFruitOrVegetable(String food) {
        switch (food) {
            case "apple": 
            case "orange": 
            case "banana": 
            case "strawberry": 
            case "cherry":
                System.out.println(food + " is a fruit.");
                break;
            case "broccoli": 
            case "tomato": 
            case "cucumber": 
            case "spinach": 
            case "carrot":
                System.out.println(food + " is a vegetable.");
                break;
            default:
                System.out.println(food + " is not a fruit or vegetable.");
        }        
    }
}
