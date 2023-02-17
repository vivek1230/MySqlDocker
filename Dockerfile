FROM openjdk:17
ADD target/mysql-docker.jar mysql-docker.jar
ENTRYPOINT ["java","-jar","/mysql-docker.jar"]