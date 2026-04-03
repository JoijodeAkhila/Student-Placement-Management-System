# 🎓 Student Placement Management System

## 📌 Project Overview

The **Student Placement Management System** is a Java console-based application that manages student placements. It allows registering students and companies, applying for jobs, and tracking placement status.

---

## 🚀 Features

* Register students (ID, Name, CGPA)
* Register companies (Name, Minimum CGPA)
* View eligible companies
* Apply for companies
* View applications
* Select students
* Mark students as placed
* View all students and companies

---

## 🛠️ Technologies Used

* Java
* Eclipse IDE
* OOP Concepts
* ArrayList

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

1. Open Eclipse
2. Create/Open project: **Student Placement Management System**
3. Ensure packages:

   * model
   * service
   * app
4. Run `Main.java`

---

## 🧪 Sample Menu

```
1.Register Student
2.Register Company
3.View Eligible Companies
4.Apply
5.View Applications
6.Select Student
7.Mark Placed
8.View Students
9.View Companies
0.Exit
```

---

## ❗ Validations

* Prevents duplicate applications
* Checks CGPA eligibility
* Prevents applying after placement
* Company-specific selection

---

## 📈 Future Improvements

* MySQL (JDBC) integration
* GUI (JavaFX/Swing)
* Login system

---

## 📄 Note

This project is for academic and learning purposes.
