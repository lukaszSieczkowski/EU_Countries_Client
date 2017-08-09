package com.countries.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-08-09T21:23:24.129+02:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://soap.countries.com/", name = "CountryProcessor")
@XmlSeeAlso({ObjectFactory.class})
public interface CountryProcessor {

    @WebMethod
    @RequestWrapper(localName = "getUnemploymentByCountryNameAndYear", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetUnemploymentByCountryNameAndYear")
    @ResponseWrapper(localName = "getUnemploymentByCountryNameAndYearResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetUnemploymentByCountryNameAndYearResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.UnemploymentByCountryNameAndYearResponse getUnemploymentByCountryNameAndYear(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.CountryNameAndYearRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getCountryById", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetCountryById")
    @ResponseWrapper(localName = "getCountryByIdResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetCountryByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.CountryResponse getCountryById(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.CountryCodeRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getGdpByYear", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetGdpByYear")
    @ResponseWrapper(localName = "getGdpByYearResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetGdpByYearResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.GdpByYearResponse getGdpByYear(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.YearRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getGprByCountry", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetGprByCountry")
    @ResponseWrapper(localName = "getGprByCountryResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetGprByCountryResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.GdpByCountryNameResponse getGprByCountry(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.CountryNameRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getCountries", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetCountries")
    @ResponseWrapper(localName = "getCountriesResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetCountriesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.CountriesResponse getCountries(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.CountriesRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getGprByCountryNameAndYear", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetGprByCountryNameAndYear")
    @ResponseWrapper(localName = "getGprByCountryNameAndYearResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetGprByCountryNameAndYearResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.GdpByCountryNameAndYearResponse getGprByCountryNameAndYear(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.CountryNameAndYearRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getCountryDetailsByCountryCode", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetCountryDetailsByCountryCode")
    @ResponseWrapper(localName = "getCountryDetailsByCountryCodeResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetCountryDetailsByCountryCodeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.CountryDetailsResponse getCountryDetailsByCountryCode(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.CountryCodeRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getUnemploymentByCountry", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetUnemploymentByCountry")
    @ResponseWrapper(localName = "getUnemploymentByCountryResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetUnemploymentByCountryResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.UnemploymentByCountryNameResponse getUnemploymentByCountry(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.CountryNameRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getCountryDetailsByCountryName", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetCountryDetailsByCountryName")
    @ResponseWrapper(localName = "getCountryDetailsByCountryNameResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetCountryDetailsByCountryNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.CountryDetailsResponse getCountryDetailsByCountryName(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.CountryNameRequest arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getUnemploymentByYear", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetUnemploymentByYear")
    @ResponseWrapper(localName = "getUnemploymentByYearResponse", targetNamespace = "http://soap.countries.com/", className = "com.countries.soap.GetUnemploymentByYearResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.countries.soap.UnemploymentByYearResponse getUnemploymentByYear(
        @WebParam(name = "arg0", targetNamespace = "")
        com.countries.soap.YearRequest arg0
    );
}
