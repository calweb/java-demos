package com.theironyard;

/**
 * Created by calvinwebster on 9/21/17.
 */
public class Squid extends Animal {

    public String speak() {
        return "gargle gargle, im eating shellfish and pirates!";
    }

    public void eat(String food) {
        this.utensil("in my tummy");
    }

    public void utensil(String food) {
        System.out.println("yummy " + food);
    }

    public Squid() {
    }
}
