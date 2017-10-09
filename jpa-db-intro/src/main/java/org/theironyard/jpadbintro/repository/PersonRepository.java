package org.theironyard.jpadbintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theironyard.jpadbintro.model.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
