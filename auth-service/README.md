## Spring Boot + Auth Service + JIB(Push docker image to repository)
- It will run in all cases and there will not be 403 error in response.

### Usage

- Run the application and go on http://localhost:8081/auth-service/actuator/health

### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations for server port

#### Prerequisites

- Java 1.8
- Maven 3.6.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dkey1=value1 -Dkey2=value2"
    
## To Push the docker image to docerhub run below command and update pom.xml for user name and password
	$ mvn compile jib:build
	
## Run image in docker container
- docker run -p 8081:8081 -e registry.host="172.25.128.1"  pushpendrasingh0009/auth-service:0.0.3

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.
