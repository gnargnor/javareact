package com.javareact.javareact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Created by gnargnor on 7/14/17.
 */
/** @Data is Lombok annotation - generates boilerplate code like getters and setters */
@Data
@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    private Employee() {}

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
