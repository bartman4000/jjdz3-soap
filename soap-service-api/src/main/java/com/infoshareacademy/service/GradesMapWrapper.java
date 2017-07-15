package com.infoshareacademy.service;

import java.util.HashMap;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class GradesMapWrapper {

    @XmlElement(name = "avg")
    private HashMap<String, Double> averages = new HashMap<>();

    public HashMap<String, Double> getAverages() {
        return averages;
    }

    public void setAverages(HashMap<String, Double> averages) {
        this.averages = averages;
    }
}
