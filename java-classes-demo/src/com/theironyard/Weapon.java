package com.theironyard;

/**
 * Created by calvinwebster on 9/14/17.
 */
public class Weapon {

    String name;
    int damage;
    Boolean isLoaded;

    public Weapon(String name, int damage) {

        this.name = name;
        this.damage = damage;
        this.isLoaded = true;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Boolean getLoaded() {
        return isLoaded;
    }

    public void setLoaded(Boolean loaded) {
        isLoaded = loaded;
    }

}
