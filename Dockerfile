#FROM openjdk:23
#COPY target/classes/com /tmp/com
#WORKDIR /tmp
#ENTRYPOINT ["java", "com.napier.devops.App"]


FROM openjdk:latest
COPY ./target/devops-0.1.0.1-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "devops-0.1.0.1-jar-with-dependencies.jar"]

