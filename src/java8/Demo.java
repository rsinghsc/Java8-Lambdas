package java8;

import au.com.bytecode.opencsv.CSVReader;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by rsingh on 4/29/14.
 */
public class Demo {

    public static void main(String[] args) {
        //Load up the record
        try {
            CSVReader reader = new CSVReader(new FileReader("data/OlympicAthletes_0.csv"));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                // nextLine[] is an array of values from the line
                System.out.println(nextLine[0] + nextLine[1] + "etc...");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("unable to find datafile");
        } catch (IOException ioException) {
            System.out.println("caught io exception");
        }
    }

}
