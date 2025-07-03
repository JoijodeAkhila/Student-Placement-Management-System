package service;

import model.Company;
import model.Student;
import java.util.ArrayList;

public class CompanyService {
    private ArrayList<Company> companyList = new ArrayList<>();

    // Register a new company
    public void registerCompany(String name, double minCgpa) {
        Company company = new Company(name, minCgpa);
        companyList.add(company);
        System.out.println("✅ Company registered: " + name);
    }

    // View all companies
    public void viewAllCompanies() {
        if (companyList.isEmpty()) {
            System.out.println("📭 No companies registered yet.");
            return;
        }

        System.out.println("\n🏢 Registered Companies:");
        for (Company c : companyList) {
            System.out.println(c.toString());
        }
    }

    // Get company by name
    public Company getCompanyByName(String name) {
        for (Company c : companyList) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    // Get eligible students for a company
    public ArrayList<Student> getEligibleStudents(Company company, ArrayList<Student> allStudents) {
        ArrayList<Student> eligible = new ArrayList<>();
        for (Student s : allStudents) {
            if (!s.isPlaced() && s.getCgpa() >= company.getMinCgpa()) {
                eligible.add(s);
            }
        }
        return eligible;
    }

    // Get all companies
    public ArrayList<Company> getAllCompanies() {
        return companyList;
    }
}
