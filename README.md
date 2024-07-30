This project is a simple CRUD (Create, Read, Update, Delete) REST API using Spring Boot. The project demonstrates the basic operations on a `Student` entity and is tested using Postman.

## Table of Contents
- [Prerequisites](#sts4,jdk17+)
- [Setup and Running the Project](#setup-and-running-the-project)
- [Endpoints](#endpoints)
- [Testing](#postman)

## Prerequisites

Before you begin, ensure you have the following tools installed:
- [JDK 17 or later](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Spring Tool Suite 4 (STS4)](https://spring.io/tools)
- [Postman](https://www.postman.com/downloads/)


Open the project in STS4

Build the project using Maven

sh
Copy code
mvn clean install
Run the application
You can run the application directly from STS4 or using the following Maven command:

sh
Copy code
mvn spring-boot:run
The application will start on localhost:9494.

Endpoints
The following endpoints are available in the API:

Get All Students

http
Copy code
GET /students
Returns a list of all students.

Get Student by ID

http
Copy code
GET /students/{id}
Returns a specific student by ID.

Create a Student

http
Copy code
POST /student/add
Creates a new student.

Request Body:
json
Copy code
{
  "name": "Student Name",
  "branch": "Branch Name"
}
Update a Student

http
Copy code
PUT /student/update/{id}
Updates an existing student.

Request Body:
json
Copy code
{
  "name": "Updated Name",
  "branch": "Updated Branch"
}
Delete a Student

http
Copy code
DELETE /student/delete/{id}
Deletes a student by ID.

Testing
You can test the API endpoints using Postman. Follow these steps:

Open Postman.
Create a new request.
Choose the appropriate HTTP method (GET, POST, PUT, DELETE).
Enter the request URL (e.g., http://localhost:9494/students).
If required, add request headers and body.
Send the request and check the response.
