package com.aca;

public class StudentProcessing {
    public static void main(String[] args) {
        Student[] students = StudentUtil.getStudents();
        System.out.println("number of students: " + students.length);

        printAllStudentInfo(students);

        // create and call a method to display the student info for the student
        // with the highest gpa
        printValedictorianInfo(students);

        // create and call a method that returns the average gpa for all students
        printAverageGpa(students);
    }

    private static void printAverageGpa(Student[] students) {
        double totalGpa = 0.0;
        for(int i = 0; i < students.length; i++){
            totalGpa += students[i].getGpa();
        }

        double average = totalGpa / (double) students.length;
        System.out.printf("\nThe average gpa is %.2f", average);
    }
    
    private static void printValedictorianInfo(Student[] students) {
        int highestGpaIndex = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].getGpa() > students[highestGpaIndex].getGpa()){
                highestGpaIndex = i;
            }
        }
        printStudentInfo(students[highestGpaIndex]);
    }

    private static void printAllStudentInfo(Student[] students) {
        for(int i = 0; i < students.length; i++){
            printStudentInfo(students[i]);
        }
    }

    private static void printStudentInfo(Student student){
        String name = student.getFirstName() + " " + student.getLastName();
        System.out.println(name + " " + student.getGpa());
    }
}