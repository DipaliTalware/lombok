package org.example;

import lombok.*;
@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@With
public class Student {
    private int id;
    private String name;
    private String address;
    private String grade;

}
