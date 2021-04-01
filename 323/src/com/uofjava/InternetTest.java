package com.uofjava;

import java.time.LocalDate;

public class InternetTest {
    public static void main(String[] args) {
        Internet[] internets = {
            new Internet("Premier", 20, 200, LocalDate.of(2019,6,22), LocalDate.of(2022,6,22)),
            new Internet("Ultimate", 50, 600, LocalDate.of(2019,6,22), LocalDate.of(2022,6,22)),
            new Internet("Basic", 10, 50, LocalDate.of(2019,6,22), LocalDate.of(2022,6,22)),
            new Internet("Barely", 1, 5, LocalDate.of(2019,6,22), LocalDate.of(2022,6,22))
        };

        printInternets(internets);
    }

    private static void printInternets(Internet[] internets) {
        String header = String.format(
            Internet.getStringFormat(),
            "Product ID", "Speed Up",
            "Speed Down", "Start Date",
            "End Date"
        );

        System.out.println();
        System.out.println((char)27 + "[4m" + header + (char)27 + "[0m");
        for(Internet internet : internets) {
            System.out.println(internet);
        }
    }
}
