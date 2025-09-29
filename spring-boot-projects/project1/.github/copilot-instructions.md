# Copilot Instructions for AI Coding Agents

## Project Overview

This is a Spring Boot backend project for managing school entities (e.g., students, teachers). The main application entry point is `src/main/java/com/springproject/project1/Project1Application.java`.

## Architecture & Key Components

- **Domain Models:**
  - `Student.java` and `Teacher.java` in `src/main/java/com/springproject/project1/` define core entities.
- **Application Entry:**
  - `Project1Application.java` is the Spring Boot main class.
- **Static & Template Resources:**
  - Static files: `src/main/resources/static/`
  - HTML templates: `src/main/resources/templates/`
- **Configuration:**
  - Main config: `src/main/resources/application.properties`
- **Testing:**
  - Unit tests: `src/test/java/com/springproject/project1/Project1ApplicationTests.java`

## Developer Workflows

- **Build:**
  - Use Maven wrapper: `./mvnw clean package` (Linux/macOS) or `mvnw.cmd clean package` (Windows)
- **Run:**
  - Start app: `./mvnw spring-boot:run` or `mvnw.cmd spring-boot:run`
- **Test:**
  - Run tests: `./mvnw test` or `mvnw.cmd test`
- **Jar Output:**
  - Built JAR: `target/project1-0.0.1-SNAPSHOT.jar`

## Patterns & Conventions

- **Package Structure:**
  - All Java code is under `com.springproject.project1`.
- **Resource Organization:**
  - Static files and templates are separated in `resources/`.
- **No custom Maven profiles or plugins detected.**
- **No database configuration found in `application.properties` (assume in-memory or default settings unless specified).**

## Integration Points

- **Spring Boot:**
  - Uses standard Spring Boot conventions for application startup and dependency injection.
- **No external API integrations or custom service boundaries detected.**

## Example: Adding a New Entity

1. Create a new Java class in `src/main/java/com/springproject/project1/`.
2. Update the main application or add new controllers/services as needed.
3. Add tests in `src/test/java/com/springproject/project1/`.

## Key Files

- `Project1Application.java`: Main entry point
- `Student.java`, `Teacher.java`: Domain models
- `application.properties`: Configuration
- `index.html`: Static homepage
- `Project1ApplicationTests.java`: Example test

---

**For questions or missing conventions, ask the user for clarification.**
