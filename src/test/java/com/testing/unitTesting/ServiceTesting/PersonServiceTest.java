package com.testing.unitTesting.ServiceTesting;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

//import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;

//import com.testing.unitTesting.Entities.Person;
import com.testing.unitTesting.Repositories.PersonRespository;
import com.testing.unitTesting.Services.PersonService;


//this annotation is important as it open mocks for the repo
@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	
	//this is service testing and we have already tested our repo so we will not test repo again
	//for service testing we will have to use mockito...mock means fake...
	//we have to check if our getAllPersons mwthod of service is giving same result 
	//as the findAll method of our repo because that is what is going to happen.
	
	//we dont have to autowire because we dont want to get the actual data
	@Mock
	private PersonRespository personRepository;
	
	
	//when we use autowired here internally service is calling autowired to the repo
	//which will lead to caliing to actual db but that is not what we want...so we have to
	//pass a reference of above mock person repo to actual service so that the repo is
	//is fake and not the real one.
	private PersonService personService;
	
	@BeforeEach
	void setUp() {
		this.personService = new PersonService(personRepository);
	}
	
	@Test
	void getAllPersons() {
		personService.getAllPersons();
		
		verify(personRepository).findAll();
	}
}
