package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   // replaces XML
public class AppConfig {

    @Bean   // defines a bean
    public Student student() {
        return new Student(101, "Murugalakshmi");
    }
}