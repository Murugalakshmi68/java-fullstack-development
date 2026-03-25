package org.example;

import org.springframework.stereotype.Component;

@Component   // marks this class as a Spring Bean
public class Student {

    private int id = 101;
    private String name = "Murugalakshmi";

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}