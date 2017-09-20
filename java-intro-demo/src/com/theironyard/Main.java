package com.theironyard;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your name?");

        String name = scanner.nextLine();

        System.out.println("How old are you?");
        String age = scanner.nextLine();
        System.out.println(age);

        String greeting = greetMe(name);

        System.out.println(greeting);


    }

    public static String greetMe( String name) {
        return "hello " + name + "!!";
    }
}
