package com.theironyard;

public class Main {

    public static void main(String[] args) {

        Weapon katana = new Weapon("katana", 30);
        Weapon flamethrower = new Weapon("flamethrower", 60);

        Character phil = new Character("Phil", katana);
        Character chris = new Character("Chris", flamethrower);

        chris.attack(phil);
        phil.attack(chris);
        System.out.println("Phil's health: " + phil.getHealth());
        System.out.println("Chris's health: " + chris.getHealth());

    }
}
