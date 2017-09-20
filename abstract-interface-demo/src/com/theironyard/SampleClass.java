package com.theironyard;

/**
 * Created by calvinwebster on 9/20/17.
 */
public class SampleClass implements SampleInterface {

    private int aNumber;

    public String doSomething(String name) {
        System.out.println("this is doing something");
        return "hey " + name;
    }
 }
