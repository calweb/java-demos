package com.calweb.webdemo;

public class Planet {

    private double size;
    private String name;
    private boolean isHabitable;

    public Planet(double size, String name, boolean isHabitable) {
        this.size = size;
        this.name = name;
        this.isHabitable = isHabitable;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHabitable() {
        return isHabitable;
    }

    public void setHabitable(boolean habitable) {
        isHabitable = habitable;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", isHabitable=" + isHabitable +
                '}';
    }
}
