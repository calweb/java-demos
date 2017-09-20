/**
 * Created by calvinwebster on 9/18/17.
 */
public class Weapon {

    protected String name;

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setRange(double range) {
        this.range = range;
    }

    protected double damage;

    protected double range;

    public void armCharacter (Character characterInstance) {
        characterInstance.setWeapon(this);
    }

    public Weapon(String name, double damage, double range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    public Weapon(String name) {
        this.name = name;
        this.damage = 20;
        this.range = 20; // units in feet
    }
}
