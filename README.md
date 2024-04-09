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

## Testing events with docker

If you wish to test the consumption of events from a Kafka topic, it's necessary to ensure that both the Kafka server and the Docker container are configured on the same network. This setup is required to establish a connection successfully.

Create image

```bash
docker build -t mca-backend .
```

Get the kafka-server network

```bash
docker network ls
```

Run docker image

```bash
docker run -p 8080:8080 --network=<name_of_your_network> mca-backend
```

## Monitoring

- [/h2-console](http://localhost:8080/h2-console)
