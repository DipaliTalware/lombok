package org.example;


import lombok.*;

@Value
public class Course {
    int id;
    String name;
    Teacher teacher;
    Student student;
    int grades;
}
