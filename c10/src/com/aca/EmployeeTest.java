package com.aca;

import java.time.LocalDate;
import java.util.Arrays;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
            //          firstName   lastName    birthday                    hireDate
            new Employee("dan",     "Lazenby",  LocalDate.of(1967,3,23),    LocalDate.now()),
            new Employee("zach",    "callahan", LocalDate.of(1990,9,3),     LocalDate.of(1981,3,23)),
            new Employee("alison",  "wish",     LocalDate.of(1969,3,23),    LocalDate.now())        
        };
        
        printEmployees(employees);
        
        System.out.println("\nBirthdays:");
        printEmployees(getEmployeesBornToday(employees));

        int tenureThreshold = 40;
        System.out.println("\nTenured Employees (" + tenureThreshold + "+ years):");
        printEmployees(getTenuredEmployees(employees, tenureThreshold));
    }

    private static Employee[] getTenuredEmployees(Employee[] employees, int tenureThreshold){
        return Arrays.stream(employees)
            .filter(employee -> employee.hasTenured(tenureThreshold))
            .toArray(Employee[]::new);
    }

    private static Employee[] getEmployeesBornToday(Employee[] employees){
        return Arrays.stream(employees)
            .filter(employee -> employee.wasBornToday())
            .toArray(Employee[]::new);
    }

    private static void printEmployees(Employee[] employees){
        for(Employee employee : employees){
            System.out.println(employee.getFullName());
        }
    }
}
