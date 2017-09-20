package com.theironyard;

/**
 * Created by calvinwebster on 9/14/17.
 */
public class Character {

    String name;
    int health = 100;
    Weapon weapon = null;

    public Character(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void attack(Character characterInstance) {

       // remove health from characterInstance based on weapon instance
        Boolean isArmed = this.weapon != null;

        if(isArmed) {

            double randomNum = Math.random() * 10;

            if (randomNum > 7) {
                int currentHealth = characterInstance.getHealth() - this.weapon.getDamage();

                characterInstance.setHealth(currentHealth);
            } else {
                System.out.println(this.getName() + " pew pew, you missed!!");
            }

        }

    }

    public void armWeapon (Weapon weaponInstance) {
        // attach the weapon to the characterInstance
        this.setWeapon(weaponInstance);
    }

}
