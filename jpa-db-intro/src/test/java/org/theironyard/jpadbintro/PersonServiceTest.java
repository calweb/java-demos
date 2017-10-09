package org.theironyard.jpadbintro.service;

import org.theironyard.jpadbintro.model.Person;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.dao.DataIntegrityViolationException;

import java.util.ArrayList;
import java.util.List;

import static org.theironyard.jpadbintro.common.PersonUtils.createTestPerson;
import static org.theironyard.jpadbintro.common.PersonUtils.findInList;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @Autowired
    PersonService personService;

    @Test
    public void testTransactional() {
        Person person1 = createTestPerson();
        Person person2 = createTestPerson();
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        person2.setFirstName("Charlie");
        // Cause an error
        person2.setFirstName(null);
        try {
//             personService.add(people);
            Assert.assertFalse("Expected an exception to be thrown", Boolean.parseBoolean(person2.getFirstName()));
            Assert.assertEquals(person2.getFirstName(), "Charlie");
        } catch(DataIntegrityViolationException e) {
            System.out.println("Received an exception as expected.");
        }

        people = personService.findAll();
        Person person1Retrieved =
                findInList(people, person1.getFirstName(), person1.getLastName());
        Assert.assertNull("The first person created should have rolled back",
                person1Retrieved);
    }
}

