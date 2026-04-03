# 🎓 Student Placement Management System

## 📌 Project Overview

The **Student Placement Management System** is a Java console-based application that automates the campus recruitment process. It manages student and company data, and performs candidate shortlisting based on **CGPA and skill requirements**.

---

## 🚀 Features

* Register students with ID, name, CGPA, and skill
* Register companies with minimum CGPA and required skill
* Apply for companies based on eligibility
* Automatic filtering using:

  * CGPA criteria
  * Skill matching
* Prevent duplicate applications
* Ensure unique student ID registration
* View all applications
* Mark students as selected and placed

---

## 🛠️ Technologies Used

* Java (Core Java)
* Eclipse IDE
* Object-Oriented Programming (OOP)
* Java Collections (ArrayList)

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
3.Apply
4.View Applications
5.Exit
```

---

## 🔍 Example Workflow

1. Register a student with CGPA and skill
2. Register a company with required CGPA and skill
3. Student applies → system checks:

   * CGPA eligibility
   * Skill match
4. Application is accepted or rejected accordingly

---

## ❗ Validations Implemented

* Prevents duplicate applications for same company
* Ensures unique student IDs
* Checks CGPA eligibility before applying
* Verifies skill matching between student and company
* Prevents applying after placement

---

## 📈 Future Enhancements

* Database integration using MySQL (JDBC)
* GUI using JavaFX or Swing
* Login system (Admin / Student)
* Multiple skills support (List of skills)
* Advanced filtering and ranking system

---

## 👨‍💻 Resume Description

Student Placement Management System | Java
• Developed a recruitment automation system using Java Collections to manage student and company data.
• Implemented filtering logic to automate candidate shortlisting based on CGPA and skill requirements.
• Applied OOP principles to ensure modular design and enforced unique ID validation for data integrity.

---

## 📄 Note

This project is developed for academic and learning purposes and demonstrates core Java and problem-solving concepts.
