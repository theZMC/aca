package com.uofjava;

public class Department {
    private String  name;
    private int     numberOfMajors;
    private Teacher departmentHead;

    private static final String stringFormat = "%24s%24s%24s";

    public Department(String name, int numberOfMajors, Teacher departmentHead){
        this.name           = name;
        this.numberOfMajors = numberOfMajors;
        this.departmentHead = departmentHead;
    }

    public String toString(){
        return String.format(stringFormat, name, Integer.toString(numberOfMajors), departmentHead.getFullName());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfMajors() {
        return numberOfMajors;
    }
    public void setNumberOfMajors(int numberOfMajors) {
        this.numberOfMajors = numberOfMajors;
    }
    public Teacher getDepartmentHead() {
        return departmentHead;
    }
    public void setDepartmentHead(Teacher departmentHead) {
        this.departmentHead = departmentHead;
    }
    public static String getStringFormat() {
        return stringFormat;
    }
}