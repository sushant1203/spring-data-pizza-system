# Spring Data JPA (Pizza Management System)

## 📖 Overview

This project is a comprehensive Java web application that demonstrates the power of **Spring Data JPA** for managing a complex relational database. The system models pizzerias, pizzas, and their ingredients, showcasing advanced data persistence techniques and object-relational mapping (ORM).

Developed as a university assignment, this project was awarded an **outstanding score of 98/100**, highlighting its robust backend architecture, correct implementation of data relationships, and adherence to modern software development practices.

---

## ✨ Key Features

* **Complex Relational Mapping:** Implements JPA annotations to map Java objects to a MySQL database schema, covering relationships like Many-to-Many (`Pizzeria`-`Pizza`) and One-to-Many (`Pizza`-`Ingredient`).
* **Custom Spring Data Queries:** Features custom query methods within `CrudRepository` interfaces (e.g., `findByDescription`) to perform targeted database lookups.
* **Data Persistence Control:** Manages cascading operations (`CascadeType.PERSIST`, `CascadeType.REMOVE`) and fetch strategies (`FetchType.EAGER`) for efficient data handling.
* **Database Seeding:** Utilizes `CommandLineRunner` to automatically populate the database with initial data on application startup.
* **Web Interface for Data Management:** A simple web layer built with Spring MVC and JSP allows for viewing and deleting records from the database via URL requests.
* **SQL Logging:** Configured to print all executed SQL statements to the console for easy debugging and analysis.

---


## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot, Spring Data JPA
* **Database:** MySQL
* **View Technology:** JSP (JavaServer Pages), JSTL
* **Build System:** Gradle

***
## 🚀 Getting Started

This project is designed to be run from IntelliJ IDEA and requires a local MySQL database.

### Prerequisites

* **Java Development Kit (JDK)**: Version 17 or higher.
* **IntelliJ IDEA**: Community or Ultimate Edition.
* **MySQL Server**: A running local instance.

---

### Installation & Setup

1.  **Clone the repository:**
```bash
git clone https://github.com/sushant1203/spring-data-pizza-system.git
cd spring-data-piza-system
```

2.  **Create the MySQL Database:**
    * Connect to your local MySQL server.
    * Create the database named `co2123db`:
        ```sql
        CREATE DATABASE co2123db;
        ```

3.  **Configure Database Connection:**
    * Open the `src/main/resources/application.properties` file.
    * Ensure the properties match the following configuration for the `co2123db` database with no password. The default username for local MySQL is often `root`.
        ```properties
        # Database Configuration
        spring.jpa.hibernate.ddl-auto=update
        spring.datasource.url=jdbc:mysql://localhost:3306/co2123db
        spring.datasource.username=root
        spring.datasource.password=
        
        # Shows executed SQL in the console
        spring.jpa.show-sql=true
        ```

4.  **Open and Run in IntelliJ IDEA:**
    * Launch IntelliJ and select `File > Open...`, then choose the cloned project folder.
    * Allow IntelliJ a few moments to sync the Gradle dependencies.
    * Navigate to the main application file: `src/main/java/co2123/hw2/HW2Application.java`.
    * Click the green play icon ▶️ next to the `main` method and select **'Run HW2Application'**.

***
## Usage

The application automatically seeds the database with initial data when it starts. You can interact with the system by visiting the following URLs in your web browser.

* **List all pizzerias:** `http://localhost:8080/listPizzeria`
* **List all pizzas:** `http://localhost:8080/listPizza`
* **List all ingredients:** `http://localhost:8080/listIngredient`

You can also delete records directly via URL. For example:

* **Delete a Pizzeria:** `http://localhost:8080/deletePizzeria?id=1`
* **Delete a Pizza:** `http://localhost:8080/deletePizza?name=Margherita`
* **Delete an Ingredient:** `http://localhost:8080/deleteIngredient?identifier=5`

---

## 📄 License

* © [2025] [IBM] [Sushant Jasra Kumar] All Rights Reserved.

---
