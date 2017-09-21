package com.theironyard;

/**
 * Created by calvinwebster on 9/20/17.
 */
public class Surfboard extends Boards {
    public int getRocker() {
        return rocker;
    }

    public void setRocker(int rocker) {
        this.rocker = rocker;
    }

    public String getFintype() {
        return fintype;
    }

    public void setFintype(String fintype) {
        this.fintype = fintype;
    }

    public String getTailType() {
        return tailType;
    }

    public void setTailType(String tailType) {
        this.tailType = tailType;
    }

    private int rocker;
    private String fintype;
    private String tailType;

    public Surfboard(String name, double size, String type, int rocker, String fintype, String tailType) {
        super(name, size, type);
        this.rocker = rocker;
        this.fintype = fintype;
        this.tailType = tailType;
    }

    public String ride(int lengthOfRide) {

        return "Cool, im riding a surfboard! catchin waves dude! I rode that wave for " + lengthOfRide + " seconds";
    }

    public String ride() {
        return "Im being a good subclass, and not giving any parameters to this method, ride()";
    }

    @Override
    public String toString() {
        return "Surfboard{" +
                "name=" + getName() +
                " rocker=" + rocker +
                ", fintype='" + fintype + '\'' +
                ", tailType='" + tailType + '\'' +
                '}';
    }
}
