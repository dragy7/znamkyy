package com.company;

public class Main {

    public static void main(String[] args) {
    Student myStudent = new Student("dragy");
    Teacher myTeacher = new Teacher("Honza");
    Grade grade = new Grade("diktat", "cestina", 7, myTeacher);
    myStudent.addGrade(grade);
    myStudent.showAllGrades();
    }
}
