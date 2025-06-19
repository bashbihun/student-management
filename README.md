# Student Management API

Simple CRUD API to manage students using Spring Boot and MySQL.

## Features
- Create, Read, Update, Delete student data
- RESTful architecture
- JPA + MySQL

## Tech Stack
- Java 17
- Spring Boot 3
- MySQL
- Spring Data JPA

## How to Run
1. Create a database `belajar_jdbc_studen` in MySQL
2. Configure `application.properties`
3. Run the application
4. Test using Postman at `localhost:8080/belajar_jdbc_student`

## Example JSON
```json
{
  "name": "Jokowi",
  "email": "jokowi@example.com",
  "major": "Terimakasih Pak Jokowi"
}
