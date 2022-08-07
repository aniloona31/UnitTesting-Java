package com.testing.unitTesting.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.unitTesting.Entities.Person;
import com.testing.unitTesting.Repositories.PersonRespository;

@Service
public class PersonService {
	@Autowired
	private PersonRespository personRepository;
	
	public List<Person> getAllPersons(){
		try {
			List<Person> persons = personRepository.findAll(); 
			return persons;
		}catch(Exception e) {
			throw new RuntimeException("data not found");
		}
	}
}
