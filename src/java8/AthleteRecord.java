package java8;

import java.time.LocalDate;
import java.util.StringJoiner;

/**
 * Created by rsingh on 5/12/14.
 */
public class AthleteRecord {
    //Athlete,Age,Country,Year,Closing Ceremony Date,Sport,Gold Medals,Silver Medals,Bronze Medals,Total Medals
    private String name;
    private Integer age;
    private String country;
    private Integer year;
    private LocalDate closingCeremony;
    private String sport;
    private Integer goldMedals;
    private Integer silverMedals;
    private Integer bronzeMedals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public LocalDate getClosingCeremony() {
        return closingCeremony;
    }

    public void setClosingCeremony(LocalDate closingCeremony) {
        this.closingCeremony = closingCeremony;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Integer getGoldMedals() {
        return goldMedals;
    }

    public void setGoldMedals(int goldMedals) {
        this.goldMedals = goldMedals;
    }

    public Integer getSilverMedals() {
        return silverMedals;
    }

    public void setSilverMedals(int silverMedals) {
        this.silverMedals = silverMedals;
    }

    public Integer getBronzeMedals() {
        return bronzeMedals;
    }

    public void setBronzeMedals(int bronzeMedals) {
        this.bronzeMedals = bronzeMedals;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(name);
        joiner.add(country);
        joiner.add(year.toString());
        joiner.add(goldMedals.toString());
        joiner.add(silverMedals.toString());
        joiner.add(bronzeMedals.toString());
        return joiner.toString();
    }



}
