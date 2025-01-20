#use maven to build the app
FROM maven:3.9.8-eclipse-temurin-17 AS build

#set the working directory for the build
WORKDIR /app




# Copy the entire project into build container
COPY . .

#build the app and produce jar file
RUN mvn clean install  -DskipTests

#use minimal java runtime for the final image
FROM openjdk:21-jdk-slim
#FROM openjdk:17-jdk-alpine



# Copy the JAR file from the build to app.jar
COPY --from=build /app/target/student-management-system-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application app.jar
# when do container run this ENTRYPOINT is executed
ENTRYPOINT ["java","-jar", "/app.jar"]