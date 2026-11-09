# Travel Agency Website

A backend web application for a travel agency (Ταξιδιωτικό Πρακτορείο) where clients can browse trips around the world, book them, and cancel them.

## Project Idea and Inspiration

The goal of this project was to build a simple API while learning user authentication through Spring Boot's JDBC session management and user details. As someone who loves travelling and geography, I chose to build a travel app instead of a geography quiz app. Inspired by popular travel websites and apps, I wanted to see what I could create while trying out new technologies and getting a better grasp of the Spring Boot framework and PostgreSQL database management.

## Prerequisites

To run the project locally, you will need:

- Java JDK 25
- Spring Boot 4.1.2
- PostgreSQL 17.10
- Node.js v22.10

## Running the Backend

> **Note:** This is a monorepo — the Maven `pom.xml` lives inside `/server`, not at the repository root. If you open the root directory, it will not be detected as a Spring Boot project and the run button will not appear.

### Opening the Backend in IntelliJ

1. `File` → `Open...` → select `server/pom.xml` → **"Open as Project"**
2. `File` → `Project Structure` → `Project` → set **SDK** to JDK 25 (download via `SDKs` → `+` → `Download JDK` → `25` if needed) and **Language level** to 25.

### Running via Terminal

```shell
cd server
mvnw.cmd spring-boot:run
```

# API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
|POST    |/api/v1/register/  |Register a new user into the database|
|POST    |/api/v1/login/  |Login into account and start session|
|POST    |/api/v1/logout/  |Stop session and destroy session data|
|GET    |/api/v1/booking/my-bookings  |Get a users bookings|
|DELETE    |/api/v1/booking/my-bookings/{id}  |Delete a users booking|
|POST    |/api/v1/booking  |Create a new booking|
|GET    |/api/v1/continent  |Get all continents from the database|
|GET    |/api/v1/country/continent/{continentId}  |Get all countries from the continent with id|
|GET    |/api/v1/trip/country/{countryId}  |Get all trips from the country with id|

Feautures
---
- Swagger UI API Documentation
- Spring Security

---
# ERD
![alt text](https://github.com/sotosAdis92/TravelAgencyWebsite/blob/main/screenshots/ERDTourismWebAPI.JPG?raw=true)
