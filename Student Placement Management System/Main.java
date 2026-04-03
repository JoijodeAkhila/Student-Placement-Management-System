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
            System.out.println("3.View Eligible Companies");
            System.out.println("4.Apply");
            System.out.println("5.View Applications");
            System.out.println("6.Select Student");
            System.out.println("7.Mark Placed");
            System.out.println("8.View Students");
            System.out.println("9.View Companies");
            System.out.println("0.Exit");

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

                    studentService.registerStudent(id, name, cgpa);
                    break;

                case 2:
                    System.out.print("Company: ");
                    String cname = sc.nextLine();

                    System.out.print("Min CGPA: ");
                    double min = sc.nextDouble();
                    sc.nextLine();

                    companyService.registerCompany(cname, min);
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    String sid = sc.nextLine();

                    Student s = studentService.getStudentById(sid);
                    if (s == null) {
                        System.out.println("Student not found");
                        break;
                    }

                    for (Company c : companyService.getAllCompanies()) {
                        if (s.getCgpa() >= c.getMinCgpa() && !s.isPlaced()) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Student ID: ");
                    String stid = sc.nextLine();

                    Student st = studentService.getStudentById(stid);
                    if (st == null) {
                        System.out.println("Student not found");
                        break;
                    }

                    System.out.print("Company: ");
                    String comp = sc.nextLine();

                    Company co = companyService.getCompanyByName(comp);
                    if (co == null) {
                        System.out.println("Company not found");
                        break;
                    }

                    placementService.apply(st, co);
                    break;

                case 5:
                    placementService.viewApplications();
                    break;

                case 6:
                    System.out.print("Student ID: ");
                    String selId = sc.nextLine();

                    System.out.print("Company: ");
                    String selComp = sc.nextLine();

                    placementService.selectStudent(selId, selComp);
                    break;

                case 7:
                    System.out.print("Student ID: ");
                    String pid = sc.nextLine();

                    Student ps = studentService.getStudentById(pid);
                    if (ps != null) {
                        placementService.placeStudent(ps);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;

                case 8:
                    studentService.viewAllStudents();
                    break;

                case 9:
                    companyService.viewAllCompanies();
                    break;

                case 0:
                    sc.close();
                    return;
            }
        }
    }
}
