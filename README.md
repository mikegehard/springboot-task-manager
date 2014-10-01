# Spring Boot Based Task Manager

## Deploying to CloudFoundry

1. `gradle clean build`
1. `cf push springBootTaskManager -p build/libs/taskManagerSpringBoot.war`
