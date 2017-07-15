package com.infoshareacademy.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class GradesListWrapper {

    @XmlElement(name = "grade")
    private List<Integer> grades = new ArrayList<>();

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public GradesListWrapper() {
    }

    public GradesListWrapper(List<Integer> grades) {
        this.grades = grades;
    }
}
