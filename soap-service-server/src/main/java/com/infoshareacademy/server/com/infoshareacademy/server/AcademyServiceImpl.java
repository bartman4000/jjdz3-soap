package com.infoshareacademy.server.com.infoshareacademy.server;

import com.infoshareacademy.service.AcademyService;
import com.infoshareacademy.service.GradesListWrapper;
import com.infoshareacademy.service.Student;
import java.util.Arrays;
import javax.jws.WebService;

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
}
