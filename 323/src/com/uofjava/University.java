package com.uofjava;

public class University {
    String name;
    Department[] departments;
    Teacher[] teachers;

    public String toString(){
        return String.format("\n%-24s\n%4d Departments\n%4d Teachers", name, departments.length, teachers.length);
    }

    public static void printDepartments(Department[] departments) {
        String header = String.format(Department.getStringFormat(), "Department Name", "Majors", "Department Head");
        System.out.println();
        System.out.println((char)27 + "[4m" + header + (char)27 + "[0m");
        for(Department department : departments) {
            System.out.println(department);
        }
        System.out.println();
    }

    public static void printTeachers(Teacher[] teachers) {
        String header = String.format(Teacher.getStringFormat(), "Title", "Full Name", "Tenure Status");
        System.out.println();
        System.out.println((char)27 + "[4m" + header + (char)27 + "[0m");
        for(Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println();
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department[] getDepartments() {
        return departments;
    }
    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
    public Teacher[] getTeachers() {
        return teachers;
    }
    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
