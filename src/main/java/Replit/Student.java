package Replit;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Student {

   private String id;

   private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    private float averageGrade;

   private List<Course> enrolledCourses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.averageGrade = 0f;
    }

    public boolean enrroll(Course course) {
        if (enrolledCourses == null) {
            enrolledCourses = new ArrayList<Course>();
        }
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "'id': "+id +", 'name':"+name+", 'averageGrade': "+ averageGrade
                + ",:'total enrolled courses': "+enrolledCourses.size();
    }

}