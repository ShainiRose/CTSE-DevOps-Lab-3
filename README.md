# DevOps Lab 3 – Spring Boot Microservice

 

**Project:** Spring Boot Microservice with H2 Database & Swagger UI

---

## 🗂️ Project Structure

DevOps-Lab-3/
├── .mvn/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/sliit/productservice/
│ │ ├── controller/
│ │ │ └── ProductController.java
│ │ ├── model/
│ │ │ └── Product.java
│ │ └── repository/
│ │ └── ProductRepository.java
│ └── test/
├── screenshots/
│ ├── API-s.png
│ └── db.png
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md


---

## 🔹 Screenshots

### API Documentation – Swagger UI
![Swagger UI](screenshots/API-s.png)

### H2 Database Console
![H2 Database](screenshots/db.png)

---

## 🛠️ Technologies Used
- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 Database  
- Springdoc OpenAPI (Swagger UI)  
- Maven  

---

## 📤 How to Run the Project

1. Clone the repository:
```bash
git clone https://github.com/ShainiRose/DevOps-Lab-3.git
Open the project in VS Code or any Java IDE.

Run the Spring Boot application (main class with @SpringBootApplication).

Add a product using Swagger UI:

Open in browser:

http://localhost:8080/swagger-ui.html
Use POST endpoint to add a product:

{
  "name": "Book",
  "price": 1500
}
Execute → Product is saved in H2 database

View the product in H2 Database Console:

http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (leave empty)

Run:

SELECT * FROM PRODUCT;