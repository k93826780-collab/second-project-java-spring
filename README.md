# Second Project Java Spring

REST API project built with **Spring Boot**, **JPA**, and **H2** database.

# Technologies

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Maven
- Lombok
- Springdoc OpenAPI (Swagger)

# Project Structure
<img width="434" height="676" alt="image" src="https://github.com/user-attachments/assets/9b8ef8a9-bc84-4f4d-a6d3-48ff01c2016b" />
<img width="436" height="352" alt="image" src="https://github.com/user-attachments/assets/900891a1-7fb3-4dd6-863b-b968d22d6d4b" />

# Configuration

Application configuration is located in `application.properties`.

### H2 Database
``` properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
# H2 Console
H2 database console is available at:

http://localhost:8080/h2-console
<img width="1916" height="299" alt="image" src="https://github.com/user-attachments/assets/6fd3e208-1eb6-49cf-ade3-8efb4047ec5b" />


## JDBC URL:
jdbc:h2:mem:testdb
## USERNAME:
sa
## No password needed

# API Documentation (Swagger)
Swagger UI is available at:

http://localhost:8080/swagger-ui.html
<img width="1901" height="915" alt="image" src="https://github.com/user-attachments/assets/59e4b3b2-ae9e-4c69-a94b-fcd1f4f4b6b5" />

POST:
<img width="1280" height="884" alt="image" src="https://github.com/user-attachments/assets/5d19b879-98b4-44f8-8555-f4ed211fbdd6" />
<img width="1267" height="851" alt="image" src="https://github.com/user-attachments/assets/1efb79f4-9659-492e-88aa-659059650a88" />
GET:
<img width="1274" height="857" alt="image" src="https://github.com/user-attachments/assets/b0a7a33c-d352-4709-b1ed-a7d35a78cec8" />
<img width="1265" height="568" alt="image" src="https://github.com/user-attachments/assets/4888a637-0b2b-4ca6-907b-af05993aa0df" />
GET{id}:
<img width="1272" height="853" alt="image" src="https://github.com/user-attachments/assets/eae43dc1-7d9c-4e5e-8e08-8df0b41539a9" />
<img width="1271" height="481" alt="image" src="https://github.com/user-attachments/assets/8710aa3b-0095-4891-8a73-0eecf4a42522" />
PUT{id}:
<img width="1271" height="898" alt="image" src="https://github.com/user-attachments/assets/ac72c8d4-3035-40d7-b6ea-ebe61b63a4f4" />
<img width="1271" height="741" alt="image" src="https://github.com/user-attachments/assets/6ead27ef-3f8c-494e-aefb-423a96475549" />
DELETE{id}:
<img width="1269" height="757" alt="image" src="https://github.com/user-attachments/assets/8235dc60-0dcb-4c99-885b-0ee1a6657f35" />


##  Functionality
- create a product
- get all products
- get a product by id
- update a product by id
- delete a product by id
