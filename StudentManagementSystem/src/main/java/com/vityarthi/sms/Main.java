package com.vityarthi.sms;

import com.vityarthi.sms.model.Student;
import com.vityarthi.sms.repository.StudentRepository;
import com.vityarthi.sms.service.ReportService;
import com.vityarthi.sms.service.StudentService;
import com.vityarthi.sms.util.InputUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        ReportService reports = new ReportService(service);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Delete student");
            System.out.println("4. List students");
            System.out.println("5. Search students");
            System.out.println("6. Academic report");
            System.out.println("0. Exit");

            int choice = InputUtil.readInt(scanner, "Choose: ", 0, 6);
            try {
                switch (choice) {
                    case 1 -> addStudent(scanner, service);
                    case 2 -> updateStudent(scanner, service);
                    case 3 -> deleteStudent(scanner, service);
                    case 4 -> printStudents(service.getAll());
                    case 5 -> search(scanner, service);
                    case 6 -> reports.printSummary();
                    case 0 -> { System.out.println("Goodbye."); return; }
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

    private static Student readStudent(Scanner sc, int id) {
        String name = InputUtil.readNonEmpty(sc, "Name: ");
        int age = InputUtil.readInt(sc, "Age: ", 10, 100);
        String email = InputUtil.readNonEmpty(sc, "Email: ");
        double marks = InputUtil.readDouble(sc, "Marks (0-100): ", 0, 100);
        return new Student(id, name, age, email, marks);
    }

    private static void addStudent(Scanner sc, StudentService service) {
        int id = InputUtil.readInt(sc, "Student ID: ", 1, Integer.MAX_VALUE);
        service.add(readStudent(sc, id));
        System.out.println("Student added.");
    }

    private static void updateStudent(Scanner sc, StudentService service) {
        int id = InputUtil.readInt(sc, "Student ID to update: ", 1, Integer.MAX_VALUE);
        service.update(readStudent(sc, id));
        System.out.println("Student updated.");
    }

    private static void deleteStudent(Scanner sc, StudentService service) {
        int id = InputUtil.readInt(sc, "Student ID to delete: ", 1, Integer.MAX_VALUE);
        service.delete(id);
        System.out.println("Student deleted.");
    }

    private static void search(Scanner sc, StudentService service) {
        String query = InputUtil.readNonEmpty(sc, "Search name or ID: ");
        printStudents(service.search(query));
    }

    private static void printStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        students.forEach(System.out::println);
    }
}
