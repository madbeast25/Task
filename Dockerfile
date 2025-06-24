FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /task_tracker

COPY pom.xml .
RUN mvn dependency:go offline

COPY src  ./src

RUN mvn clean package

FROM openjdk:21-jdk  AS runner

WORKDIR /task_tracker

COPY ./target/TaskTracker-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 3000

CMD [ "java","-jar","app.jar" ]


