package org.theironyard.websecuritydemo;

import org.junit.After;
import org.theironyard.websecuritydemo.model.Person;
import org.theironyard.websecuritydemo.repository.PersonRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.theironyard.websecuritydemo.common.PersonUtils.createTestPerson;
import static org.theironyard.websecuritydemo.common.PersonUtils.findInList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @After
    public void deleteData() {
        List<Person> removeThesePeeps = personRepository.findAll();
        removeThesePeeps.stream().forEach((peep) -> personRepository.delete(peep.getId()));
    }
    @Test
    public void testAddGet() {
        // Get unique names every time this test runs
        String firstName = Long.toString(System.currentTimeMillis());
        String lastName = Long.toString(System.currentTimeMillis());

        Person person1 = new Person();
        person1.setFirstName(firstName);
        person1.setLastName(lastName);
        personRepository.save(person1);

        List<Person> people = personRepository.findAll();
        System.out.println(people);
        Person person2 = findInList(people, firstName, lastName);
        Assert.assertNotNull(person2);

        Person person3 = personRepository.findOne(person2.getId());
        Assert.assertNotNull(person3);
        Assert.assertEquals(firstName, person3.getFirstName());
        Assert.assertEquals(lastName, person3.getLastName());
    }

    @Test
    public void testUpdate() {
        Person person1 = createTestPerson();
        personRepository.save(person1);

        List<Person> people = personRepository.findAll();

        Person person2 = findInList(people, person1.getFirstName(), person1.getLastName());
        Assert.assertNotNull(person2);

        String updateFirstName = Long.toString(System.currentTimeMillis());
        String updateLastName = Long.toString(System.currentTimeMillis());

        person2.setFirstName(updateFirstName);
        person2.setLastName(updateLastName);
        personRepository.save(person2);

        people = personRepository.findAll();

        Person person3 = findInList(people, updateFirstName, updateLastName);
        Assert.assertNotNull(person3);
        Assert.assertEquals(person2.getId(), person3.getId());
    }

    @Test
    public void testDelete() {
        Person person1 = createTestPerson();
        personRepository.save(person1);

        List<Person> people = personRepository.findAll();

        Person person2 = findInList(people, person1.getFirstName(), person1.getLastName());
        Assert.assertNotNull(person2);

        personRepository.delete(person2.getId());

        people = personRepository.findAll();
        Person person3 = findInList(people, person1.getFirstName(), person1.getLastName());
        Assert.assertNull(person3);
    }


}
