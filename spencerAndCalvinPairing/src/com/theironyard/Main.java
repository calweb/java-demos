package com.theironyard;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Smartphone phone1 = new Smartphone(28.5);

        Smartphone phone2 = new Smartphone(5.23);

        Smartphone phone3 = new Smartphone(6);

        List<Smartphone> phones = new ArrayList<>();

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);

        for (Smartphone phone: phones) {

            System.out.println(phone.getSize());

        }

        Collections.sort(phones);

        for (Smartphone phone: phones) {

            System.out.println(phone.getSize());
        }

    }
}
