package org.theironyard.websecuritydemo.service;

import org.theironyard.websecuritydemo.model.Address;
import org.theironyard.websecuritydemo.model.Email;
import org.theironyard.websecuritydemo.model.Person;

import java.util.List;

public interface PersonService {
    Person add(Person person);

    List<Person> findAll();
    Person find(int id);
    void update(Person person);
    void delete(int id);

    Person addAddress(Address address);
    Person deleteAddress(int personId, int addressId);

    Person addEmail(Email email);
    Person deleteEmail(int personId, int emailId);

}
