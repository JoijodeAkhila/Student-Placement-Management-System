package service;

import model.Application;
import model.Company;
import model.Student;

import java.util.ArrayList;

public class PlacementService {
    private ArrayList<Application> applicationList = new ArrayList<>();

    public void apply(Student student, Company company) {
        if (student.isPlaced()) {
            System.out.println("Already placed.");
            return;
        }

        if (student.getCgpa() < company.getMinCgpa()) {
            System.out.println("Not eligible.");
            return;
        }

        // Prevent duplicate
        for (Application a : applicationList) {
            if (a.getStudentId().equalsIgnoreCase(student.getId()) &&
                a.getCompanyName().equalsIgnoreCase(company.getName())) {
                System.out.println("Already applied.");
                return;
            }
        }

        applicationList.add(new Application(student.getId(), company.getName()));
        System.out.println("Application submitted.");
    }

    public void viewApplications() {
        if (applicationList.isEmpty()) {
            System.out.println("No applications.");
            return;
        }

        for (Application a : applicationList) {
            System.out.println(a);
        }
    }

    public void selectStudent(String studentId, String companyName) {
        boolean found = false;

        for (Application a : applicationList) {
            if (a.getStudentId().equalsIgnoreCase(studentId) &&
                a.getCompanyName().equalsIgnoreCase(companyName)) {

                a.setStatus("Selected");
                found = true;
            }
        }

        if (found) {
            System.out.println("Student selected.");
        } else {
            System.out.println("Application not found.");
        }
    }

    public void placeStudent(Student student) {
        if (student.isPlaced()) {
            System.out.println("Already placed.");
            return;
        }

        student.setPlaced(true);
        System.out.println("Student placed successfully.");
    }
}
