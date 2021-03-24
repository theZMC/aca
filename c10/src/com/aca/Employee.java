package com.aca;

import java.time.LocalDate;
import java.time.Period;

public class Employee{
    private String      firstName;
    private String      lastName;
    private LocalDate   birthday;
    private LocalDate   hireDate;

    public Employee(String firstName, String lastName, LocalDate birthday, LocalDate hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.hireDate = hireDate;
    }

    public String getFullName() {
        String first    = firstName.toLowerCase();
        String last     = lastName.toLowerCase();
        first = first.length() > 0 ? 
            first.substring(0,1).toUpperCase() + first.substring(1) : 
            "";
        last = last.length() > 0 ? 
            last.substring(0,1).toUpperCase() + last.substring(1) : 
            "";
        return first + " " + last;
    }

    public boolean hasTenured(int tenureThreshold){
        Period interval = Period.between(this.hireDate, LocalDate.now());
        return interval.getYears() >= tenureThreshold;
    }

    public boolean wasBornToday() {
        Period interval = Period.between(this.birthday, LocalDate.now());
        return interval.getDays() == 0 && interval.getMonths() == 0;
    }

    public String toString(){
        String format = "%s %s %s";
        return String.format(format, getFullName(), getBirthday(), getHireDate());
    }

    public String toString(String format){
        return String.format(format, getFullName(), getBirthday(), getHireDate());
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
}
