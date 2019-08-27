FROM openjdk:8-jre-alpine
MAINTAINER w
RUN ls
RUN echo "Hola Docker!!!"
ENTRYPOINT ["/usr/bin/java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/share/service.jar"]
CMD ["-start"]