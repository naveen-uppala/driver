# FROM amazoncorretto:17
# COPY target/customer-1.0.1.jar /
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "customer-1.0.1.jar"]


################ MULTI STAGE DOCKER BUILD###########################

################ First Stage build ###########################
FROM maven:3.9.4-amazoncorretto-17 as build1
COPY /. /java/
RUN mvn -f /java/pom.xml clean install

########## Second Stage build ###########
FROM amazoncorretto:17
COPY --from=build1 /java/target/driver-1.0.1.jar /java/driver-1.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/java/driver-1.0.1.jar"]
