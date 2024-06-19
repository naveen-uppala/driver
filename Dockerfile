FROM amazoncorretto:17

# Set working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar customer.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "customer.jar"]




