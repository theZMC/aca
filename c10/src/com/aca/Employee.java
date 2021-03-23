package com.aca;

import java.time.LocalDate;

public class Employee extends Object{
    private String      firstName;
    private String      lastName;
    private LocalDate   birthday;
    private LocalDate   hireDate;

    public Employee(String firstName, String lastName, LocalDate birthday, LocalDate hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.hireDate = hireDate;
    }

    public String getFullName() {
        String firstName = "";
        String lastName = "";
        if(this.firstName.length() > 0){
            firstName = this.firstName.substring(0,1).toUpperCase() + this.firstName.substring(1);
        }

        if(this.lastName.length() > 0){
            lastName = this.lastName.substring(0,1).toUpperCase() + this.lastName.substring(1);
        }
        return firstName + " " + lastName;
    }

    @Override
    public String toString(){
        String format = "Name: %s\tBirthday: %s\tHire Date: %s";
        return String.format(format, getFullName(), getBirthday(), getHireDate());
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}
