FROM alpine:latest


RUN apk add --no-cache openjdk21

WORKDIR /app
COPY target/JavaProject-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 25000

CMD ["java", "-jar", "app.jar"]
