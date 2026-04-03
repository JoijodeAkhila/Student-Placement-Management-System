package service;

import model.Company;
import java.util.ArrayList;

public class CompanyService {
    private ArrayList<Company> companyList = new ArrayList<>();

    public void registerCompany(String name, double minCgpa, String skill) {
        companyList.add(new Company(name, minCgpa, skill));
        System.out.println("Company registered.");
    }

    public void viewAllCompanies() {
        if (companyList.isEmpty()) {
            System.out.println("No companies.");
            return;
        }

        for (Company c : companyList) {
            System.out.println(c);
        }
    }

    public Company getCompanyByName(String name) {
        for (Company c : companyList) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Company> getAllCompanies() {
        return companyList;
    }
}
