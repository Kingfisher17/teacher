FROM maven:3.8.2-openjdk-8 AS build
WORKDIR /app
COPY . .
RUN mvn -q -DskipTests package

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]