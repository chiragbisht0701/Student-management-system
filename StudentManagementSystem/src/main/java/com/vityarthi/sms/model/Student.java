package com.vityarthi.sms.model;

import java.io.Serializable;

public class Student implements Serializable {
    private final int id;
    private String name;
    private int age;
    private String email;
    private double marks;

    public Student(int id, String name, int age, String email, double marks) {
        this.id = id; this.name = name; this.age = age; this.email = email; this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public double getMarks() { return marks; }

    public void update(String name, int age, String email, double marks) {
        this.name = name; this.age = age; this.email = email; this.marks = marks;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Age: %d | Email: %s | Marks: %.2f",
                id, name, age, email, marks);
    }
}
