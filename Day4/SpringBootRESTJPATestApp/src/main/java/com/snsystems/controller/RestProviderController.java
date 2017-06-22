package com.snsystems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.snsystems.domain.Person;
import com.snsystems.domain.PersonList;
import com.snsystems.service.PersonService;

/**
 * REST service provider
 * 
 * Only GET and POST will return values PUT and DELETE will not.
 */
@Controller
public class RestProviderController {

	@Autowired
	PersonService personService;

	/*
	 * Rest method to retrieve List from service class and add it in the data
	 * list created in PersonList class
	 */
	@RequestMapping(value = "/persons", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody PersonList getPerson() {
		// Call service here
		PersonList result = new PersonList();
		// Sets the List returned by getAll() method in PersonList
		result.setData(personService.getAll());
		return result;
	}

	/*
	 * Rest service method to get Person object based on Id
	 */
	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET, headers = "Accept=text/plain,application/xml, application/json")
	public @ResponseBody Person getPerson(@PathVariable("id") Long id) {
		// Call service here
		return personService.get(id);
	}

	/*
	 * Rest service method to get Person object based on FirstName
	 */
	@RequestMapping(value = "/personByFirstName/{name}", method = RequestMethod.GET)
	public @ResponseBody Person getPersonByName(@PathVariable("name") String name) {
		// Call service here
		return personService.findByFirstName(name);
	}

	/*
	 * Rest service method to get Person object based on FirstName
	 */
	@RequestMapping(value = "/personByLastName/{name}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody PersonList getPersonByLastName(@PathVariable("name") String name) {

		// Call service here
		PersonList result = new PersonList();
		result.setData(personService.findByLastName(name));
		return result;
	}
	
	/*
	 * Rest method to add Person object in the service class PersonList
	 */
	@RequestMapping(value = "/person", method = RequestMethod.POST, headers = "Accept=application/xml, application/json")
	public @ResponseBody Person addPerson(@RequestBody Person person) {
		// Call service to here
		return personService.add(person);
	}

	/*
	 * Rest method to add Person object in the service class PersonList
	 */
	@RequestMapping(value = "/person", method = RequestMethod.PUT, headers = "Accept=application/xml, application/json")
	public @ResponseBody Person updatePerson(@RequestBody Person person) {
		// Call service to here
		return personService.add(person);
	}

}
