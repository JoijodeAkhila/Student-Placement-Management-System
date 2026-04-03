package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void registerStudent(String id, String name, double cgpa) {
        Student student = new Student(id, name, cgpa);
        studentList.add(student);
        System.out.println("Student registered: " + name);
    }

    public void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students registered.");
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
