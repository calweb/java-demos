/**
 * Created by calvinwebster on 9/18/17.
 */
public class Knife extends Weapon {

    private int length;
    private boolean isFixed;

    private String material;

    public void setMaterial(String material) {
        this.material = material;
    }

    public Knife(String name, int length, boolean isFixed) {
        super(name);
        this.length = length;
        this.isFixed = isFixed;
        this.material = "Dragon Glass";
    }
}
