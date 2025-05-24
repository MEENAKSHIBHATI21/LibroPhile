# LibroPhile - Virtual Library Management and Recommendation System

## Project Overview
LibroPhile is a Java-based desktop application that allows users to manage a virtual library. Users can add, update, search, and delete books stored in a MySQL database. Additionally, the system offers personalized book recommendations based on user preferences. The project demonstrates integration of JDBC for database connectivity and a user-friendly GUI built with Java Swing.

## Features
- Add, update, delete, and search books in the library database
- Personalized book recommendation system
- User-friendly graphical interface with clear layout
- Robust database connectivity using JDBC and MySQL
- Modular code design following MVC principles

## Technology Stack
- Java (JDK 1.8+)
- MySQL for database
- IDE: VS Code (or any Java IDE of your choice)

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 1.8 or higher installed
- MySQL Server installed and running
- MySQL Connector/J (JDBC driver) included in the project libraries
- IDE of your choice (VS Code, IntelliJ IDEA, Eclipse, or NetBeans)

### Database Creation

```sql
CREATE DATABASE librophile;
USE librophile;

CREATE TABLE books (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255),
  author VARCHAR(255),
  genre VARCHAR(100),
  rating FLOAT
);```




PROJECT STRUCTURE
/src
  /model       # Contains data model classes like Book.java
  /dao         # Contains database operation classes (DAO)
  /ui          # Contains GUI classes built with Swing
/sql           # Contains SQL scripts for database setup
README.md      # Project documentation
