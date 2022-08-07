package com.testing.unitTesting.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.testing.unitTesting.Entities.Person;
import com.testing.unitTesting.Services.PersonService;

public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public ResponseEntity<List<Person>> getAllPerson(){
		return new ResponseEntity<List<Person>>(personService.getAllPersons(),HttpStatus.OK);
	}
}
