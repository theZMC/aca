package com.aca;

import java.time.LocalDate;
import java.util.Arrays;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
            //          firstName   lastName    birthday                    hireDate
            new Employee("dan",     "Lazenby",  LocalDate.of(1967,3,24),    LocalDate.now()),
            new Employee("zach",    "callahan", LocalDate.of(1990,9,3),     LocalDate.of(1981,3,23)),
            new Employee("alison",  "wish",     LocalDate.of(1969,3,23),    LocalDate.now())
        };

        int tenureThreshold = 40;

        Employee[] employeesBornToday   = getEmployeesBornToday(employees);
        Employee[] tenuredEmployees     = getTenuredEmployees(employees, tenureThreshold);

        System.out.printf("\nAll Employees:\n");
        printEmployees(employees);

        System.out.printf("\nToday's Birthdays:\n");
        printEmployees(employeesBornToday);

        System.out.printf("\nTenured Employees (%s+ years):\n", tenureThreshold);
        printEmployees(tenuredEmployees);
    }

    private static Employee[] getTenuredEmployees(Employee[] employees, int tenureThreshold){
        return Arrays.stream(employees)
            .filter(employee -> employee.hasTenured(tenureThreshold))
            .toArray(Employee[]::new);
    }

    private static Employee[] getEmployeesBornToday(Employee[] employees){
        return Arrays.stream(employees)
            .filter(employee -> employee.wasBornToday(LocalDate.now()))
            .toArray(Employee[]::new);
    }

    private static void printEmployees(Employee[] employees){
        System.out.printf(Employee.getOutputFormat() + "\n", "Full Name","Birthday","Hire Date");
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
