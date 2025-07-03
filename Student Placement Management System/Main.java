import model.*;
import service.*;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        CompanyService companyService = new CompanyService();
        PlacementService placementService = new PlacementService();

        while (true) {
            System.out.println("\n🎓 STUDENT PLACEMENT MANAGEMENT SYSTEM 🎓");
            System.out.println("1. Register Student");
            System.out.println("2. Register Company");
            System.out.println("3. View Eligible Companies for a Student");
            System.out.println("4. Apply for Company");
            System.out.println("5. View Applications");
            System.out.println("6. Select Student");
            System.out.println("7. Mark Student as Placed");
            System.out.println("8. View All Students");
            System.out.println("9. View All Companies");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();
                    studentService.registerStudent(id, name, cgpa);
                    break;

                case 2:
                    System.out.print("Enter Company Name: ");
                    String companyName = sc.nextLine();
                    System.out.print("Enter Minimum CGPA Required: ");
                    double minCgpa = sc.nextDouble();
                    companyService.registerCompany(companyName, minCgpa);
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();
                    Student s = studentService.getStudentById(sid);
                    if (s == null) {
                        System.out.println("❌ Student not found.");
                    } else {
                        System.out.println("✅ Eligible Companies:");
                        for (Company c : companyService.getAllCompanies()) {
                            if (s.getCgpa() >= c.getMinCgpa() && !s.isPlaced()) {
                                System.out.println(c);
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    String applySid = sc.nextLine();
                    Student stu = studentService.getStudentById(applySid);
                    if (stu == null) {
                        System.out.println("❌ Student not found.");
                        break;
                    }
                    System.out.print("Enter Company Name: ");
                    String comp = sc.nextLine();
                    Company com = companyService.getCompanyByName(comp);
                    if (com == null) {
                        System.out.println("❌ Company not found.");
                        break;
                    }
                    placementService.apply(stu, com);
                    break;

                case 5:
                    placementService.viewApplications();
                    break;

                case 6:
                    System.out.print("Enter Student ID to mark as Selected: ");
                    String selectId = sc.nextLine();
                    placementService.selectStudent(selectId);
                    break;

                case 7:
                    System.out.print("Enter Student ID to mark as Placed: ");
                    String pid = sc.nextLine();
                    Student placedStudent = studentService.getStudentById(pid);
                    if (placedStudent != null) {
                        placementService.placeStudent(placedStudent);
                    } else {
                        System.out.println("❌ Student not found.");
                    }
                    break;

                case 8:
                    studentService.viewAllStudents();
                    break;

                case 9:
                    companyService.viewAllCompanies();
                    break;

                case 0:
                    System.out.println("🌼 Thank you for using the system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice. Try again.");
            }
            
        
        }
        
    }
    
}
