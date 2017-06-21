package com.snsystems.vehicle.client;
import java.io.IOException;

//import org.apache.commons.codec.binary.Base64;
//import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.web.client.RestTemplate;

//import exceptions.CustomExceptionHandler;
//import exceptions.UnknownHttpErrorException;
//import resources.CustomerCollectionRepresentation;


public class RestClient 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			// TODO use TLS 			
			RestTemplate template = new RestTemplate();		
//			template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
//			template.setErrorHandler(new CustomExceptionHandler(template));
//
			String originalUserPass = "rac:secret";
			String encodedData = new String(Base64.encode(originalUserPass.getBytes()));
			
			HttpHeaders headers = new HttpHeaders();
//			headers.add("Authorization", "Basic " + encodedData);
//			
			HttpEntity<String> request = new HttpEntity<String> (headers);

			ResponseEntity<String> response = template.exchange("http://localhost:8084/hello", HttpMethod.GET, request, String.class);

			
//			ResponseEntity<CustomerCollectionRepresentation> response = template.exchange("http://localhost:8080/crm/rest/customers?first=3&last=12", HttpMethod.GET, request, CustomerCollectionRepresentation.class);
//			
			String allCustomers = response.getBody();
			System.out.println(allCustomers);
			
//			Link link = allCustomers.getLink("next");
//			System.out.println("the next page will be at " + link);
//					
//			System.out.println(allCustomers);
//			
//			// second rest request
//			// SHOULD FAIL. no username/password
//			template.getForObject("http://localhost:8080/crm/rest/customers?first=3&last=12", CustomerCollectionRepresentation.class);
			
		}
		catch (UnknownHttpErrorException e) {
			System.out.println("Http Status " + e.getStatusCode().value() + " " + e.getStatusCode().getReasonPhrase());
		}
	}
	
	
	public void basicREST() {
		try
		{
			// TODO use TLS 			
			RestTemplate template = new RestTemplate();		
//			template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
//			template.setErrorHandler(new CustomExceptionHandler(template));
			
			HttpHeaders headers = new HttpHeaders();
//			headers.add("Authorization", "Basic " + encodedData);
//			
			HttpEntity<String> request = new HttpEntity<String> (headers);

			ResponseEntity<String> response = template.exchange("http://localhost:8084/hello", HttpMethod.GET, request, String.class);

			
			String allCustomers = response.getBody();
			System.out.println(allCustomers);
			
		}
		catch (UnknownHttpErrorException e) {
			System.out.println("Http Status " + e.getStatusCode().value() + " " + e.getStatusCode().getReasonPhrase());
		}
		
	}
}
