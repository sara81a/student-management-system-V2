#  **Student Management System**

This is a web application built using **Java**, **Spring Boot**, **Thymeleaf**, and **MySQL**. The application provides functionality to manage student records .

---

##  **Features**
  - **View All Students**: See a list of all students.
  - **Add a New Student**: Add students by providing(first name , last name , email)
  - **Edit Student Information**: Update student details.
  - **Delete a Student**: Remove student records.

---

##  **Steps to Run the Application**

### **Prerequisites**
Before you begin, ensure you have the following installed:
-  **Docker**: To build and run the application using containers.
-  **Git**: To clone the repository.

---

### **Setup and run**

1. Clone the repository:
    `git clone https://github.com/sara81a/student-management-system-V2.git`
2. Build the Docker images:
   `docker-compose build`
3. Run the application:
   `docker-compose up`
4. Access the application in your browser at:
   `http://localhost:8080/students`

---

### **Note*
- The .env file contains sensitive credentials and should be included in .gitignore However, it has been intentionally pushed here for easily in running the application.