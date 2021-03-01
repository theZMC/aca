package com.aca;

public class Average {
    public static void main(String[] args) {
        int one     = 1;
        int two     = 2;
        int three   = 3;
        int four    = 4;

        double avg  = (one + two + three + four) / 4.0;

        System.out.println(avg);

        /*  Displays 112.0 because 50/4 is int 12 */
        System.out.println(100.0 + 50/4);

        /*  Can cast either value to double to correct 
            if necessary. */
        System.out.println(100.0 + (double) 50/4);
    }
}