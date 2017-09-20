package com.theironyard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String header = HTMLText.HEADER;
        String listItem = HTMLText.OPEN_UL + HTMLText.LIST_ITEM + HTMLText.CLOSING_UL;
        String footer = HTMLText.FOOTER;



        String[] people = { "Chris", "Chad", "Stephen", "Josh", "Patrick", "Phil"};

        String html = HTMLText.OPEN_UL + addTextToHTML(HTMLText.LIST_ITEM, people) + HTMLText.CLOSING_UL;

        System.out.println(html);

        try {
            File htmlFile = new File("coolPeople.html");
            FileWriter newFile = new FileWriter(htmlFile);

            newFile.write(html);
            newFile.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

    public static String addTextToHTML (String template, String[] people) {

        String html = "";

        for(String person : people) {
            html += template.replace("{{name}}", person);
        }
        return html;
    }
}
