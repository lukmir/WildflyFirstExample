FROM openjdk:8-jdk-alpine
MAINTAINER lukmir
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]
ARG JAR_FILE
EXPOSE 8080
ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar