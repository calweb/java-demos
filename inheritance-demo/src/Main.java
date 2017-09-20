/**
 * Created by calvinwebster on 9/18/17.
 */


public class Main {

    public static void main(String[] args) {

//        String[] students = {"chad", "chris", "stephen"};
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }
//
//        for (String stud : students ) {
//            System.out.println(stud);
//        }
//
//        int[] myNums = {2,4,6,8};
//        System.out.println("length of mynums" + myNums.length);
        Bubba bubba = new Bubba(27, "Bubba" );

        System.out.println(bubba.greeting());

        Weapon weapon = new Weapon("Rifle", 35, 1000);
        Weapon weaponPistol = new Weapon("Pistol", 25, 900);
        Weapon slingshot = new Weapon("Sling Shot");
        Weapon slingshot1 = new Weapon("Sling Shot 1");
        Weapon slingshot2 = new Weapon("Sling Shot 2");
        Weapon slingshot3 = new Weapon("Sling Shot 3");

        Knife whiteWalkerKiller = new Knife("GOT Knife", 2, true);

        Gun sawedOffShotgun = new Gun("Sawed Off Shotgun", 100.5, 50.0, "Shotgun shell", 12.0, 13, false);
        Gun pistol = new Gun("Vanilla Pistol", 90.0, 200, "bullet", 9, 8, true);
        System.out.println(whiteWalkerKiller.damage);
        whiteWalkerKiller.setDamage(10000.0);
        System.out.println(whiteWalkerKiller.damage);

        while(sawedOffShotgun.getRounds() > 0) {
            sawedOffShotgun.shoot();
        }
        pistol.shoot();

        sawedOffShotgun.shoot();
        sawedOffShotgun.reload();
        System.out.println(sawedOffShotgun.getRounds());
        System.out.println(sawedOffShotgun.damage);

        System.out.println(sawedOffShotgun);

    }
}
