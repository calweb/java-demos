package com.calweb.webdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExampleRestController {

    List<String> players = new ArrayList<>();
    List<Planet> planets = new ArrayList<>();
    List<Ship> ships = new ArrayList<>();

    @RequestMapping(path = "/api/people", method = RequestMethod.GET)
    public List<String> getPlayers() {
        List<String> p = this.buildPlayers();
        return p;
    }

    @RequestMapping(path = "/api/planets", method = RequestMethod.GET)
    public List<Planet> getPlanets() {
        List<Planet> p = this.buildPlanets();
        return p;
    }

    @RequestMapping(path = "/api/ships", method = RequestMethod.GET)
    public List<Ship> getShips() {
        List<Ship> p = this.buildShips();

        return p;
    }


    private List buildPlayers () {

        players.add("Johnny Appleseed");
        players.add("Calvin Webster");
        players.add("Elton John");
        players.add("Heather Dugaish");
        players.add("Kaity Miller");
        players.add("Andi Coaker");
        players.add("Bubba Lecheminant");
        players.add("Spencer Oakes");

        return players;
    }

    private List buildPlanets() {
        planets.add(new Planet(1000.9, "Earth", true));
        planets.add(new Planet(3000.9, "Saturn", false));
        planets.add(new Planet(500.0, "Mercury", false));
        planets.add(new Planet(19000.9, "Jupiter", false));
        planets.add(new Planet(5000.9, "Uranus", false));
        planets.add(new Planet(7000.3, "Neptune", false));
        planets.add(new Planet(1000.4, "Mars", true));

        return planets;
    }

    private List buildShips () {
        ships.add(new Ship("QAR", false, 75));
        ships.add(new Ship("RV Susan Hudson", true, 50));
        ships.add(new Ship("SS Minnow", true, 3));
        ships.add(new Ship("Titanic", false, 3000));

        return ships;
    }

}
