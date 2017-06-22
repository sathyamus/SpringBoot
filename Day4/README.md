

C:\Workspace\SpringBoot\Day3\SpringBootVehicleWebAppWithSpringSecurity>cf push -p target/SpringBootVehicleWebAppWithSpringSecurity-0.0.1-SNAPSHOT.jar springsecu




External Tomcat

	http://docs.spring.io/spring-boot/docs/current/reference/html/howto-traditional-deployment.html



OAuth Authentication



Pusing applications to cloud-foundry

https://spring.io/guides/gs/sts-cloud-foundry-deployment/
http://docs.cloudfoundry.org/devguide/deploy-apps/manifest.html#buildpack


https://docs.spring.io/spring-boot/docs/current/reference/html/cloud-deployment.html


http://docs.pivotal.io/pivotalcf/1-8/buildpacks/java/gsg-spring.html


http://projects.spring.io/spring-security-oauth/docs/oauth2.html
https://spring.io/guides/tutorials/spring-boot-oauth2/



http://websystique.com/spring-security/secure-spring-rest-api-using-oauth2/


http://localhost:9090/oauth/token?grant_type=password&username=user1&password=password1
Add Basic Authorization
	Username: webapp
	Password: websecret

{
    "access_token": "86d55c6d-fad4-471f-b81e-11fbbe192b74",
    "token_type": "bearer",
    "expires_in": 43199,
    "scope": "read,write,trust"
}
	

http://localhost:9090/resource/endpoint
	this resource is protected by the resource server


http://localhost:9091/execute

	
==========

Implementation of Docker


Implementation of Ribin API



https://www.safaribooksonline.com/search/?query=building+microservices


https://www.safaribooksonline.com/search/?query=building%20microservices%20oauth&extended_publisher_data=true&highlight=true&is_academic_institution_account=false&source=user&include_assessments=false&include_case_studies=true&include_courses=true&include_orioles=true&include_playlists=true&sort=relevance




Spring Boot + JPA + REST + Testing

	https://spring.io/blog/2011/04/26/advanced-spring-data-jpa-specifications-and-querydsl/


	http://docs.spring.io/autorepo/docs/spring-data-jpa/1.7.x/api/org/springframework/data/jpa/repository/JpaRepository.html
	
	http://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration
	
	

	http://localhost:8080/persons
	
	http://localhost:8080/personByFirstName/Sathya
	
	http://localhost:8080/personByLastName/P
	
	
	CREATE : http://localhost:8080/person
	
	POST
	{
            "id": 6,
            "firstName": "SN",
            "lastName": "P",
            "money": 30000
	}
		
	UPDATE : http://localhost:8080/person
	
	PUT
	{
            "id": 6,
            "firstName": "SN123455",
            "lastName": "P",
            "money": 30000
	}
	

	
Spring Boot Testing

	http://www.springboottutorial.com/unit-testing-for-spring-boot-rest-services
	
	
	https://dzone.com/articles/junit-testing-rest-services
	
	
