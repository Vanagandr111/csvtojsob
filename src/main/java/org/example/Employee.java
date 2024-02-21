package org.example;

import java.io.Serializable;

public class Employee implements Serializable {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;


    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }
}
