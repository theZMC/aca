package com.aca;

public class Display {
    public static void main(String[] args) {
        int x = 1;

        /*  The expression x == 2 evals to a boolean false,
            so "false" is printed to the output stream. x
            is NOT modified, as double-equals (==) is a
            comparison operator and NOT an assignment 
            operator. */
        System.out.println(x == 2);
        System.out.println(x); // The value of x is printed.

        /*  The expression x=2 will evaluate and output whatever's
            on the right side of the equals sign. This is just
            a property of the assignment operator (=).This WILL 
            alter the value of x to be 2 going forward, however. */
        System.out.println(x = 2);
        System.out.println(x);
    }
}