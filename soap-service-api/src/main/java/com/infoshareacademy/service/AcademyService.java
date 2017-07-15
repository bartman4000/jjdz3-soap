package com.infoshareacademy.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface AcademyService {

    @WebMethod
    String toUpperCase(@WebParam(name = "value") String value);

    @WebMethod
    int greatestCommonDivider(@WebParam(name = "a") int a,
        @WebParam(name = "b") int b);

    @WebMethod
    Student getStudent();
}
