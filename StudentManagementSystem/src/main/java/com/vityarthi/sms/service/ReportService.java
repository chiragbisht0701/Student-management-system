package com.vityarthi.sms.service;

import com.vityarthi.sms.model.Student;
import java.util.List;

public class ReportService {
    private final StudentService service;
    public ReportService(StudentService service) { this.service = service; }

    public void printSummary() {
        List<Student> students = service.getAll();
        if (students.isEmpty()) {
            System.out.println("No data available for report.");
            return;
        }
        double average = students.stream().mapToDouble(Student::getMarks).average().orElse(0);
        long passed = students.stream().filter(s -> s.getMarks() >= 40).count();
        System.out.printf("Students: %d | Average marks: %.2f | Passed: %d | Failed: %d%n",
                students.size(), average, passed, students.size() - passed);
    }
}
