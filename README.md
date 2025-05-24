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
- IDE: VS Code

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 1.8 or higher installed
- MySQL Server installed and running
- MySQL Connector/J (JDBC driver) included in the project libraries
- IDE of your choice (IntelliJ IDEA, Eclipse, or NetBeans)



###DATABASE CREATION
- CREATE DATABASE librophile;
- USE librophile;

-CREATE TABLE books (
-id INT auto_increment PRIMARY KEY ,
-title VARCHAR(255),
-author varchar(255),
-genre varchar(100),
-rating float 
-);


###PROJECT STRUCTURE
-/src
  /model         # Data classes like Book.java
  /dao           # Database operations and queries
  /ui            # GUI classes using Swing
/sql             # SQL scripts for database setup
README.md        # Project documentation
