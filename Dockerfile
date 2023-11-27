FROM amazoncorretto:17-alpine
COPY target/packersmovers.jar /
#RUN apk --no-cache add curl
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "packersmovers.jar"]
