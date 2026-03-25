package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // Load Spring container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get bean from container
        Student student = (Student) context.getBean("studentBean");

        // Call method
        student.display();
    }
}