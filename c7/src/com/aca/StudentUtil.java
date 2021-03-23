package com.aca;

public class StudentUtil {
    public static Student[] getStudents(){

        Student s1 = new Student();
        s1.setFirstName("Dan");
        s1.setLastName("Lazenby");
        s1.setGpa(2.5);

        Student s2 = new Student();
        s2.setFirstName("Jill");
        s2.setLastName("Movie");
        s2.setGpa(3.5);

        Student s3 = new Student();
        s3.setFirstName("Teresa");
        s3.setLastName("Smith");
        s3.setGpa(4.0);

        Student[] students = {s1, s2, s3};

        return students;
    }
}
