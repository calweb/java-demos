package com.theironyard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Surfboard myBoard = new Surfboard("Calvin Board", 6.5, "Shortboard", 3, "Trifin", "squash");
        System.out.println(myBoard.ride());

        List<String> names = new ArrayList<>();

        names.add("Heather");
        System.out.println(names);
        Animal mufasa = new Lion();

        Animal squidoo = new Squid();

        squidoo.eat("crabs");

        mufasa.speak();
        mufasa.eat("antelope");
    }


}
