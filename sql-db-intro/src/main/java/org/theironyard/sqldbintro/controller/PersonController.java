package org.theironyard.sqldbintro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.theironyard.sqldbintro.model.Person;
import org.theironyard.sqldbintro.service.PersonService;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public String getPeople(Model model) {
        List<Person> people = personService.get();
        model.addAttribute("people", people);
        return "peopleList";
    }

    @RequestMapping(value = "/people", method = RequestMethod.POST)
    public String addPerson(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        Person newPerson = new Person();
        newPerson.setFirstName(firstName);
        newPerson.setLastName(lastName);
        personService.add(newPerson);

        return "redirect:/people";

    }

    @RequestMapping(value = "/people/add", method = RequestMethod.GET)
    public String addPersonForm() {
        return "addPersonForm";
    }

    @RequestMapping(value = "/people/{personId}", method = RequestMethod.GET)
    public String getPerson(@PathVariable("personId") int personId, Model model) {
        Person person = personService.getById(personId);
        System.out.println(person);
        model.addAttribute("person", person);
        return "person";
    }

}
