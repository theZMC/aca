package com.aca;

public class Switch {
    public static void main(String[] args) {
        int month   = 2;
        int year    = 2016;

        // ...the rest have 31
        int num     = 31;

        switch (month) {
            // 30 days hath september, april, june, and november...
            case 9: 
            case 4:
            case 6: 
            case 11: 
                num = 30; 
                break;

            // ...february has 28 (or 29 in a leap year)...
            case 2:
                num = ( year % 4 == 0 ) ? 29 : 28; 
                break;
        }
        System.out.printf("%d/%d: %d days\n", month, year, num);
    }
}
