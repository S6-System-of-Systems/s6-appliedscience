FROM openjdk:17-jdk
MAINTAINER "Rick Meels"
EXPOSE 8080
COPY target/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "api-0.0.1-SNAPSHOT.jar"]