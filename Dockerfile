FROM amazoncorretto:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} rest-service-0.0.1-SNAPSHOT.jar
COPY JSON2.json ./
ENTRYPOINT ["java","-jar","/rest-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081

