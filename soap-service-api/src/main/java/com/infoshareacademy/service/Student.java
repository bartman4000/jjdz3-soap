package com.infoshareacademy.service;

public class Student {

    private String name;

    private String lastName;

    private GradesListWrapper grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GradesListWrapper getGrades() {
        return grades;
    }

    public void setGrades(GradesListWrapper grades) {
        this.grades = grades;
    }
}
