package com.company;

public class Grade {
    public String name;
    public String subject;
    public int value;
    public Teacher teacher;

    public Grade(String name, String subject, int value, Teacher teacher) {
        this.name = name;
        this.subject = subject;
        this.value = value;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", value=" + value +
                teacher +
                '}';
    }
}
