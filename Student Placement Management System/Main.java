package app;

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
            System.out.println("\n1.Register Student");
            System.out.println("2.Register Company");
            System.out.println("3.Apply");
            System.out.println("4.View Applications");
            System.out.println("5.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("CGPA: ");
                    double cgpa = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Skill: ");
                    String skill = sc.nextLine();

                    studentService.registerStudent(id, name, cgpa, skill);
                    break;

                case 2:
                    System.out.print("Company: ");
                    String cname = sc.nextLine();

                    System.out.print("Min CGPA: ");
                    double min = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Required Skill: ");
                    String reqSkill = sc.nextLine();

                    companyService.registerCompany(cname, min, reqSkill);
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    String sid = sc.nextLine();

                    Student s = studentService.getStudentById(sid);
                    if (s == null) {
                        System.out.println("Student not found");
                        break;
                    }

                    System.out.print("Company: ");
                    String comp = sc.nextLine();

                    Company c = companyService.getCompanyByName(comp);
                    if (c == null) {
                        System.out.println("Company not found");
                        break;
                    }

                    placementService.apply(s, c);
                    break;

                case 4:
                    placementService.viewApplications();
                    break;

                case 5:
                    sc.close();
                    return;
            }
        }
    }
}
