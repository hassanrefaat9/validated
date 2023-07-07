# REST API with Spring Boot Validation
This is a sample REST API project built with Spring Boot that demonstrates how to   
implement request payload validation using annotations from the jakarta.validation package.

## Features

- Create users with name and email fields
- Validate name (required, not blank) and email (required, valid email format) fields
- Return appropriate response and error messages for validation failures

## Installation
### Add Dependencies
Add the following dependencies to your pom.xml file.
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

## API Endpoints
### Create User

#### Request
POST /api/v1/user/
```json
{
    "name": "Hassan",
    "email": "h@gamil.com"
}
```
#### Response
```json
{
    "id": 1,
    "name": "Hassan",
    "email": "h@gamil.com"
}
```
### Validation Error
#### Request
POST /api/v1/user/
```json
{
    "name": "",
    "email": "h@gamil.com"
}
```
#### Response
```json
{
    "name": "must not be null"
}
```