package service;

import model.Application;
import model.Company;
import model.Student;

import java.util.ArrayList;

public class PlacementService {
    private ArrayList<Application> applicationList = new ArrayList<>();

    // Student applies to company
    public void apply(Student student, Company company) {
        if (student.isPlaced()) {
            System.out.println("⚠️ Student already placed. Cannot apply.");
            return;
        }

        if (student.getCgpa() < company.getMinCgpa()) {
            System.out.println("❌ Student not eligible for this company.");
            return;
        }

        Application app = new Application(student.getId(), company.getName());
        applicationList.add(app);
        System.out.println("✅ Application submitted for " + student.getName() + " to " + company.getName());
    }

    // View all applications
    public void viewApplications() {
        if (applicationList.isEmpty()) {
            System.out.println("📭 No applications submitted yet.");
            return;
        }

        System.out.println("\n📄 Applications:");
        for (Application app : applicationList) {
            System.out.println(app.toString());
        }
    }

    // Mark a student as selected
    public void selectStudent(String studentId) {
        for (Application app : applicationList) {
            if (app.getStudentId().equalsIgnoreCase(studentId)) {
                app.setStatus("Selected");
            }
        }
        System.out.println("✅ Student " + studentId + " marked as Selected.");
    }

    // Mark student as placed (update Student object directly)
    public void placeStudent(Student student) {
        student.setPlaced(true);
        System.out.println("🎉 " + student.getName() + " is now placed!");
    }

    // Get all applications
    public ArrayList<Application> getAllApplications() {
        return applicationList;
    }
}
