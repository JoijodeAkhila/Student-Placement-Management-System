package service;

import model.*;
import java.util.ArrayList;

public class PlacementService {
    private ArrayList<Application> applicationList = new ArrayList<>();

    public void apply(Student student, Company company) {

        if (student.isPlaced()) {
            System.out.println("Already placed.");
            return;
        }

        if (student.getCgpa() < company.getMinCgpa()) {
            System.out.println("Not eligible (CGPA).");
            return;
        }

        if (!student.getSkill().equalsIgnoreCase(company.getRequiredSkill())) {
            System.out.println("Not eligible (Skill mismatch).");
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
        for (Application a : applicationList) {
            System.out.println(a);
        }
    }

    public void selectStudent(String studentId, String companyName) {
        for (Application a : applicationList) {
            if (a.getStudentId().equalsIgnoreCase(studentId) &&
                a.getCompanyName().equalsIgnoreCase(companyName)) {

                a.setStatus("Selected");
                System.out.println("Student selected.");
                return;
            }
        }
        System.out.println("Application not found.");
    }

    public void placeStudent(Student student) {
        student.setPlaced(true);
        System.out.println("Student placed.");
    }
}
