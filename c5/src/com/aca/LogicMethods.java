package com.aca;

public class LogicMethods {
    public static void main(String[] args) {
        printIsLarge(98);
        printIsLarge(99);           // Expects no output
        printIsLarge(100);          // Expects no output
        
        printIsLargeOrSmall(100);   // Expects no output
        printIsLargeOrSmall(98);
        printIsLargeOrSmall(9);
        printIsLargeOrSmall(11);    // Expects no output

        printLargest(21, 44);
        printLargest(99, 14);
        printLargest(50, 50);

        printLargestOdd(33, 18);
        printLargestOdd(33, 33);
        printLargestOdd(32, 18);
        printLargestOdd(33, 15);
        printLargestOdd(21, 49);
    }

    private static void printIsLarge(int number) {
        if (number > 99) System.out.println("The number is large");
    }

    private static void printIsSmall(int number) {
        if (number < 10) System.out.println("The number is small");
    }

    private static void printIsLargeOrSmall(int number) {
        printIsLarge(number);
        printIsSmall(number);
    }

    private static void printLargest(int num1, int num2) {
        if(num1 == num2){
            System.out.println("The numbers are equal");
            return;            
        }
        int largest = (num1 > num2) ? num1 : num2;
        System.out.println("The largest number is: " + largest);
    }

    private static boolean isOdd(int num) {
        return (num % 2 == 0) ? false : true;        
    }

    private static void printLargestOdd(int number1, int number2) {
        if(!isOdd(number1) && !isOdd(number2)){
            System.out.println("Neither number is odd");
        }
        else
        if(isOdd(number1) && isOdd(number2)){
            if(number1 == number2){
                System.out.println("Two odds make an even: " + (number1 + number2));
            }
            else {
                System.out.println("The largest odd number is: " + ((number1 > number2) ? number1 : number2));
            }
        }
        else
        if(isOdd(number1)){
            System.out.println("The largest odd number is: " + number1);
        } 
        else {
            System.out.println("The largest odd number is: " + number2);
        }
    }
}
