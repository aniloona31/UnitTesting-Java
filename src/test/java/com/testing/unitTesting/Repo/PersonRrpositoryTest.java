package com.testing.unitTesting.Repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.testing.unitTesting.Repositories.PersonRespository;
import com.testing.unitTesting.Entities.Person;

@SpringBootTest
public class PersonRrpositoryTest {
	
	@Autowired
	private PersonRespository personRepository;
	
	@Test
	void existsPersonById() {
		//this will add data to real db
		Person person = new Person(1L,"anirudh",20,"Chandigarh"); 
		
		personRepository.save(person);
		
		boolean actualResult = personRepository.existsPersonById(1L);
		
		
		assertThat(actualResult).isEqualTo(true);
	}
	
	@AfterEach
	void tearDown() {
		personRepository.deleteAll();
	}
}