package org.theironyard.websecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theironyard.websecuritydemo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
