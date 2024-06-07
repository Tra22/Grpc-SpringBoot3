# Spring Boot 3 with Grpc
This example explained about spring boot3 with Grpc.

## Requirements

The fully fledged server uses the following:

* Spring Framework
* Spring Data Jpa
* H2 database
* Grpc Server
* io.grpc
* SpringBoot
* Log4j2
* Lombok
* Mapstruct

## Plugin
There are a number of third-party plugins

    <plugin>
        <groupId>com.github.os72</groupId>
		<artifactId>protoc-jar-maven-plugin</artifactId>
		<version>3.11.4</version>
		<executions>
		    <execution>
			    <phase>generate-sources</phase>
				<goals>
				    <goal>run</goal>
				</goals>
                <configuration>
                    <includeMavenTypes>direct</includeMavenTypes>
                    <inputDirectories>
                        <include>src/main/resources</include>
                    </inputDirectories>
                    <outputTargets>
                        <outputTarget>
                            <type>java</type>
                            <addSources>none</addSources>
                            <cleanOutputFolder>true</cleanOutputFolder>
                            <outputDirectory>${project.basedir}/src/main/generated</outputDirectory>
                        </outputTarget>
                        <outputTarget>
                            <type>grpc-java</type>
                            <addSources>none</addSources>
                            <cleanOutputFolder>true</cleanOutputFolder>
                            <outputDirectory>${project.basedir}/src/main/generated</outputDirectory>
                            <pluginArtifact>io.grpc:protoc-gen-grpc-java:${io.grpc.version}</pluginArtifact>
                        </outputTarget>
                    </outputTargets>
                </configuration>
            </execution>
        </executions>
    </plugin>
	<plugin>
	    <groupId>org.codehaus.mojo</groupId>
		<artifactId>build-helper-maven-plugin</artifactId>
		<executions>
		    <execution>
			    <id>add-source</id>
				<phase>generate-sources</phase>
				<goals>
				    <goal>add-source</goal>
				</goals>
                <configuration>
                    <sources>
                        <source>src/main/generated</source>
                    </sources>
                </configuration>
            </execution>
        </executions>
	</plugin>

## Dependencies
There are a number of third-party dependencies used in the project. Browse the Maven pom.xml file for details of libraries and versions used.<br>

  	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.mapstruct</groupId>
			<artifactId>mapstruct</artifactId>
			<version>${org.mapstruct.version}</version>
		</dependency>

		<dependency>
			<groupId>net.devh</groupId>
			<artifactId>grpc-server-spring-boot-starter</artifactId>
			<version>${grpc.server.starter.version}</version>
		</dependency>
		<dependency>
			<groupId>io.grpc</groupId>
			<artifactId>grpc-protobuf</artifactId>
			<version>${io.grpc.version}</version>
		</dependency>
		<dependency>
			<groupId>io.grpc</groupId>
			<artifactId>grpc-stub</artifactId>
			<version>${io.grpc.version}</version>
		</dependency>
		<dependency> <!-- necessary for Java 9+ -->
			<groupId>org.apache.tomcat</groupId>
			<artifactId>annotations-api</artifactId>
			<version>6.0.53</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>io.micrometer</groupId>
			<artifactId>micrometer-tracing-bridge-brave</artifactId>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.7</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

## Building the project
You will need:

*	Java JDK 17 or higher
*	Maven 3.5.1 or higher
*	Tomcat 10.1

Clone the project and use Maven to build the server

	$ mvn clean install
	
