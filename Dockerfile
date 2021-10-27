FROM openjdk:8-jdk-alpine
EXPOSE 8081
ADD /target/client-ms-0.0.1-SNAPSHOT.jar Client-ms.jar
ENTRYPOINT ["java","-jar","Client-ms.jar"]