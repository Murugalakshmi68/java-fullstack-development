package org.example;

public class Student {

    private int id;
    private String name;

    // Default constructor
    public Student() {
        System.out.println("Student object created");
    }

    // Setter methods (for dependency injection)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to display data
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}