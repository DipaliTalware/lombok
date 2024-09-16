package org.example;

public class UniversityService {
    public int calculateGrades(Course course) {
        return course.getGrades();
    }

    public int CalculateAvgUniversityGrades(University uni){
        return uni.avgGrades();
    }

}
