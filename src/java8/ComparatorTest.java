package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    {
        Person person1 = new Person("Bob", "Smith", 35, "bsmith@gmail.com", "404 555 1212", "123 Oak Avenue");
        Person person2 = new Person("Sarah", "Jones", 45, "sjones@gmail.com", "678 555 1212", "456 Oak Avenue");
        personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
    }

    private static ArrayList<Person> personList;

    public static void main(String[] args) {



        // Sort with Inner Class
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }
        });

        System.out.println("=== Sorted Asc SurName ===");
        for (Person p : personList) {
            p.printName();
        }

        // Use Lambda instead

        // Print Asc
        System.out.println("=== Sorted Asc SurName ===");
        Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

        for (Person p : personList) {
            p.printName();
        }

        // Print Desc
        System.out.println("=== Sorted Desc SurName ===");
        Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));

        for (Person p : personList) {
            p.printName();
        }

    }

    class Person {

        public String givenName;
        private String surName;
        private int age;
        private String eMail;
        private String phone;
        private String address;
        private ArrayList<Person> shortList;

        Person(String givenName, String surName, int age, String eMail, String phone, String address) {
            this.givenName = givenName;
            this.surName = surName;
            this.age = age;
            this.eMail = eMail;
            this.phone = phone;
            this.address = address;
        }

        public String getGivenName() {
            return givenName;
        }

        public void setGivenName(String givenName) {
            this.givenName = givenName;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String geteMail() {
            return eMail;
        }

        public void seteMail(String eMail) {
            this.eMail = eMail;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String printName() {
            return givenName + " " + surName;
        }
    }
}