package com.aca;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("dan", "Lazenby", LocalDate.of(1967,3,23), LocalDate.now()),
            new Employee("Zach", "callahan", LocalDate.of(1990,3,23), LocalDate.of(1981,3,23)),
            new Employee("alison", "wish", LocalDate.of(1969,3,23), LocalDate.now())        
        };
        
        printEmployees(employees);
        
        System.out.println("\nBirthdays:");
        printEmployees(getEmployeesBornToday(employees));

        int tenureThreshold = 40;
        System.out.println("\nTenured Employees (" + tenureThreshold + "+ years):");
        printEmployees(getTenuredEmployees(employees, tenureThreshold));
    }

    private static Employee[] getTenuredEmployees(Employee[] employees, int tenureThreshold){
        int[]   tenuredIndexes  = new int[employees.length];
        int     numOfTenured    = 0;

        // Loop to figure out how many employees match the condition and who they are.
        for(int i = 0; i < employees.length; i++){
            Period interval = Period.between(employees[i].getHireDate(),LocalDate.now());
            if(interval.getYears() >= tenureThreshold){
                tenuredIndexes[i] = i;
                numOfTenured++;
            } else {
                tenuredIndexes[i] = -1;
            }
        }

        // Now that we know how many there are, we can build our output array.
        Employee[] out = new Employee[numOfTenured];
        
        if(numOfTenured > 0){
            int outIndex = 0;

            // Loop to build our output array.
            for(int i = 0; i < employees.length; i++){
                if(tenuredIndexes[i] == i){
                    out[outIndex] = employees[i];
                    outIndex++;
                }
            }
        }

        return out;
    }
    
    private static Employee[] getEmployeesBornToday(Employee[] employees){
        int[]   bDayIndexes     = new int[employees.length];
        int     numOfBdaysToday = 0;

        for(int i = 0; i < employees.length; i++){
            Period interval = Period.between(employees[i].getBirthday(), LocalDate.now());
            if(interval.getDays() == 0 && interval.getMonths() == 0){
                bDayIndexes[i] = i;
                numOfBdaysToday++;
            } else {
                bDayIndexes[i] = -1;
            }
        }
        
        Employee[] out = new Employee[numOfBdaysToday];
        
        if(numOfBdaysToday > 0){
            int outIndex = 0;
            for(int i = 0; i < employees.length; i++){
                if(bDayIndexes[i] == i){
                    out[outIndex] = employees[i];
                    outIndex++;
                }
            }
        }

        return out;
    }

    private static void printEmployees(Employee[] employees){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
