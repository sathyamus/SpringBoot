package com.snsystems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsystems.domain.Person;
import com.snsystems.repository.IPersonRepository;

@Service("personService")
public class PersonService {
	
	@Autowired
	private IPersonRepository personRepository;
	
	public PersonService() {
		// persons.addAll(getAll());
	}

	/**
	 * Retrieves all persons
	 */
	public List<Person> getAll() {
		System.out.println("calling findAll()");
		return this.personRepository.findAll();
	}

	/**
	 * Retrieves a single person
	 */
	public Person get(Long id) {
		System.out.println("calling findById(id)");
		Person person = this.personRepository.findById(id);
		return person;
	}

	/**
	 * Adds a new person
	 */
	public Person add(Person person) {
		System.out.println("Adding new person");
		this.personRepository.save(person);
		return person;
	}
}
