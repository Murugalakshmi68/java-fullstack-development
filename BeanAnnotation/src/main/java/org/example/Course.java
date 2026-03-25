package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Course {

    private String courseName = "Java Full Stack";

    @Autowired   // inject Student bean automatically
    private Student student;

    public void showCourse() {
        System.out.println("Course: " + courseName);
        student.display();
    }
}