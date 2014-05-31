# Spring Boot Based Task Manager

## Useful Maven Tasks

1. dependencies:tree - See dependency tree
1. spring-boot:run - Run server using embedded Tomcat

## Deploying to CloudFoundry

1. `mvn clean package`
1. `cf push springBootTaskManager -p target/taskManager-0.0.1-SNAPSHOT.jar`
