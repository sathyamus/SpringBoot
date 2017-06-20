package com.snsystems.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.snsystems.domain.Person;
import com.snsystems.domain.PersonList;

@Controller
public class RestClientController {

	// Create the RestTemplate object
	private RestTemplate restTemplate = new RestTemplate();

	/**
	 * Retrieves all records from the REST provider and displays the records in
	 * a JSP page
	 */
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public String getAll(Model model) {
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);

		// Prepare header
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);
		HttpEntity<Person> entity = new HttpEntity<Person>(headers);

		// Send the request as GET
		try {
			ResponseEntity<PersonList> result = restTemplate.exchange(
					"http://localhost:8080/AccountRestService/rest/persons", HttpMethod.GET, entity, PersonList.class);
			// Add to model
			model.addAttribute("persons", result.getBody().getData());

		} catch (Exception e) {
			System.out.println("Exception:" + e);
		}

		// This will resolve to /WEB-INF/jsp/personspage.jsp
		return "personspage";
	}

	/**************** To add Person Object *********************************/

	/**
	 * Retrieves the JSP add page to add Person details and then from form
	 * invoke the
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddPage(Model model) {
		// Create new Person and add to model
		// This is the formBackingOBject
		model.addAttribute("personAttribute", new Person());

		// This will resolve to /WEB-INF/JSP/addpage.jsp
		return "addpage";
	}

	/**
	 * Sends a new record to the REST provider based on the information
	 * submitted from the JSP add page.
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("personAttribute") Person person, Model model) {
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);

		// Prepare header
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);

		// Pass the new person and header
		HttpEntity<Person> entity = new HttpEntity<Person>(person, headers);

		// Send the request as POST
		try {
			ResponseEntity<Person> result = restTemplate.exchange(
					"http://localhost:8080/AccountRestService/rest/person", HttpMethod.POST, entity, Person.class);
		} catch (Exception e) {
			System.out.println("Exception from Post:" + e);
		}

		// This will resolve to /WEB-INF/jsp/resultpage.jsp
		return "resultpage";
	}

}
