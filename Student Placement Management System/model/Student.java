package model;

public class Student {
    private String id;
    private String name;
    private double cgpa;
    private String skill;
    private boolean isPlaced;

    public Student(String id, String name, double cgpa, String skill) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.skill = skill;
        this.isPlaced = false;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getSkill() {
        return skill;
    }

    public boolean isPlaced() {
        return isPlaced;
    }

    public void setPlaced(boolean placed) {
        isPlaced = placed;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", CGPA: " + cgpa +
                ", Skill: " + skill +
                ", Placed: " + (isPlaced ? "Yes" : "No");
    }
}
