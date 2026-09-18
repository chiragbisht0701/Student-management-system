package com.vityarthi.sms.repository;

import com.vityarthi.sms.model.Student;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class StudentRepository {
    private final Path file = Paths.get("data", "students.dat");
    private final Map<Integer, Student> students = new LinkedHashMap<>();

    public StudentRepository() {
        load();
    }

    public Collection<Student> findAll() { return students.values(); }
    public Optional<Student> findById(int id) { return Optional.ofNullable(students.get(id)); }
    public void save(Student student) { students.put(student.getId(), student); persist(); }
    public void delete(int id) { students.remove(id); persist(); }

    private void load() {
        if (!Files.exists(file)) return;
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(file))) {
            Object data = in.readObject();
            if (data instanceof Map<?, ?> map) {
                map.forEach((k, v) -> {
                    if (k instanceof Integer && v instanceof Student s) students.put((Integer) k, s);
                });
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Could not load saved data: " + ex.getMessage());
        }
    }

    private void persist() {
        try {
            Files.createDirectories(file.getParent());
            try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(file))) {
                out.writeObject(students);
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Could not save student data.", ex);
        }
    }
}
