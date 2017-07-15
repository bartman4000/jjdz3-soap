package com.infoshareacademy.server.com.infoshareacademy.server;

import com.infoshareacademy.service.AcademyService;
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
}
