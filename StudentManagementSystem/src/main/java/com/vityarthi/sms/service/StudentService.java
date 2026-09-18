package com.vityarthi.sms.service;

import com.vityarthi.sms.model.Student;
import com.vityarthi.sms.repository.StudentRepository;
import com.vityarthi.sms.util.Validator;
import java.util.List;

public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) { this.repository = repository; }

    public void add(Student s) {
        Validator.validate(s);
        if (repository.findById(s.getId()).isPresent()) throw new IllegalArgumentException("Student ID already exists.");
        repository.save(s);
    }

    public void update(Student s) {
        Validator.validate(s);
        Student existing = repository.findById(s.getId())
                .orElseThrow(() -> new IllegalArgumentException("Student not found."));
        existing.update(s.getName(), s.getAge(), s.getEmail(), s.getMarks());
        repository.save(existing);
    }

    public void delete(int id) {
        if (repository.findById(id).isEmpty()) throw new IllegalArgumentException("Student not found.");
        repository.delete(id);
    }

    public List<Student> getAll() { return repository.findAll().stream().toList(); }

    public List<Student> search(String query) {
        String q = query.toLowerCase();
        return repository.findAll().stream()
                .filter(s -> String.valueOf(s.getId()).equals(q) || s.getName().toLowerCase().contains(q))
                .toList();
    }
}
