FROM openjdk:8
ADD target/discoveryServer.jar discoveryServer.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","discoveryServer.jar"]