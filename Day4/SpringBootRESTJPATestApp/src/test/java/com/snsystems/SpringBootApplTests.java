package com.snsystems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.snsystems.domain.Person;
import com.snsystems.repository.IPersonRepository;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = PersonService.class, loader = SpringBootContextLoader.class)

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringBootApplTests {

	@Autowired
	IPersonRepository personRepository;
	
	@Test
	public void contextLoad() {
		
		assertThat(personRepository).isNotNull();
	}
	
	@Test
	public void persons_is_not_empty() {
		
		assertThat(personRepository.findAll().size()).isEqualTo(5);
	}	


	@Test
	public void adding_person() {

		Person person = new Person();
		person.setId(20l);
		person.setFirstName("S");
		person.setLastName("N");
		person.setMoney(20000d);

		assertThat(personRepository.findAll().size()).isEqualTo(4);

		personRepository.save(person);

		assertThat(personRepository.findAll().size()).isEqualTo(5);
	}	

	@Test
	public void delete_person() {

		assertThat(personRepository.findAll().size()).isEqualTo(5);
		
		Person person = personRepository.findById(3l);
		personRepository.delete(person);
		
		assertThat(personRepository.findAll().size()).isEqualTo(4);
	}	
	
	
}
