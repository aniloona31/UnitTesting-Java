package com.testing.unitTesting.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.unitTesting.Entities.Person;


@Repository
public interface PersonRespository extends JpaRepository<Person, Long> {

}
