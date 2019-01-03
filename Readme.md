
# Spring Boot, MongoDB, Angular 7 Restful API Tutorial Updated 2.2.2018 Version 0.04

Build a Fully-Fledged Todo App with Spring Boot & MongoDB in the Backend and Angular in the frontend.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. MongoDB - 3.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone git@github.com:callicoder/spring-boot-mongodb-angular-todo-app.git
```

**2. Build and run the backend app using maven**

```bash

cd spring-boot-backend
mvn package
java -jar target/todoapp-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The backend server will start at <http://localhost:8080>.

**3. Run the frontend app using npm**

```bash
cd angular-frontend
npm install
```

```bash
npm start
```

Frontend server will run on <http://localhost:4200>

## Learn more

Step 1: 
cd spring-boot-backend
mvn package
java -jar target/todoapp-1.0.0.jar
http://localhost:8080/api/todos

Step 2:
cd angular-frontend
npm install
npm start
http://localhost:4200
