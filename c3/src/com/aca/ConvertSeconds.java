package com.aca;

import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        final int SECS_IN_HOUR  = 3600;
        final int SECS_IN_MIN   = 60;

        Scanner in = new Scanner(System.in);

        int secs;
        int hours;
        int mins;

        System.out.print("How many seconds? ");
        
        secs =   in.nextInt();
        System.out.print(secs);

        hours = secs / SECS_IN_HOUR;
        secs =  secs % SECS_IN_HOUR;

        mins =  secs / SECS_IN_MIN;
        secs =  secs % SECS_IN_MIN;

        System.out.printf(" seconds = %d hours, %d minutes, and %d seconds.\n", hours, mins, secs);

        in.close();
    }
}
