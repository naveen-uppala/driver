FROM amazoncorretto:17
COPY target/customer-1.0.1.jar /
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "customer-1.0.1.jar"]



