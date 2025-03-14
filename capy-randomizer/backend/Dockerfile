FROM openjdk:17
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 25000
ENTRYPOINT ["java", "-jar", "app.jar"]
