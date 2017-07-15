package com.infoshareacademy.server.com.infoshareacademy.server;

import com.infoshareacademy.service.*;

import javax.jws.WebService;
import java.util.Arrays;
import java.util.HashMap;

@WebService(endpointInterface = "com.infoshareacademy.service.AcademyService")
public class AcademyServiceImpl implements AcademyService {

    @Override
    public String toUpperCase(String value) {
        if (value != null) {
            return value.toUpperCase();
        }

        return "";
    }

    @Override
    public int greatestCommonDivider(int a, int b) {
        if (b == 0) {
            return a;
        }

        return greatestCommonDivider(b, a % b);
    }

    @Override
    public Student getStudent() {

        final Student s = new Student();
        s.setName("Jan");
        s.setLastName("Kowalski");
        s.setGrades(
            new GradesListWrapper(
                Arrays.asList(1, 2, 3, 3, 2)));

        return s;
    }

    private Double Averages(GradesListWrapper w)
    {
        Double sum = w.getGrades().stream().mapToDouble(Integer::doubleValue).sum();

        return sum / w.getGrades().size();
    }

    @Override
    public GradesMapWrapper getAverageGrades(StudentsListWrapper students) {

        GradesMapWrapper avgs = new GradesMapWrapper();

        HashMap<String,Double> hashMap = new HashMap<>();

        for(Student s : students.getStudents())
        {
            hashMap.put(s.getLastName(), this.Averages(s.getGrades()));
        }

        avgs.setAverages(hashMap);

        return avgs;

    }
}
