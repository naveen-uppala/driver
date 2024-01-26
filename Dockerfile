# FROM amazoncorretto:17
# COPY target/customer-0.0.1.jar /
# EXPOSE 8081
# ENTRYPOINT ["java", "-jar", "customer-0.0.1.jar"]

FROM maven:3.9.4-amazoncorretto-17 as build1
COPY /. /java/
RUN mvn -f /java/pom.xml clean package

########## Second Stage build ###########
FROM amazoncorretto:17
COPY --from=build1 /java/target/customer-0.0.1.jar /java/customer-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/java/customer-0.0.1.jar"]
