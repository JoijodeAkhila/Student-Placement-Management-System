package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> studentList = new ArrayList<>();

    // Register a new student
    public void registerStudent(String id, String name, double cgpa) {
        Student student = new Student(id, name, cgpa);
        studentList.add(student);
        System.out.println("✅ Student registered: " + student.getName());
    }

    // View all students
    public void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("📭 No students registered yet.");
            return;
        }

        System.out.println("\n📚 Registered Students:");
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }

    // Get student by ID
    public Student getStudentById(String id) {
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    // Get all students (for other services to use)
    public ArrayList<Student> getAllStudents() {
        return studentList;
    }
}
