package model;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private double cgpa;
    private List<String> skills;
    private boolean isPlaced;
    private int offerCount;

    public Student(String id, String name, double cgpa, List<String> skills) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.skills = skills;
        this.isPlaced = false;
        this.offerCount = 0;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getCgpa() { return cgpa; }
    public List<String> getSkills() { return skills; }
    public boolean isPlaced() { return isPlaced; }
    public int getOfferCount() { return offerCount; }

    public void setPlaced(boolean placed) {
        isPlaced = placed;
    }

    public void incrementOffer() {
        offerCount++;
    }

    public boolean hasAllSkills(List<String> requiredSkills) {
        for (String req : requiredSkills) {
            boolean found = false;
            for (String s : skills) {
                if (s.equalsIgnoreCase(req.trim())) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", CGPA: " + cgpa +
               ", Skills: " + skills +
               ", Offers: " + offerCount +
               ", Placed: " + (isPlaced ? "Yes" : "No");
    }
}
