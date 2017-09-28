package com.theironyard.demo;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by calvinwebster on 9/28/17.
 */
public class Student {

    private double gpa;
    private int classyear; // 1 = freshman, 2 = sophomore ..etc
    private String name;
    private String major;

    public Student() {
    }

    public Student(double gpa, int classyear, String name, String major) {
        this.gpa = gpa;
        this.classyear = classyear;
        this.name = name;
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getClassyear() {
        return classyear;
    }

    public void setClassyear(int classyear) {
        this.classyear = classyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public static List<Student> buildStudents () {
        List<Student> students = new ArrayList<>();

        students.add(new Student(3.5, 1, "Spencer Oakes", "Rocket Science"));
        students.add(new Student(2.5, 4, "Chris Sardina", "Rocket Science"));
        students.add(new Student(3.0, 3, "Stephen Schools", "Rocket Science"));
        students.add(new Student(4.0, 2, "Chad Crabtree", "Rocket Science"));
        students.add(new Student(1.5, 2, "Josh May", "Rocket Science"));
        students.add(new Student(2.7, 3, "Patrick Toomes", "Rocket Science"));
        students.add(new Student(3.5, 4, "Phil, just Phil", "Rocket Science"));

        return students;
    }
    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", classyear=" + classyear +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
