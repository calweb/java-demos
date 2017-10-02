package com.calweb.webdemo;

public class Ship {

    private String name;
    private boolean seaworthy;
    private int capacity;

    public Ship(String name, boolean seaworthy, int capacity) {
        this.name = name;
        this.seaworthy = seaworthy;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSeaworthy() {
        return seaworthy;
    }

    public void setSeaworthy(boolean seaworthy) {
        this.seaworthy = seaworthy;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
