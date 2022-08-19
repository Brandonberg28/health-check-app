#FROM openjdk:8-jdk-alpine
FROM maven:3.8.6-jdk-11 as builder
COPY pom.xml pom.xml
COPY src ./src
RUN mvn -DskipTests=true package
RUN ls /target
#RUN chmod /target/rest-service-complete-0.0.1-SNAPSHOT.jar
FROM 899991151204.dkr.ecr.us-east-1.amazonaws.com/openjdk11:amazon_linux
RUN sudo mkdir /target/
COPY --from=builder /target/rest-service-complete-0.0.1-SNAPSHOT.jar /target/rest-service-complete-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/target/rest-service-complete-0.0.1-SNAPSHOT.jar"]
CMD ["-start"]