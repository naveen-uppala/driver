FROM amazoncorretto:17-alpine
COPY target/customer-0.0.1.jar /
#RUN apk --no-cache add curl
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "customer-0.0.1.jar"]
