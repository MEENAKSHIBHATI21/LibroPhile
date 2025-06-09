# 📚 LibroPhile – Virtual Book Recommendation Library

**LibroPhile** is a full-stack Java web application that lets users explore, recommend, and add books based on genres and ratings. The goal is to make a fun and clean virtual library — inspired by modern platforms like Spotify.

---

## 💡 Features

- 🔍 Search books by genre
- 🧠 Intelligent book recommendations
- ➕ Add new books via form
- 📄 Dynamic book display using REST API
- 🎨 Clean, Spotify-style UI (light mode)
- ✅ Integrated with MySQL database
- ⚡ Spring Boot backend, HTML/CSS/JS frontend

---

## 🛠 Tech Stack

| Layer     | Tech Used                          |
|-----------|------------------------------------|
| Backend   | Java + Spring Boot + Maven         |
| Frontend  | HTML, CSS, Bootstrap, JS (Fetch)   |
| Database  | MySQL (via JDBC)                   |
| Tools     | VS Code, GitHub, XAMPP             |

---

## 🧱 Folder Structure
librophile/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.librophile.librophile/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ └── LibroPhileApplication.java
│ │ └── resources/
│ │ └── application.properties
├── static/
│ └── index.html
├── pom.xml

---

Visit: http://localhost:8080/index.html

College: Galgotias College of Engineering & Technology

Course: B.Tech CSE – AI/ML

Year: First Year

Project: Review 2 Final Submission

---

📸 UI Preview
Light mode Spotify-style layout

Scrollable shelves

Genre filters

Form with alerts and validation

---
## 🚀 How to Run

1. Start **MySQL** using XAMPP
2. Make sure you have a database named `librophile` created
3. Update DB username/password in `application.properties`
4. Run the app:

```bash
.\mvnw spring-boot:run
