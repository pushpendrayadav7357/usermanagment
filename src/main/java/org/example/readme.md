# User Management System

## Overview

The User Management System is a Spring Boot application that allows users to perform CRUD (Create, Read, Update, Delete) operations on user records. This project is implemented in Java and uses Spring Boot for building the application, Spring Data JPA for data access, and MySQL as the database.

## Table of Contents

- [Frameworks and Languages Used](#frameworks-and-languages-used)
- [Data Flow](#data-flow)
    - [Controller](#controller)
    - [Services](#services)
    - [Repository](#repository)
- [Database Design](#database-design)
- [Data Structure Used](#data-structure-used)
- [Project Summary](#project-summary)

## Frameworks and Languages Used

- Spring Boot (Framework)
- Java (Language)
- MySQL (Database)

## Data Flow

### Controller

The controller layer handles HTTP requests and responses. It contains endpoints for user-related operations.

- `UserController`: Exposes RESTful endpoints for CRUD operations on users.

### Services

The service layer contains business logic and interacts with the repository to perform CRUD operations.

- `UserService`: Implements business logic for user-related operations.

### Repository

The repository layer is responsible for database interactions.

- `UserRepository`: Uses Spring Data JPA to interact with the MySQL database.

## Database Design

The database design includes a single table named `User` with the following columns:

- UserId (Primary Key)
- Name
- UserName
- Address
- Phone Number

## Data Structure Used

- Entity class (`User`) represents the structure of the `User` table in the database.
- `List<User>` is used in the controller to represent a list of users in the response.

## Project Summary

The User Management System is a Spring Boot application that allows users to perform CRUD operations on user records. It uses Spring Data JPA for data access and MySQL as the database. The application provides the following endpoints:

- `POST /api/users/addUser`: Adds a new user to the system.
- `GET /api/users/getUser/{userId}`: Retrieves a user by their `userId`.
- `GET /api/users/getAllUsers`: Retrieves all users from the database.
- `PUT /api/users/updateUserInfo/{userId}`: Updates a user's information.
- `DELETE /api/users/deleteUser/{userId}`: Deletes a user by their `userId`.

The application follows a layered architecture with separate components for controller, service, and repository. Users are represented as entities in the database, and the application ensures data integrity by defining the structure of the `User` table. Users can interact with the system through API endpoints to manage user records efficiently.

