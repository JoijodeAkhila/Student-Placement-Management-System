
---

🎓 Student Placement Management System

📌 Project Overview

The Student Placement Management System is a Java console-based application that helps manage student placements. It allows registration of students and companies, manages job applications, and tracks placement status.

---

🚀 Features

- Register students (ID, Name, CGPA)
- Register companies (Name, Minimum CGPA)
- View eligible companies for a student
- Apply for companies
- View all applications
- Select students for a company
- Mark students as placed
- View all students and companies

---

🛠️ Technologies Used

- Java (Core Java)
- Eclipse IDE
- Object-Oriented Programming (OOP)
- ArrayList (Collections Framework)

---

📂 Project Structure

'''Student Placement Management System
 └── src
     ├── model
     │    ├── Application.java
     │    ├── Company.java
     │    └── Student.java
     ├── service
     │    ├── StudentService.java
     │    ├── CompanyService.java
     │    └── PlacementService.java
     └── app
          └── Main.java '''

---

⚙️ How to Run

1. Open Eclipse
2. Import/Create project: Student Placement Management System
3. Ensure packages:
   - "model"
   - "service"
   - "app"
4. Run "Main.java"

---

🧪 Sample Menu

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

---

❗ Validations Implemented

- Prevents duplicate applications
- Checks CGPA eligibility
- Prevents applying after placement
- Company-specific selection logic

---

📈 Future Improvements

- MySQL database integration (JDBC)
- GUI (JavaFX / Swing)
- Login system (Admin/Student)

---

📄 Note

This project is created for learning and academic purposes.
