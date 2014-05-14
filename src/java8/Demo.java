package java8;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by rsingh on 4/29/14.
 */

public class Demo {

    public static void main(String[] args) {
        List<AthleteRecord> records = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader("data/OlympicAthletes_0.csv"));
            DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
            String[] line = reader.readNext();
            while ((line = reader.readNext()) != null) {
                AthleteRecord record = new AthleteRecord();
                record.setName(line[0]);
                record.setCountry(line[2]);
                record.setYear(Integer.parseInt(line[3]));
                ZonedDateTime ceremonyDate = (ZonedDateTime) dtf.parse(line[4]);
                record.setGoldMedals(Integer.parseInt(line[6]));
                record.setSilverMedals(Integer.parseInt(line[7]));
                record.setBronzeMedals(Integer.parseInt(line[8]));
                records.add(record);
            }

            for(AthleteRecord record: records) {
                System.out.println(record);
            }

            long count = records.stream().filter( r -> r.getCountry().equalsIgnoreCase("United States")).count();
            System.out.println(count);

            Stream<AthleteRecord> usMedals = records.stream().filter(r -> r.getCountry().equalsIgnoreCase("United States"));
            System.out.println(usMedals.count());

//            int usGold = usMedals.reduce(0, (total, record) -> total + record.getGoldMedals());

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
