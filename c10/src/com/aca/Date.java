package com.aca;

import java.time.LocalDate;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int year, int month, int day){
        this.year   = year;
        this.month  = month;
        this.day    = day;
    }

    public Date(){
        this.year = 2000;
        this.month = 12;
        this.day = 31;
    }

    public LocalDate getDate(int year, int month, int day){
        return LocalDate.of(year, month, day);
    }

    public LocalDate getDate(){
        return getDate(this.year, this.month, this.day);
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
