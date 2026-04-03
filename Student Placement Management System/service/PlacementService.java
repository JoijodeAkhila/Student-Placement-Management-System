package service;

import model.*;
import java.util.*;

public class PlacementService {
    private List<Application> applicationList = new ArrayList<>();

    public void apply(Student s, Company c) {

    	if (s.getOfferCount() >= 3) {
    	    System.out.println("Maximum 3 offers reached.");
    	    return;
    	}

        if (s.getOfferCount() >= 3) {
            System.out.println("Maximum 3 offers reached.");
            return;
        }

        if (s.getCgpa() < c.getMinCgpa()) {
            System.out.println("CGPA not eligible.");
            return;
        }

        if (!s.hasAllSkills(c.getRequiredSkills())) {
            System.out.println("Skill mismatch.");
            return;
        }

        for (Application a : applicationList) {
            if (a.getStudentId().equalsIgnoreCase(s.getId()) &&
                a.getCompanyName().equalsIgnoreCase(c.getName())) {
                System.out.println("Already applied.");
                return;
            }
        }

        applicationList.add(new Application(s.getId(), c.getName()));
        System.out.println("Application successful.");
    }

    public void selectStudent(Student s, String companyName) {
        for (Application a : applicationList) {
            if (a.getStudentId().equalsIgnoreCase(s.getId()) &&
                a.getCompanyName().equalsIgnoreCase(companyName)) {

                if (!a.getStatus().equals("Selected")) {
                    a.setStatus("Selected");
                    s.incrementOffer();

                    if (s.getOfferCount() >= 3) {
                        s.setPlaced(true);
                    }

                    System.out.println("Student selected. Offers: " + s.getOfferCount());
                    return;
                }
            }
        }
        System.out.println("Application not found.");
    }

    public void viewApplications() {
        for (Application a : applicationList) {
            System.out.println(a);
        }
    }
}
