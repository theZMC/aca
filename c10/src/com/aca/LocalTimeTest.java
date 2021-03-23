package com.aca;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime   now             = LocalTime.now();
        LocalTime   startTime       = LocalTime.of(8, 15);
        LocalTime   endTime         = LocalTime.of(17, 30);
        long        hoursWorked     = ChronoUnit.HOURS.between(startTime, endTime);
        long        minutesWorked   = ChronoUnit.MINUTES.between(startTime, endTime);
        long        value           = minutesWorked % 60;

        System.out.println("now: " + now);
        System.out.println("hours worked: " + hoursWorked);
        System.out.println("minutes worked: " + minutesWorked);
        System.out.println("minutes worked beyond " + hoursWorked + " hours: " + value);
    }
}
