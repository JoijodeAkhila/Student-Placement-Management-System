package model;

public class Company {
    private String name;
    private double minCgpa;
    private String requiredSkill;

    public Company(String name, double minCgpa, String requiredSkill) {
        this.name = name;
        this.minCgpa = minCgpa;
        this.requiredSkill = requiredSkill;
    }

    public String getName() {
        return name;
    }

    public double getMinCgpa() {
        return minCgpa;
    }

    public String getRequiredSkill() {
        return requiredSkill;
    }

    @Override
    public String toString() {
        return "Company: " + name +
                ", Min CGPA: " + minCgpa +
                ", Skill Required: " + requiredSkill;
    }
}
