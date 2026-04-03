package service;

import model.Student;
import java.util.*;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public void registerStudent(String id, String name, double cgpa, List<String> skills) {

        if (cgpa < 0 || cgpa > 10) {
            System.out.println("Invalid CGPA.");
            return;
        }

        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        studentList.add(new Student(id, name, cgpa, skills));
        System.out.println("Student registered.");
    }

    public Student getStudentById(String id) {
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) return s;
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    public void viewAllStudents() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
