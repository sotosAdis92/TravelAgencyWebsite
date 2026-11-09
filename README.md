# Travel Agency Website

## Project Idea and Inspiration

### Project Idea

The idea behind the project was to create a Backend web app for a travel agency (Ταξιδιωτικό Πρακτορείο) where a client can enter, see trips around the world, book them and cancel them. It is a very simple API and the main idea behind it was to get to know the simple user authentication through Spring Boot JDBC Session management and user details. As a person who loves travelling and geography, I decided to create this app instead of a geography quiz app. Inspired by other popular websites and apps, I decided that it would be fun to see what I can create — plus I wanted to try out some new technologies and get a better grasp of the Spring Boot Framework and PostgreSQL database management.

---

## Prerequisites to Run Locally

- Java JDK 25 installed
- Spring Boot 4.1.2
- Postgres 17.10
- Node.js v22.10 installed

---

## Run the Backend

> **Note:** This is a monorepo — the Maven `pom.xml` is inside `/server`, not at the root of the repository. If you open the root, it will not be detected as a Spring Boot project and thus will not have the button to run it.

### Open the backend in IntelliJ

1. `File` → `Open...` → select `server/pom.xml` → **"Open as Project"**
2. `File` → `Project Structure` → `Project` → set **SDK** to JDK 25 (download via `SDKs` → `+` → `Download JDK` → `25` if needed) and **Language level** to 25.

### Run via terminal

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
