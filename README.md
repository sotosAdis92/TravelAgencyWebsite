# Travel Agency Website

## Project Idea and Inspiration

### Project Idea

The idea behind the project was to create a Backend web app for a travel agency (Ταξιδιωτικό Πρακτορείο) where Admin can enter, see trips around the world. As a person who loves travelling and geography, I decided to create this app instead of a geography quiz app. Inspired by other popular websites and apps, I decided that it would be fun to see what I can create — plus I wanted to try out some new technologies and get a better grasp of the Spring Boot Framework and PostgreSQL database management.

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
Feautures
---
- Swagger UI API Documentation
- Spring Security
