package com.theironyard;

/**
 * Created by calvinwebster on 9/20/17.
 */
public class InYourFaceWithInterFace implements SampleInterface {

    public String doSomething(String whatever) {
        System.out.println("this is do something in the in your face with interface.");
        return whatever;
    }
}
