package app;

import model.*;
import service.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService ss = new StudentService();
        CompanyService cs = new CompanyService();
        PlacementService ps = new PlacementService();

        while (true) {
            System.out.println("\n1.Register Student");
            System.out.println("2.Register Company");
            System.out.println("3.Show Eligible Students");
            System.out.println("4.Apply");
            System.out.println("5.Select Student");
            System.out.println("6.View Applications");
            System.out.println("7.View Students");
            System.out.println("8.Exit");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("CGPA: ");
                    double cgpa = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Skills (comma separated): ");
                    String[] sArr = sc.nextLine().split(",");
                    List<String> skills = new ArrayList<>();
                    for (String s : sArr) skills.add(s.trim());

                    ss.registerStudent(id, name, cgpa, skills);
                    break;

                case 2:
                    System.out.print("Company: ");
                    String cname = sc.nextLine();

                    System.out.print("Min CGPA: ");
                    double min = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Required Skills (comma separated): ");
                    String[] cArr = sc.nextLine().split(",");
                    List<String> reqSkills = new ArrayList<>();
                    for (String s : cArr) reqSkills.add(s.trim());

                    cs.registerCompany(cname, min, reqSkills);
                    break;

                case 3:
                    System.out.print("Company Name: ");
                    String comp = sc.nextLine();

                    Company c = cs.getCompanyByName(comp);
                    if (c != null) {
                        cs.showEligibleStudents(c, ss.getAllStudents());
                    } else {
                        System.out.println("Company not found.");
                    }
                    break;

                case 4:
                    System.out.print("Student ID: ");
                    String sid = sc.nextLine();

                    Student st = ss.getStudentById(sid);
                    if (st == null) {
                        System.out.println("Student not found.");
                        break;
                    }

                    System.out.print("Company: ");
                    String cn = sc.nextLine();

                    Company co = cs.getCompanyByName(cn);
                    if (co == null) {
                        System.out.println("Company not found.");
                        break;
                    }

                    ps.apply(st, co);
                    break;

                case 5:
                    System.out.print("Student ID: ");
                    String sid2 = sc.nextLine();

                    Student st2 = ss.getStudentById(sid2);
                    if (st2 == null) {
                        System.out.println("Student not found.");
                        break;
                    }

                    System.out.print("Company: ");
                    String comp2 = sc.nextLine();

                    ps.selectStudent(st2, comp2);
                    break;

                case 6:
                    ps.viewApplications();
                    break;

                case 7:
                    ss.viewAllStudents();
                    break;

                case 8:
                    sc.close();
                    return;
            }
        }
    }
}
