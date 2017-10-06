package org.theironyard.sqldbintro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.theironyard.sqldbintro.model.Person;
import org.theironyard.sqldbintro.service.PersonService;

import java.util.List;

// people
//GET /api/people
//POST /api/people
//
//GET /api/people/personId
//PUT /api/people/personId
//DELETE /api/people/personId
//
//// posts
//GET /api/people/personId/posts
//POST /api/people/personId/posts
//
//GET /api/people/personId/posts/postId
//PUT /api/people/personId/posts/postId
//DELETE /api/people/personId/posts/postId
//
//GET /api/posts
//POST /api/posts
//
//GET /api/posts/postId
//PUT /api/posts/postId
//DELETE /api/posts/postId
//
//GET /api/posts/postId?author=person


@RestController
public class PersonControllerApi {

    @Autowired
    PersonService personService;

    @RequestMapping(path = "/api/people", method= RequestMethod.GET)
    public List<Person> getPeople() {
        List<Person> people = personService.get();

        return people;
    }

    @RequestMapping(path = "/api/people", method = RequestMethod.POST)
    public void addPerson(@RequestParam String firstName, @RequestParam String lastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        personService.add(person);
    }

    @RequestMapping(path = "/api/people/{personId}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable("personId") int personId) {
        Person person = personService.getById(personId);
        return person;
    }

    @RequestMapping(path = "/api/people/{personId}", method = RequestMethod.PUT)
    public void updatePerson(@PathVariable("personId") int personId, @RequestParam String firstName, @RequestParam String lastName) {

        Person person = personService.getById(personId);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        personService.update(person);
    }

    @RequestMapping(path = "/api/people/{personId}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable("personId") int personId) {
        personService.delete(personId);
    }
}
