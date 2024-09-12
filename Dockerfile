FROM maven:3.8.2-eclipse-temurin-17 AS builder

WORKDIR /app

COPY . .

RUN mvn clean package

FROM eclipse-temurin:17.0.6_10-jdk-alpine

WORKDIR app

COPY --from=builder /app/target/ingest-events-0.0.1-SNAPSHOT.jar app.jar
