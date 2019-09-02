#FROM adoptopenjdk/openjdk12:latest
#RUN mkdir /opt/app
#COPY japp.jar /opt/app
#CMD ["java", "-jar", "/opt/app/japp.jar"]

# Use official base image of Java Runtim
FROM adoptopenjdk/openjdk12:latest

# Set volume point to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside container
EXPOSE 8080

# Set application's JAR file
#ARG JAR_FILE=target/demo-docker-file-0.0.1-SNAPSHOT.jar

# Add the application's JAR file to the container
#ADD ${JAR_FILE} app.jar
ADD target/demo-docker-file-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]