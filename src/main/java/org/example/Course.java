package org.example;


import lombok.*;
@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@With
public class Course {
    int id;
    String name;
    Teacher teacher;
    Student student;

}
