package com.theironyard;

/**
 * Created by calvinwebster on 9/21/17.
 */
public class Lion extends Animal {

    public String speak() {
        return "Roaaaaaaarrrr!!!";
    }

    public void eat(String food) {
        System.out.println("Yum, im eating " + food);
    }

    public Lion() {
    }
}
