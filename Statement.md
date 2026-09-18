Problem Statement

Managing student information manually can become difficult when the number of student records increases. Basic details such as student ID, name, age, email address, and marks need to be stored, updated, searched, and maintained accurately. Manual record management can make it harder to locate information quickly and can increase the possibility of incorrect or inconsistent data.
The Student Management System is developed as a Java-based console application to provide a simple and organized solution for managing student records. The system allows users to perform common student management operations through a menu-driven interface. It provides functionality to add, view, update, delete, and search student records while also providing an academic report based on the stored marks.
The project applies Java programming and object-oriented programming concepts to create a modular system. Separate classes are used for student data, business operations, data storage, reporting, validation, and user input handling. The system also uses local file persistence so that student records can be retained and loaded when the application is executed again.

Scope

The scope of the Student Management System is focused on basic student record and academic information management. The application is intended to provide the core functionality required to maintain student information in a small-scale academic or institutional environment.
The system covers the creation of student records containing a unique student ID, name, age, email address, and marks. It allows existing records to be viewed, searched, modified, and deleted. The application also provides an academic summary containing the total number of students, average marks, and the number of students who have passed or failed according to the defined passing criteria.
The project uses local file-based storage rather than a remote database or cloud-based system. Its scope is therefore limited to a standalone console application and does not include features such as online authentication, multiple user roles, web access, cloud deployment, attendance management, fee management, or integration with external institutional systems.

Target Users

The primary target users of the Student Management System are individuals who need to maintain and manage basic student records in a simple application. This can include teachers, instructors, academic staff, or administrators working with a limited collection of student information.
The system can also be used by students or learners as an academic project to understand how a Java application can be structured using object-oriented programming, modular design, validation, file handling, service and repository layers, and automated testing.

High-Level Features

The Student Management System provides Create, Read, Update, and Delete functionality for student records. Users can create new records by entering student details and can modify or remove existing records when required.
The system provides a listing feature that displays stored student records and a search feature that allows users to locate records using the student ID or name. This provides a simple way to retrieve specific student information without manually checking every record.
An academic reporting module provides a summary of student performance. It calculates the total number of stored students, the average marks, and the number of students who have passed or failed based on the defined marks criteria.
The application includes input validation to ensure that entered information follows the expected rules. It validates student IDs, names, age, email addresses, and marks and also handles invalid operations such as duplicate student IDs or attempts to update students who do not exist.
The system supports local persistence using a file-based storage mechanism. Student records are saved locally and loaded when the application starts, allowing information to remain available between different executions of the program.

Project Objective

The main objective of the Student Management System is to develop a structured Java application that simplifies basic student record management while demonstrating important programming and software development concepts. The project aims to provide a clear workflow for managing student information, maintain data consistency through validation, separate responsibilities across different application components, and provide basic academic reporting.
The project also aims to demonstrate the practical use of Java 17, Maven, JUnit 5, object-oriented programming, collections, file handling, modular architecture, and automated testing in a single academic application.
