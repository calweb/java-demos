package org.theironyard.websecuritydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.theironyard.websecuritydemo.model.Person;
import org.theironyard.websecuritydemo.service.PersonService;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public String getPeople(Model model) {
        List<Person> people = personService.findAll();
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
        Person person = personService.find(personId);
        System.out.println(person);
        model.addAttribute("person", person);
        return "person";
    }

    @RequestMapping("/loggedout")
    String logout() {
        List<Person> people = personService.findAll();

        return "redirect:/people";
    }

    @RequestMapping("/admins-only")
    String admins() {
        return "admin";
    }

}
