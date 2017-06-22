package com.snsystems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsystems.domain.Person;
import com.snsystems.repository.IPersonRepository;

@Service("personService")
public class PersonService {
	
	@Autowired
	private IPersonRepository personRepository;
	
	// In-memory list
	private List<Person> persons = new ArrayList<Person>();

	public PersonService() {
		
//		persons.addAll(getAll());
		
	}

	/**
	 * Retrieves all persons
	 */
	public List<Person> getAll() {
		return this.personRepository.findAll();
	}

	/**
	 * Retrieves a single person
	 */
	public Person get(Long id) {
			for (Person person : persons) {
			if (person.getId().longValue() == id.longValue()) {
				return person;
			}
		}

		return null;
	}

	/**
	 * Adds a new person
	 */
	public Person add(Person person) {
		// logger.debug("Adding new person");

		try {
			// Find suitable id
			Long newId = 0L;
			Boolean hasFoundSuitableId = false;
			// A while loop to generate id based on existing id's in the
			// PersonList
			while (hasFoundSuitableId == false) {
				for (int i = 0; i < persons.size(); i++) {
					if (persons.get(i).getId().longValue() == newId.longValue()) {
						newId++;
						break;
					}
					// Exit while loop
					if (i == persons.size() - 1) {
						hasFoundSuitableId = true;
					}
				}
			}

			// Assign new id
			person.setId(newId);
			// Add to list
			persons.add(person);

			return person;
		} catch (Exception e) {
				return null;
		}
	}
}
