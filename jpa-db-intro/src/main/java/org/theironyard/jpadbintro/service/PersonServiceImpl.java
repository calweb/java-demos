package org.theironyard.jpadbintro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.theironyard.jpadbintro.model.Address;
import org.theironyard.jpadbintro.model.Email;
import org.theironyard.jpadbintro.model.Person;
import org.theironyard.jpadbintro.repository.AddressRepository;
import org.theironyard.jpadbintro.repository.EmailRepository;
import org.theironyard.jpadbintro.repository.PersonRepository;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    EmailRepository emailRepository;

    @Autowired
    AddressRepository addressRepository;

    @Transactional
    @Override
    public Person add(Person peep) {
        return personRepository.save(peep);
    }

    @Override
    @Transactional(readOnly = true)
    public Person find(int id) {
        return getPerson(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Transactional
    @Override
    public void update(Person person) {
        personRepository.save(person);
    }

    @Transactional
    @Override
    public void delete(int id) {
        Person person = this.find(id);
        emailRepository.delete(person.getEmails());
        if(person.getAddress() != null) {
            addressRepository.delete(person.getAddress());
        }
        personRepository.delete(id);
    }

    @Override
    public Person addAddress(Address address) {
        address = addressRepository.save(address);
        Person person = personRepository.findOne(address.getPerson().getId());
        person.setAddress(address);
        personRepository.save(person);
        return getPerson(address.getPerson().getId());
    }

    @Override
    public Person deleteAddress(int personId, int addressId) {
        addressRepository.delete(addressId);
        Person person = personRepository.findOne(personId);
        person.setAddress(null);
        personRepository.save(person);
        return getPerson(personId);
    }

    @Override
    public Person addEmail(Email email) {
        emailRepository.save(email);
        Person person = personRepository.findOne(email.getPerson().getId());
        person.getEmails().add(email);
        personRepository.save(person);
        return getPerson(email.getPerson().getId());
    }

    @Override
    public Person deleteEmail(int personId, int emailId) {
        Email email = emailRepository.findOne(emailId);
        emailRepository.delete(emailId);
        Person person = personRepository.findOne(personId);
        person.getEmails().remove(email);
        personRepository.save(person);
        return getPerson(personId);
    }

    private Person getPerson(int id) {
        Person person = personRepository.findOne(id);
        person.getEmails().size();
        return person;
    }
}
