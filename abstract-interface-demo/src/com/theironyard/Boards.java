package com.theironyard;

/**
 * Created by calvinwebster on 9/20/17.
 */
public abstract class Boards {

    private String name;
    private double size;

    private String type;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String ride();

    public Boards(String name, double size, String type) {
        this.size = size;
        this.type = type;
        this.name = name;
    }
}
