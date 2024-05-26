# Rates Trading Platform

## Overview
The Rates Trading Platform simulates basic trading operations for fixed-income instruments like bonds and interest rate swaps. It supports functionalities such as adding new instruments, performing trades, viewing trade histories, and more. The application includes features like concurrency handling, database interactions, messaging, RESTful services, and more.

## Technologies Used
- Java 11+
- Spring Boot
- Spring Data JPA
- Hibernate
- Spring Security
- MySQL Database
- RESTful API
- JUnit and Mockito for Testing
- Kafka/RabbitMQ for Messaging
- Docker for Containerization
- Swagger for API Documentation

## Prerequisites
- Java 11
- Maven
- Docker (for containerization)
- Kafka (local or Docker)

## Running the Application

### Using Maven
1. **Build the application**:
   ```bash
   mvn clean install
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### Using Docker
1. **Build the Docker image**:
   ```bash
   docker build -t rates-trading-platform .
   ```

2. **Run the Docker container:**
   ```bash
   docker-compose up
   ```

### Clearing Local Repository Cache (if needed)
If you encounter dependency issues, you may need to clear the local Maven repository cache:

#### Clear the local repository cache:
   ```bash
   rm -rf ~/.m2/repository
   ```

#### Force Maven to update dependencies:
   ```bash
   mvn clean install -U
   ```
  
#### Accessing the Application

   Swagger UI: http://localhost:8080/swagger-ui.html

INSERT INTO db_example.bond (interest_rate, maturity_date, name) VALUES (3, '2024-05-31', 'blahem')

SELECT t.*
FROM db_example.bond t
LIMIT 501