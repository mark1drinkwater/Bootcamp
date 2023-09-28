package igbook1.lesson8.builder;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String code;

    public Person(String givenName, String surName, int age, Gender gender,
                  String email, String phone, String address, String city, String state, String code) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.eMail = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public int getAge() {
        return age;
    }
    public String getNumber() {return phone;}

    public static List<Person> createShortList() {
        ArrayList<Person> persons = new ArrayList<>();
        Person p1 = new Person("Mark", "Drinkwater", 24, Gender.MALE, "email@email.com", "01234555", "23 Stret", "New York", "New York", "123");
        persons.add(p1);
        return persons;
    }
}
