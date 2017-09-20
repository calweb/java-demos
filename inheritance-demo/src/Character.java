/**
 * Created by calvinwebster on 9/18/17.
 */
public class Character {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    protected String name;
    protected Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
