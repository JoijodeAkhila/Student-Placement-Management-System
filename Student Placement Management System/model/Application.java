package model;

public class Application {
    private String studentId;
    private String companyName;
    private String status; // "Applied", "Selected", "Rejected"

    public Application(String studentId, String companyName) {
        this.studentId = studentId;
        this.companyName = companyName;
        this.status = "Applied";
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
            ", Company: " + companyName +
            ", Status: " + status;
    }
}
