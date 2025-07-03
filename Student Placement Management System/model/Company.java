package model;

public class Company {
    private String name;
    private double minCgpa;

    public Company(String name, double minCgpa) {
        this.name = name;
        this.minCgpa = minCgpa;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getMinCgpa() {
        return minCgpa;
    }

    @Override
    public String toString() {
        return "Company: " + name + ", Min CGPA Required: " + minCgpa;
    }
}
