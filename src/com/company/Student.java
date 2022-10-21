package com.company;

import java.util.ArrayList;

public class Student {
    public String name;


    ArrayList<Grade> grades = new ArrayList<>();


    public void addGrade(Grade grade){
        grades.add(grade);
    }

    public void showAllGrades(){
        System.out.println(grades);
    }


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
