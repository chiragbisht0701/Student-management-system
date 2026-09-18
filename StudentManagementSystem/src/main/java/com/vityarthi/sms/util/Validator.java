package com.vityarthi.sms.util;

import com.vityarthi.sms.model.Student;

public final class Validator {
    private Validator() {}

    public static void validate(Student s) {
        if (s.getId() <= 0) throw new IllegalArgumentException("ID must be positive.");
        if (s.getName() == null || s.getName().isBlank()) throw new IllegalArgumentException("Name is required.");
        if (s.getAge() < 10 || s.getAge() > 100) throw new IllegalArgumentException("Age must be between 10 and 100.");
        if (s.getEmail() == null || !s.getEmail().matches("^[^@\s]+@[^@\s]+\.[^@\s]+$"))
            throw new IllegalArgumentException("Enter a valid email.");
        if (s.getMarks() < 0 || s.getMarks() > 100) throw new IllegalArgumentException("Marks must be 0-100.");
    }
}
