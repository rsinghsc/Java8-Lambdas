package java8;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

import au.com.bytecode.opencsv.CSVReader;
/**
 * Created by rsingh on 4/29/14.
 */
public class Demo {

    public static void main(String[] args) {
        List<AthleteRecord> records = new ArrayList<AthleteRecord>();
        //Load up the record
        //Athlete,Age,Country,Year,Closing Ceremony Date,Sport,Gold Medals,Silver Medals,Bronze Medals,Total Medals
        try {
            CSVReader reader = new CSVReader(new FileReader("data/OlympicAthletes_0.csv"));
            String[] line = reader.readNext();
            while ((line = reader.readNext()) != null) {
                AthleteRecord record = new AthleteRecord();
                record.setName(line[0]);
                record.setCountry(line[2]);
                record.setGoldMedals(Integer.parseInt(line[6]));
                record.setSilverMedals(Integer.parseInt(line[7]));
                record.setBronzeMedals(Integer.parseInt(line[8]));
                records.add(record);
//                System.out.println(nextLine[0] + nextLine[1] + "etc...");
            }

            for(AthleteRecord record: records) {
                System.out.println(record);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("caught number format exception");
            nfe.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            System.out.println("unable to find datafile");
        } catch (IOException ioException) {
            System.out.println("caught io exception");
        }
    }

}
