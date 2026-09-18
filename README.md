Student Management System

Project Overview

The Student Management System is a console application developed to provide a simple and organized way of managing student records. The project allows users to maintain essential student information such as student ID, name, age, email address, and marks through a menu-driven interface.
The system is designed to replace basic manual record management with a structured digital solution. Users can add new student records, update existing information, delete records, view all available students, and search for students using their ID or name. The application also provides an academic summary that calculates the total number of students, average marks, passed students, and failed students.
The project uses a modular Java structure in which different classes are responsible for different parts of the application. Student information is represented using a model class, business operations are handled by service classes, and student records are stored and retrieved through a repository class. Validation and input-handling utilities are used to improve reliability and prevent invalid information from being entered into the system.
The application also provides local data persistence. Student records are stored in a local file so that information can be loaded again when the application is started. This makes the project more practical while keeping the implementation simple and suitable for an academic Java project.

Features

The Student Management System provides complete basic student record management through Create, Read, Update, and Delete operations. A user can create a new student record by entering the student's ID, name, age, email, and marks. Existing records can be updated when student information changes, while unwanted records can be deleted from the system.
The application provides a student listing feature that displays all stored student records in a readable format. It also includes a search facility that allows users to find students using their student ID or part of their name, making it easier to retrieve a particular record.
An academic reporting feature is included to provide a basic summary of student performance. The system calculates the average marks of the available students and identifies the number of students who have passed or failed according to the defined marks threshold.
Input validation is another important feature of the system. The application checks that student IDs are valid, names are not empty, ages fall within the accepted range, email addresses follow a valid basic format, and marks remain within the range of 0 to 100. Invalid operations such as adding a duplicate student ID or updating a student who does not exist are also handled.
The system supports local persistence of student records. Data is saved to a local file and loaded when the application starts, allowing previously stored student information to remain available between program executions.

Technologies

The project is developed using Java 17 as the primary programming language. Java is used to implement the application logic, object-oriented structure, data management, validation, file handling, and console interaction.
Maven is used as the build and project management tool. The Maven configuration defines the Java version and the testing dependency and provides standard commands for building and testing the project.
JUnit 5 is used for unit testing. It provides automated tests for important validation behavior and helps verify that valid student data is accepted while invalid data is rejected.
Java collections are used for managing student records in memory. A map-based structure allows student records to be organized using their unique student IDs.
Java object serialization is used for local data persistence. Student records are stored in a local file and loaded when the application starts.
Git and GitHub are used for version control and project submission. The repository contains the source code, project configuration, documentation, and tests.

Installation & Running

To run the Student Management System, Java Development Kit (JDK) 17 or later should be installed on the computer. Maven should also be installed because the project uses Maven for building and testing.
After downloading or cloning the project, open a terminal in the project directory. The project can be cloned from GitHub using the repository URL once the repository has been created.
The application will display a menu in the console. The user can select an operation such as adding, updating, deleting, viewing, or searching for students, or generating an academic report.
Student data is automatically stored locally when records are added, updated, or deleted. The application loads the stored records when it is started again.

Testing Instructions

The project uses JUnit 5 for automated testing. The tests are located under the project's test source directory and currently verify important student-data validation behavior.
Maven will compile the project, execute the JUnit tests, and display the test results in the terminal. The tests verify that valid student information is accepted and that invalid information, such as marks outside the permitted range, is rejected.
The application can also be manually tested through its console interface by performing each available operation. Test cases can include adding valid students, attempting to add duplicate IDs, updating existing students, attempting to update non-existent students, searching by ID or name, deleting records, entering invalid values, and generating the academic report.
