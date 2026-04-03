# 🎓 Student Placement Management System

## 📌 Project Overview

The **Student Placement Management System** is a Java console-based application designed to automate the campus recruitment process. It manages student and company data and performs intelligent candidate shortlisting based on **CGPA and multiple skill matching**.

---

## 🚀 Features

* Register students with ID, name, CGPA, and multiple skills
* Register companies with minimum CGPA and required skill set
* Display eligible students for each company
* Apply for companies based on eligibility criteria
* Prevent duplicate applications
* Enforce **maximum 3 job offers per student**
* Automatically update placement status based on offer count
* View all applications and student details

---

## 🛠️ Technologies Used

* Java (Core Java)
* Eclipse IDE
* Object-Oriented Programming (OOP)
* Java Collections (ArrayList, List)

---

## 📂 Project Structure

```
Student Placement Management System
└── src
    ├── model
    │   ├── Application.java
    │   ├── Company.java
    │   └── Student.java
    ├── service
    │   ├── StudentService.java
    │   ├── CompanyService.java
    │   └── PlacementService.java
    └── app
        └── Main.java
```

---

## ⚙️ How to Run

1. Open Eclipse IDE
2. Create/Open project: **Student Placement Management System**
3. Create packages:

   * `model`
   * `service`
   * `app`
4. Add all Java files into respective packages
5. Run `Main.java`

---

## 🧪 Sample Menu

```
1.Register Student
2.Register Company
3.Show Eligible Students
4.Apply
5.Select Student
6.View Applications
7.View Students
8.Exit
```

---

## 🔍 System Workflow

1. Register student with CGPA and multiple skills
2. Register company with required CGPA and skills
3. System filters eligible students based on:

   * CGPA requirement
   * Skill matching (all required skills must match)
4. Student applies for company
5. On selection:

   * Offer count increases
   * Placement status updates
6. Student can receive up to **3 offers only**

---

## ❗ Validations Implemented

* Unique student ID enforcement
* Duplicate application prevention
* CGPA eligibility validation
* Skill matching verification
* Maximum 3 offers per student restriction
* Prevent further applications after reaching offer limit

---

## 📈 Future Enhancements

* Database integration using MySQL (JDBC)
* GUI using JavaFX or Swing
* Login system (Admin / Student)
* Advanced filtering and ranking system
* Company categorization (Dream / Non-Dream)

---

## 👨‍💻 Resume Description

Student Placement Management System | Java
• Developed a recruitment automation system using Java Collections to manage student and company data.
• Implemented candidate shortlisting based on CGPA and multiple skill matching using efficient filtering logic.
• Enforced placement constraints by limiting students to a maximum of 3 job offers and ensuring data integrity through OOP-based design.

---

## 📄 Note

This project is developed for academic purposes and demonstrates strong fundamentals in Java, OOP, and problem-solving with real-world placement logic.
