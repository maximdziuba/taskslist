# Tasks list #

## Description ##
This is web API, that implements basic CRUD functionallity. User can register and than access
the API with JWT-token. In the app were used no Spring Data, that's why all operations with database
were done Spring Data JDBC and then with MyBatis.
Stack:
- Java 17
- Spring Boot 3
- Spring Security
- Spring Data JDBC
- MyBatis
- Liquibase
- Postgres


## Running ##
1. You have to clone this repository ``git clone https://github.com/maximdziuba/taskslist.git``
2. Open the project folder
3. Run the project ``./gradlew bootRun``
4. Now you can try the API with Swagger by the path ``localhost:8080/swagger-ui/index.html``