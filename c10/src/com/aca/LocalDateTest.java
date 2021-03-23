package com.aca;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate   now         = LocalDate.now();
        LocalDate   then        = LocalDate.of(2000, 1, 1);
        LocalDate   birthday    = LocalDate.of(1990, 9, 3);
        LocalDate   tomorrow    = now.plusDays(1);
        Period      period      = Period.between(birthday, now);
        long        age         = ChronoUnit.YEARS.between(birthday, now);

        System.out.println("now: " + now);
        System.out.println("then: " + then);
        System.out.println("birthday: " + birthday);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("age: " + age);

        System.out.println("DIFFERENCE:");
        System.out.println(" years: " + period.getYears());
        System.out.println("months: " + period.getMonths());
        System.out.println("  days: " + period.getDays());
    }
}
