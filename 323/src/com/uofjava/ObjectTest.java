package com.uofjava;

public class ObjectTest {
    public static void main(String[] args) {
        Teacher[] teachers = {
                        // Title                First Name  Last Name       Tenure Status
            new Teacher("Assistant Professor",  "Charles",  "Winchester",   false),
            new Teacher("Associate Professor",  "Hawkeye",  "Pierce",       true),
            new Teacher("Adjunct Professor",    "Margaret", "Houlihan",     false),
            new Teacher("Professor",            "Benjamin", "Hunnicutt",    true)
        };

        printTeachers(teachers);
    }

    private static void printTeachers(Teacher[] teachers) {
        String header = String.format(Teacher.getStringFormat(), "Title", "Full Name", "Tenure Status");
        System.out.println();
        System.out.println((char)27 + "[4m" + header + (char)27 + "[0m");
        for(Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println();
    }
}
