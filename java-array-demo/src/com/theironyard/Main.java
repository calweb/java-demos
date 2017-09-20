package com.theironyard;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String[] fileContents = getFileContents("funnyJokes.txt");
        System.out.println(fileContents[fileContents.length - 1]);
        for ( String line : fileContents ) {
            System.out.println(line);
        }

    }
    public static String[] getFileContents (String fileName) {
        File file = new File (fileName);
        try {
            Scanner fileScanner = new Scanner(file);
            List<String> fileContents = new ArrayList<>();
            while (fileScanner.hasNext()) {
                fileContents.add(fileScanner.nextLine());
            }
            return fileContents.toArray(new String[0]); //Converts the list to an array
        } //Since this time we are asking for data back from the file
        //We have to specify what to do if it isn't found
        catch (FileNotFoundException ex) {
            System.out.println("Could not find file *" + fileName + "*");
            ex.printStackTrace();
            return null;
        }
    }
}
