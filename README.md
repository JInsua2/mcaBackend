# MCA backend technical test

## Getting started

**Requeriments**

- Java 17
- Maven 3.X.X

Prepare your environment

```bash
docker compose up
```

Install the project

```bash
mvn clean install
```

Run it

```bash
mvn spring-boot:run -Dspring-boot.run
```
## Description 
A microservice has been developed which is capable of processing stock change events for a video game from a Kafka topic.

An endpoint has also been made public so that games related to a saga can be obtained. For more information about this endpoint, please refer to the following Usage section.
## Usage

See on [swagger ui](http://localhost:8080/swagger-ui/index.html)

## Monitoring

- [/h2-console](http://localhost:8080/h2-console)
