FROM openjdk:11
EXPOSE 8080
ADD target/service-discovery.jar service-discovery.jar
ENTRYPOINT ["java","-jar","/service-discovery.jar"]