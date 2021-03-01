package com.aca;

public class Time {
    public static void main(String[] args) {
        int startHour   = 0;
        int startMinute = 45;
        int startSecond = 37;

        int nowHour     = 0;
        int nowMinute   = 55;
        int nowSecond   = 22;    

        final int SECS_IN_HOUR  = 3600;
        final int SECS_IN_MIN   = 60;
        final int SECS_IN_DAY   = 86400;

        int elapsedSinceMidnight    = (nowHour * SECS_IN_HOUR) + 
                                    (nowMinute * SECS_IN_MIN) + 
                                    nowSecond;

        int elapsedSinceStart       = ((nowHour - startHour) * SECS_IN_HOUR) + 
                                    ((nowMinute - startMinute) * SECS_IN_MIN) + 
                                    (nowSecond - startSecond);

        double percentOfDay             = (double) elapsedSinceMidnight / (double) SECS_IN_DAY;
        String percentOfDayFormatted    = String.format("%.2f", percentOfDay * 100);

        System.out.println(elapsedSinceMidnight + " seconds since midnight.");
        System.out.println(SECS_IN_DAY - elapsedSinceMidnight + " seconds left in the day.");
        System.out.println(percentOfDayFormatted + "% of the day has passed.");
        System.out.println(elapsedSinceStart + " seconds have elapsed since I began working on this project.");
    }
}