package org.theironyard.websecuritydemo.common;

import org.theironyard.websecuritydemo.model.Person;

import java.util.List;

public class PersonUtils {

    public static Person createTestPerson() {
        // Get unique names every time this test runs
        String firstName = Long.toString(System.currentTimeMillis());
        String lastName = Long.toString(System.currentTimeMillis());

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return person;
    }


    public static Person findInList(List<Person> people, String first, String last) {
        // Find the new person in the list
        for (Person person : people) {
            if (person.getFirstName().equals(first) && person.getLastName().equals(last)) {
                return person;
            }
        }
        return null;
    }
    public static Person findInListFirstName(List<Person> people, String first) {
        // Find the new person in the list
        for (Person person : people) {
            if (person.getFirstName().equals(first)) {
                return person;
            }
        }
        return null;
    }
}
