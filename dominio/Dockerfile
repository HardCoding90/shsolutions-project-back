#FROM openjdk:8-jre-alpine
#MAINTAINER w
#RUN ls
#ENTRYPOINT ["/usr/bin/java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/share/service.jar"]
#CMD ["-start"]

FROM java:8-jdk-alpine

COPY ./target/negocio-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch negocio-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","negocio-0.0.1-SNAPSHOT.jar"]