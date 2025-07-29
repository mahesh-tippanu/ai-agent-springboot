# AI Agent - Spring Boot Project

This is a simple **Spring Boot** application serving as a starting point for building AI agent-based microservices using Java.

## 🚀 Features

- Spring Boot 3.2.x
- Java 21
- RESTful API with Spring Web
- Maven build system

## 📁 Project Structure

aiagent/
├── src/
│ ├── main/
│ │ ├── java/com/dravyn/aiagent/
│ │ │ └── AiagentApplication.java
│ │ └── resources/
│ │ └── application.properties
├── pom.xml

markdown
Copy
Edit

## 🛠️ Technologies Used

- Java 21
- Spring Boot 3.2.4
- Maven
- Git

## 📦 Build & Run

To build and run the application:

```bash
# Build
mvn clean install

# Run
mvn spring-boot:run
🌐 API Endpoint
By default, the app runs on:

arduino
Copy
Edit
http://localhost:8080
You can configure this in src/main/resources/application.properties.

🌳 Branches
master - main branch (stable)

dev - development branch (new features / in progress)

📤 Git Setup
bash
Copy
Edit
# Create and switch to dev branch
git checkout -b dev

# Add and commit
git add .
git commit -m "Initial Spring Boot project"

# Push to remote
git push origin dev
⚠️ Line Ending Warning (Windows Users)
If you see this warning:

vbnet
Copy
Edit
warning: LF will be replaced by CRLF
It’s safe to ignore. You can avoid it by running:

bash
Copy
Edit
git config --global core.autocrlf true
🧑‍💻 Author
Mahesh Kumar Tippanu
GitHub: mahesh-tippanu
