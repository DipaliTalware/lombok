package org.example;

//Step 1: Add the Lombok dependency to your project and configure IntelliJ to support Lombok.
//Step 2: Create a simple class "Student" with the following attributes: id, name, address, grade.
//Step 2.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
//Step 3: Create a Teacher record with the following attributes: id, name, subject.
//Step 4: Create a class Course with the following attributes: id, name, teacher, students.
//Step 4.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity
//Step 5: Write a "Main" class where you apply some examples of creating Students, Teachers, and Courses using the constructors.
//Step 6: In the "Main" class, check if the generated Lombok methods work correctly (getter, setter, toString, ...).

import lombok.Builder;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "John", "JAVA");
        Student student = new Student(2, "Jane", "Berlin", "10th A");
        Course course = new Course(1, "JAVA", teacher, student);

        System.out.println(course);
        System.out.println(student.getAddress());

        Student student2 = Student.builder()
                .id(3)
                .name("Sherlock")
                .address("Hannover")
                .grade("8th c")
                .build();

        Student student3 = Student.builder()
                .id(4)
                .name("Hari")
                .address("Hannover")
                .grade("8th c")
                .build();

        Student student2Update = student2.withName("Sherlock Holmes");
        System.out.println("Original Student 2: " + student2);
        System.out.println("Updated Student 2: " + student2Update);

    }
}