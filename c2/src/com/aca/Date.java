package com.aca;

public class Date {
    public static void main(String[] args) {
        String day      = "Monday";
        String date     = "9";
        String month    = "February";
        String year     = "2021";

        String amerFmt  = "%s, %s %s, %s\n";
        String euroFmt  = "%s %s %s %s\n";

        System.out.print("American format: ");
        System.out.printf(amerFmt, day, month, date, year);

        System.out.print("European format: ");
        System.out.printf(euroFmt, day, date, month, year);
    }
}
