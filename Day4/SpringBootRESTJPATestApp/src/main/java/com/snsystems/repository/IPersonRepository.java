package com.snsystems.repository;

import java.util.List;

import org.hibernate.annotations.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snsystems.domain.Person;

@Repository
//public interface IPersonRepository<Person> extends JpaRepository<Person, Long> {
public interface IPersonRepository extends JpaRepository<Person, Long> {

	Person findByFirstName(String name);

	Person findById(Long id);

	List<Person> findByLastName(String lastName);
	
}
