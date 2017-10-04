package org.theironyard.sqldbintro.repository;

import org.theironyard.sqldbintro.model.Person;

import java.util.List;

public interface PersonRepository {

    void add(Person person);

    Person getById(int id);

    List<Person> get();

    void update(Person person);
    void updateFirstName(Person person);

    void delete(int id);


}
