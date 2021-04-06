package com.aca;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(1991, 11, 7);
        Date date2 = new Date(2010, 4, 6);
        Date date3 = new Date(2004, 9, 12);
        Date date4 = new Date();

        System.out.println(date1.getDate());
        System.out.println(date2.getDate());
        System.out.println(date3.getDate());
        System.out.println(date4.getDate());
    }
}
