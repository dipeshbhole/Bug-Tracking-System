# Bug Tracking System

A simple bug tracking system built with **Java 17**, **Spring Boot (using Spring Tool Suite)**, **PostgreSQL**, and tested with **Postman**.

---

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup and Installation](#setup-and-installation)
- [Running the Project](#running-the-project)
- [Testing the APIs](#testing-the-apis)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- CRUD operations for bugs via REST API
- PostgreSQL integration for persistent storage
- Simple API testing with Postman

---

## Technologies Used

- Java 17  
- Spring Boot (developed in Spring Tool Suite)  
- PostgreSQL  
- Maven  
- Postman  

---

## Prerequisites

Ensure the following are installed:

- [Java 17 JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  
- [Spring Tool Suite (STS)](https://spring.io/tools)  
- [PostgreSQL](https://www.postgresql.org/download/)  
- [Maven](https://maven.apache.org/download.cgi) (usually bundled with STS)  
- [Git](https://git-scm.com/downloads)  
- [Postman](https://www.postman.com/downloads/)  

---

## Setup and Installation

### 1. Clone the repository

```bash
git clone https://github.com/your-username/bug-tracking-system.git
cd bug-tracking-system
2. Configure PostgreSQL Database
Start PostgreSQL server.

Create a database (e.g., bugtracker_db):

sql
Copy
Edit
CREATE DATABASE bugtracker_db;
(Optional) Create a dedicated user and grant privileges:

sql
Copy
Edit
CREATE USER buguser WITH ENCRYPTED PASSWORD 'your_password';
GRANT ALL PRIVILEGES ON DATABASE bugtracker_db TO buguser;
3. Update Spring Boot application.properties
Open src/main/resources/application.properties and update your PostgreSQL credentials:

properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/bugtracker_db
spring.datasource.username=buguser
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Running the Project
1. Open Spring Tool Suite (STS)
Import your project (if not opened yet) via File > Import > Existing Maven Projects.

Wait for Maven dependencies to load.

2. Run the Application
Right-click on the main class (e.g., BugTrackingSystemApplication.java).

Click Run As > Spring Boot App.

The app will start, listening on port 8080 by default.
