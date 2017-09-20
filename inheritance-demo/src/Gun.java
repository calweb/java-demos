/**
 * Created by calvinwebster on 9/18/17.
 */
public class Gun extends Weapon {

    private String ammoType;
    private double caliber;
    private double barrelLength;
    private boolean isLegal;
    private int rounds = 10;

    public int getRounds() {
        return rounds;
    }

    public Gun(String name, double damage, double range, String ammoType, double caliber, double barrelLength, boolean isLegal) {
        super(name, damage, range);
        this.ammoType = ammoType;
        this.caliber = caliber;
        this.barrelLength = barrelLength;
        this.isLegal = isLegal;
    }

    public void shoot () {

        if(this.rounds <= 0) {
            System.out.println("Sorry, you are out of Ammo, please reload");
        } else {
            this.rounds = this.rounds - 1;
            System.out.println("Nice shot!!!  You gunslinger, you!");
            System.out.println("You have " + this.rounds + " left, be careful!" );
        }


    }

    public void reload () {
        this.rounds = 100;
        System.out.println("You have reloaded and have 100 rounds!  go get'em!");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Ammo Type: " + this.ammoType + " Damage: " + this.damage;
    }
}
