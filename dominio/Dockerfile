FROM openjdk:8-jre-alpine
MAINTAINER Ciberdix
ARG JAR_FILE
ADD ${JAR_FILE} service.jar
ENTRYPOINT ["/usr/bin/java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "service.jar"]