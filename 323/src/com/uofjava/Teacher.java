package com.uofjava;

public class Teacher {
    private String  title;
    private String  firstName;
    private String  lastName;
    private boolean isTenured;

    private static String stringFormat = "%20s %20s %20s";

    public Teacher(String title, String firstName, String lastName, boolean isTenured) {
        this.title      = title;
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.isTenured  = isTenured;
    }

    public String toString() {
        return String.format(stringFormat, title, getFullName(), isTenured ? "Tenured" : "Not Tenured");
    }

    public String getFullName() {
        String first    = firstName.toLowerCase();
        String last     = lastName.toLowerCase();

        first = first.length() > 0 ?
            first.substring(0,1).toUpperCase() + first.substring(1) : "";

        last = last.length() > 0 ?
            last.substring(0,1).toUpperCase() + last.substring(1) : "";

        return first + " " + last;
    }

    public String getTitle() {
        return title;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public boolean isTenured() {
        return isTenured;
    }
    public static String getStringFormat() {
        return stringFormat;
    }
}
