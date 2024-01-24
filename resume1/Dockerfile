FROM openjdk:17
VOLUME /tmp
COPY build/libs/*.jar resume1-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/resume1-0.0.1-SNAPSHOT.jar"]
