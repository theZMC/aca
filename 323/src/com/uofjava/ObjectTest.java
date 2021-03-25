package com.uofjava;

public class ObjectTest {
    public static void main(String[] args) {
        University uofjava = new University();
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

        uofjava.setName("University of Java");
        uofjava.setTeachers(teachers);
        uofjava.setDepartments(departments);

        System.out.println(uofjava);
        University.printDepartments(departments);
        University.printTeachers(teachers);
    }

    
}
