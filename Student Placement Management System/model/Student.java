package model;

public class Student {
    private String id;
    private String name;
    private double cgpa;
    private boolean isPlaced;

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.isPlaced = false;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public boolean isPlaced() {
        return isPlaced;
    }

    // Setters
    public void setPlaced(boolean placed) {
        isPlaced = placed;
    }

    @Override
    public String toString() {
        return "ID: " + id +
            ", Name: " + name +
            ", CGPA: " + cgpa +
            ", Placed: " + (isPlaced ? "Yes" : "No");
    }
}
