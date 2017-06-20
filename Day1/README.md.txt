
Consul
Valut
Zookeeper


https://logback.qos.ch/reasonsToSwitch.html



https://docs.spring.io/spring/docs/current/spring-framework-reference/html/overview.html

http://docs.spring.io/spring-boot/docs/1.5.4.RELEASE/reference/htmlsingle/#using-boot-starter

https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-auto-configuration.html
Disabling specific auto-configuration
	@Configuration
	@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})


Spring Initializr
	https://start.spring.io/

	https://www.javatpoint.com/spring-initializr



mvn clean eclipse:clean
mvn clean eclipse:eclipse
mvn clean install -Dmaven.test.skip=true

java -jar SpringBootBasic-0.0.1-SNAPSHOT.jar


Implement
	@Qualifier
	@Primary


Technical approach by spring
Maven - Starter POM
@SpringBootApplication
	-@Configuration
	-@EnableAutoConfiguration
	-@ComponentScan

Run -> Spring Boot -> Enable debug output checkbox
	
Enabling auto-restart of the spring-boot application on change (only in DEV)

	    <dependency>
	        <groupId>org.springframework.boot</groupId>
	        <artifactId>spring-boot-devtools</artifactId>
	    </dependency>
	
PS: Refresh the project and you should see [devtools] in the loaded project name.

	
	
	
Questions:
===========
	
REST what is the response body ?
how to pass external configuration file to spring boot application ??




1. URL : http://localhost:8080/hello

Solution: 

2. Configure a bean to give the response to the RestController
	a) Created Message class
	b) Annotate the class with @Component
	c) Autowire the class in controller


3. Create an external bean and configure in Spring boot

4. externalize the configurations of the bean application.properties


5. Message class has to be injected with video bean



