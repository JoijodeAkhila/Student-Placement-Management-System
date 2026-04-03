package service;

import model.*;
import java.util.*;

public class CompanyService {
    private List<Company> companyList = new ArrayList<>();

    public void registerCompany(String name, double cgpa, List<String> skills) {
        companyList.add(new Company(name, cgpa, skills));
        System.out.println("Company registered.");
    }

    public Company getCompanyByName(String name) {
        for (Company c : companyList) {
            if (c.getName().equalsIgnoreCase(name)) return c;
        }
        return null;
    }

    public List<Company> getAllCompanies() {
        return companyList;
    }

    public void showEligibleStudents(Company company, List<Student> students) {
        boolean found = false;

        for (Student s : students) {
            if (!s.isPlaced() &&
                s.getOfferCount() < 3 &&
                s.getCgpa() >= company.getMinCgpa() &&
                s.hasAllSkills(company.getRequiredSkills())) {

                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No eligible students found.");
        }
    }
}
