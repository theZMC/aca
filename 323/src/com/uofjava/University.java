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
        System.out.println(underline(header));
        for(Department department : departments) {
            System.out.println(department);
        }
        System.out.println();
    }

    public static void printTeachers(Teacher[] teachers) {
        String header = String.format(Teacher.getStringFormat(), "Title", "Full Name", "Tenure Status");
        System.out.println();
        System.out.println(underline(header));
        for(Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println();
    }

    private static String underline(String underlineThis){
        return (char)27 + "[4m" + underlineThis + (char)27 + "[0m";
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
