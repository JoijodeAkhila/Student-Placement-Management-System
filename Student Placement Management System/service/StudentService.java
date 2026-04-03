package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void registerStudent(String id, String name, double cgpa, String skill) {

        // Unique ID validation
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        studentList.add(new Student(id, name, cgpa, skill));
        System.out.println("Student registered.");
    }

    public void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students.");
            return;
        }

        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public Student getStudentById(String id) {
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Student> getAllStudents() {
        return studentList;
    }
}
