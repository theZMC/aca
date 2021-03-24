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

        Department[] departments = {
            new Department("Department of Surgery", 10, teachers[1]),
            new Department("Department of Nursing", 6, teachers[2])
        };

        printTeachers(teachers);
        printDepartments(departments);
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
    private static void printDepartments(Department[] departments) {
        String header = String.format(Department.getStringFormat(), "Department Name", "Majors", "Department Head");
        System.out.println();
        System.out.println((char)27 + "[4m" + header + (char)27 + "[0m");
        for(Department department : departments) {
            System.out.println(department);
        }
        System.out.println();
    }
}
