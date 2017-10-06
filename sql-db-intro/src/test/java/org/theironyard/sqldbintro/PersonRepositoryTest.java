package org.theironyard.sqldbintro;

import org.junit.After;
import org.theironyard.sqldbintro.model.Person;
import org.theironyard.sqldbintro.repository.PersonRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.theironyard.sqldbintro.common.PersonUtils.createTestPerson;
import static org.theironyard.sqldbintro.common.PersonUtils.findInList;
import static org.theironyard.sqldbintro.common.PersonUtils.findInListFirstName;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @After
    public void deleteData() {
        List<Person> removeThesePeeps = personRepository.get();
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
        personRepository.add(person1);

        List<Person> people = personRepository.get();
        System.out.println(people);
        Person person2 = findInList(people, firstName, lastName);
        Assert.assertNotNull(person2);

        Person person3 = personRepository.getById(person2.getId());
        Assert.assertNotNull(person3);
        Assert.assertEquals(firstName, person3.getFirstName());
        Assert.assertEquals(lastName, person3.getLastName());
    }

    @Test
    public void testUpdate() {
        Person person1 = createTestPerson();
        personRepository.add(person1);

        List<Person> people = personRepository.get();

        Person person2 = findInList(people, person1.getFirstName(), person1.getLastName());
        Assert.assertNotNull(person2);

        String updateFirstName = Long.toString(System.currentTimeMillis());
        String updateLastName = Long.toString(System.currentTimeMillis());

        person2.setFirstName(updateFirstName);
        person2.setLastName(updateLastName);
        personRepository.update(person2);

        people = personRepository.get();

        Person person3 = findInList(people, updateFirstName, updateLastName);
        Assert.assertNotNull(person3);
        Assert.assertEquals(person2.getId(), person3.getId());
    }

    @Test
    public void testDelete() {
        Person person1 = createTestPerson();
        personRepository.add(person1);

        List<Person> people = personRepository.get();

        Person person2 = findInList(people, person1.getFirstName(), person1.getLastName());
        Assert.assertNotNull(person2);

        personRepository.delete(person2.getId());

        people = personRepository.get();
        Person person3 = findInList(people, person1.getFirstName(), person1.getLastName());
        Assert.assertNull(person3);
    }

    @Test

    public void updateFirstNameTestPerson() {
        Person person1 = createTestPerson();
        personRepository.add(person1);

        List<Person> people = personRepository.get();

        Person person2 = findInList(people, person1.getFirstName(), person1.getLastName());
        String updateFirstName = Long.toString(System.currentTimeMillis());
        String updateLastName = Long.toString(System.currentTimeMillis());

        person2.setFirstName(updateFirstName);

        personRepository.updateFirstName(person2);

        Assert.assertNotNull(person2);

        people = personRepository.get();

        Person person3 = findInListFirstName(people, updateFirstName);
        Assert.assertNotNull(person3);
        Assert.assertEquals(person2.getId(), person3.getId());
        Assert.assertEquals(person3.getFirstName(), updateFirstName);

    }


}
