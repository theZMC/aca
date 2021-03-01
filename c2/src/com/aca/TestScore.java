package com.aca;

public class TestScore {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 3;
        String student1 = "Dan";
        String student2 = "Jane";
        String student3 = "Sam";

        double test1    = 91.0;
        double test2    = 78.0;
        double test3    = 99.0;

        System.out.println("Student Scores");
        System.out.printf("%s\t%f\n", student1, test1);
        System.out.printf("%s\t%f\n", student2, test2);
        System.out.printf("%s\t%f\n", student3, test3);
        System.out.println("\t-----");
        System.out.println("total\t" + (test1 + test2 + test3));
        System.out.println("avg\t" + ( (test1 + test2 + test3) / (double) NUMBER_OF_STUDENTS ));
    }
}
