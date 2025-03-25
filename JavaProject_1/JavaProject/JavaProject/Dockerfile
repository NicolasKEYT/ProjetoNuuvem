FROM nginx:alpine
COPY . /usr/share/nginx/html


FROM openjdk:21-jdk-alpine


WORKDIR /app


COPY target/JavaProject-0.0.1-SNAPSHOT.jar app.jar


EXPOSE 8080


CMD ["java", "-jar", "app.jar"]