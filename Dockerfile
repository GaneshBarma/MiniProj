FROM openjdk:8
MAINTAINER ganeshbarma barmaganesh@gmail.com
COPY ./target/Code-V1.0-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Code-V1.0-jar-with-dependencies.jar"]
