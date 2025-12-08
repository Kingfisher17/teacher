
FROM eclipse-temurin:17-jre
RUN mvn clean package

WORKDIR /app
COPY target/*.jar app.jar

EXPOSE 8080
CMD [ "java","-jar","app.jar"]