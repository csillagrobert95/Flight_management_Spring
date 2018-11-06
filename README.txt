FlightsApp - Csillag Robert

A three-tiered distributed system to view and post flights for an airport.
The system consists of the following tiers: Presentation, Business Layer and Data Access.

Client role:
- A client can view on his/her page all the flights in a list or table.
- A client can query for the local time of the flight arrival and departure cities computed based on cities geographical coordinates.

Administrator role:
- The administrator can perform CRUD operations on flights (Create, Read, Update and Delete)

Used technology stack:
- Java
- Spring Boot
- Spring Security
- RESTful Web Services
- Hibernate
- MySQL
- Thymeleaf
- HTML
- Bootstrap

Steps to install and run the application:
1. Create a new MySQL Database
2. Run the SQL schema: SQL\SQL_Schema
3. Run the Insert instructions: SQL\Inserts
4. Import the project in Eclipse/Intellij
5. Change teh configuration to accomodate DB name, ip, port, user and password
6. Run the application
7. Open the web browser (http://localhost:8080)