# Use OpenJDK as base image
FROM openjdk:21-jdk-slim

# Add a volume to store logs if needed
VOLUME /tmp

# Set the working directory
WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar


EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
