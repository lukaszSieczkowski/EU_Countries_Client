
package com.countries.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.countries.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCountryById_QNAME = new QName("http://soap.countries.com/", "getCountryById");
    private final static QName _GetGprByCountryResponse_QNAME = new QName("http://soap.countries.com/", "getGprByCountryResponse");
    private final static QName _GetUnemploymentByYearResponse_QNAME = new QName("http://soap.countries.com/", "getUnemploymentByYearResponse");
    private final static QName _GetGprByCountry_QNAME = new QName("http://soap.countries.com/", "getGprByCountry");
    private final static QName _GetUnemploymentByCountryNameAndYearResponse_QNAME = new QName("http://soap.countries.com/", "getUnemploymentByCountryNameAndYearResponse");
    private final static QName _GetCountries_QNAME = new QName("http://soap.countries.com/", "getCountries");
    private final static QName _GetCountryDetailsByCountryCodeResponse_QNAME = new QName("http://soap.countries.com/", "getCountryDetailsByCountryCodeResponse");
    private final static QName _GetGprByCountryNameAndYearResponse_QNAME = new QName("http://soap.countries.com/", "getGprByCountryNameAndYearResponse");
    private final static QName _GetUnemploymentByCountry_QNAME = new QName("http://soap.countries.com/", "getUnemploymentByCountry");
    private final static QName _GetCountriesResponse_QNAME = new QName("http://soap.countries.com/", "getCountriesResponse");
    private final static QName _GetCountryByIdResponse_QNAME = new QName("http://soap.countries.com/", "getCountryByIdResponse");
    private final static QName _GetUnemploymentByYear_QNAME = new QName("http://soap.countries.com/", "getUnemploymentByYear");
    private final static QName _GetUnemploymentByCountryResponse_QNAME = new QName("http://soap.countries.com/", "getUnemploymentByCountryResponse");
    private final static QName _GetUnemploymentByCountryNameAndYear_QNAME = new QName("http://soap.countries.com/", "getUnemploymentByCountryNameAndYear");
    private final static QName _GetGdpByYear_QNAME = new QName("http://soap.countries.com/", "getGdpByYear");
    private final static QName _GetGdpByYearResponse_QNAME = new QName("http://soap.countries.com/", "getGdpByYearResponse");
    private final static QName _GetGprByCountryNameAndYear_QNAME = new QName("http://soap.countries.com/", "getGprByCountryNameAndYear");
    private final static QName _GetCountryDetailsByCountryCode_QNAME = new QName("http://soap.countries.com/", "getCountryDetailsByCountryCode");
    private final static QName _GetCountryDetailsByCountryName_QNAME = new QName("http://soap.countries.com/", "getCountryDetailsByCountryName");
    private final static QName _GetCountryDetailsByCountryNameResponse_QNAME = new QName("http://soap.countries.com/", "getCountryDetailsByCountryNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.countries.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCountryDetailsByCountryCode }
     * 
     */
    public GetCountryDetailsByCountryCode createGetCountryDetailsByCountryCode() {
        return new GetCountryDetailsByCountryCode();
    }

    /**
     * Create an instance of {@link GetGprByCountryNameAndYear }
     * 
     */
    public GetGprByCountryNameAndYear createGetGprByCountryNameAndYear() {
        return new GetGprByCountryNameAndYear();
    }

    /**
     * Create an instance of {@link GetCountryDetailsByCountryNameResponse }
     * 
     */
    public GetCountryDetailsByCountryNameResponse createGetCountryDetailsByCountryNameResponse() {
        return new GetCountryDetailsByCountryNameResponse();
    }

    /**
     * Create an instance of {@link GetCountryDetailsByCountryName }
     * 
     */
    public GetCountryDetailsByCountryName createGetCountryDetailsByCountryName() {
        return new GetCountryDetailsByCountryName();
    }

    /**
     * Create an instance of {@link GetGdpByYear }
     * 
     */
    public GetGdpByYear createGetGdpByYear() {
        return new GetGdpByYear();
    }

    /**
     * Create an instance of {@link GetUnemploymentByCountryNameAndYear }
     * 
     */
    public GetUnemploymentByCountryNameAndYear createGetUnemploymentByCountryNameAndYear() {
        return new GetUnemploymentByCountryNameAndYear();
    }

    /**
     * Create an instance of {@link GetGdpByYearResponse }
     * 
     */
    public GetGdpByYearResponse createGetGdpByYearResponse() {
        return new GetGdpByYearResponse();
    }

    /**
     * Create an instance of {@link GetUnemploymentByCountry }
     * 
     */
    public GetUnemploymentByCountry createGetUnemploymentByCountry() {
        return new GetUnemploymentByCountry();
    }

    /**
     * Create an instance of {@link GetGprByCountryNameAndYearResponse }
     * 
     */
    public GetGprByCountryNameAndYearResponse createGetGprByCountryNameAndYearResponse() {
        return new GetGprByCountryNameAndYearResponse();
    }

    /**
     * Create an instance of {@link GetCountries }
     * 
     */
    public GetCountries createGetCountries() {
        return new GetCountries();
    }

    /**
     * Create an instance of {@link GetCountryDetailsByCountryCodeResponse }
     * 
     */
    public GetCountryDetailsByCountryCodeResponse createGetCountryDetailsByCountryCodeResponse() {
        return new GetCountryDetailsByCountryCodeResponse();
    }

    /**
     * Create an instance of {@link GetUnemploymentByCountryResponse }
     * 
     */
    public GetUnemploymentByCountryResponse createGetUnemploymentByCountryResponse() {
        return new GetUnemploymentByCountryResponse();
    }

    /**
     * Create an instance of {@link GetCountriesResponse }
     * 
     */
    public GetCountriesResponse createGetCountriesResponse() {
        return new GetCountriesResponse();
    }

    /**
     * Create an instance of {@link GetCountryByIdResponse }
     * 
     */
    public GetCountryByIdResponse createGetCountryByIdResponse() {
        return new GetCountryByIdResponse();
    }

    /**
     * Create an instance of {@link GetUnemploymentByYear }
     * 
     */
    public GetUnemploymentByYear createGetUnemploymentByYear() {
        return new GetUnemploymentByYear();
    }

    /**
     * Create an instance of {@link GetGprByCountryResponse }
     * 
     */
    public GetGprByCountryResponse createGetGprByCountryResponse() {
        return new GetGprByCountryResponse();
    }

    /**
     * Create an instance of {@link GetCountryById }
     * 
     */
    public GetCountryById createGetCountryById() {
        return new GetCountryById();
    }

    /**
     * Create an instance of {@link GetUnemploymentByCountryNameAndYearResponse }
     * 
     */
    public GetUnemploymentByCountryNameAndYearResponse createGetUnemploymentByCountryNameAndYearResponse() {
        return new GetUnemploymentByCountryNameAndYearResponse();
    }

    /**
     * Create an instance of {@link GetGprByCountry }
     * 
     */
    public GetGprByCountry createGetGprByCountry() {
        return new GetGprByCountry();
    }

    /**
     * Create an instance of {@link GetUnemploymentByYearResponse }
     * 
     */
    public GetUnemploymentByYearResponse createGetUnemploymentByYearResponse() {
        return new GetUnemploymentByYearResponse();
    }

    /**
     * Create an instance of {@link CountriesResponse }
     * 
     */
    public CountriesResponse createCountriesResponse() {
        return new CountriesResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link CountryNameAndYearRequest }
     * 
     */
    public CountryNameAndYearRequest createCountryNameAndYearRequest() {
        return new CountryNameAndYearRequest();
    }

    /**
     * Create an instance of {@link CountryDetails }
     * 
     */
    public CountryDetails createCountryDetails() {
        return new CountryDetails();
    }

    /**
     * Create an instance of {@link GdpByCountryNameResponse }
     * 
     */
    public GdpByCountryNameResponse createGdpByCountryNameResponse() {
        return new GdpByCountryNameResponse();
    }

    /**
     * Create an instance of {@link CountryResponse }
     * 
     */
    public CountryResponse createCountryResponse() {
        return new CountryResponse();
    }

    /**
     * Create an instance of {@link UnemploymentByCountryNameAndYearResponse }
     * 
     */
    public UnemploymentByCountryNameAndYearResponse createUnemploymentByCountryNameAndYearResponse() {
        return new UnemploymentByCountryNameAndYearResponse();
    }

    /**
     * Create an instance of {@link GrosDomesticProduct }
     * 
     */
    public GrosDomesticProduct createGrosDomesticProduct() {
        return new GrosDomesticProduct();
    }

    /**
     * Create an instance of {@link CountryNameAndYear }
     * 
     */
    public CountryNameAndYear createCountryNameAndYear() {
        return new CountryNameAndYear();
    }

    /**
     * Create an instance of {@link CountryNameRequest }
     * 
     */
    public CountryNameRequest createCountryNameRequest() {
        return new CountryNameRequest();
    }

    /**
     * Create an instance of {@link CountryDetailsResponse }
     * 
     */
    public CountryDetailsResponse createCountryDetailsResponse() {
        return new CountryDetailsResponse();
    }

    /**
     * Create an instance of {@link UnemploymentByCountryNameResponse }
     * 
     */
    public UnemploymentByCountryNameResponse createUnemploymentByCountryNameResponse() {
        return new UnemploymentByCountryNameResponse();
    }

    /**
     * Create an instance of {@link YearRequest }
     * 
     */
    public YearRequest createYearRequest() {
        return new YearRequest();
    }

    /**
     * Create an instance of {@link GdpByYearResponse }
     * 
     */
    public GdpByYearResponse createGdpByYearResponse() {
        return new GdpByYearResponse();
    }

    /**
     * Create an instance of {@link CountriesRequest }
     * 
     */
    public CountriesRequest createCountriesRequest() {
        return new CountriesRequest();
    }

    /**
     * Create an instance of {@link GdpByCountryNameAndYearResponse }
     * 
     */
    public GdpByCountryNameAndYearResponse createGdpByCountryNameAndYearResponse() {
        return new GdpByCountryNameAndYearResponse();
    }

    /**
     * Create an instance of {@link CountryCodeRequest }
     * 
     */
    public CountryCodeRequest createCountryCodeRequest() {
        return new CountryCodeRequest();
    }

    /**
     * Create an instance of {@link Unemployment }
     * 
     */
    public Unemployment createUnemployment() {
        return new Unemployment();
    }

    /**
     * Create an instance of {@link UnemploymentByYearResponse }
     * 
     */
    public UnemploymentByYearResponse createUnemploymentByYearResponse() {
        return new UnemploymentByYearResponse();
    }

    /**
     * Create an instance of {@link CountryNameAndUnemployment }
     * 
     */
    public CountryNameAndUnemployment createCountryNameAndUnemployment() {
        return new CountryNameAndUnemployment();
    }

    /**
     * Create an instance of {@link CountryNameAndGdp }
     * 
     */
    public CountryNameAndGdp createCountryNameAndGdp() {
        return new CountryNameAndGdp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getCountryById")
    public JAXBElement<GetCountryById> createGetCountryById(GetCountryById value) {
        return new JAXBElement<GetCountryById>(_GetCountryById_QNAME, GetCountryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGprByCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getGprByCountryResponse")
    public JAXBElement<GetGprByCountryResponse> createGetGprByCountryResponse(GetGprByCountryResponse value) {
        return new JAXBElement<GetGprByCountryResponse>(_GetGprByCountryResponse_QNAME, GetGprByCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnemploymentByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getUnemploymentByYearResponse")
    public JAXBElement<GetUnemploymentByYearResponse> createGetUnemploymentByYearResponse(GetUnemploymentByYearResponse value) {
        return new JAXBElement<GetUnemploymentByYearResponse>(_GetUnemploymentByYearResponse_QNAME, GetUnemploymentByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGprByCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getGprByCountry")
    public JAXBElement<GetGprByCountry> createGetGprByCountry(GetGprByCountry value) {
        return new JAXBElement<GetGprByCountry>(_GetGprByCountry_QNAME, GetGprByCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnemploymentByCountryNameAndYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getUnemploymentByCountryNameAndYearResponse")
    public JAXBElement<GetUnemploymentByCountryNameAndYearResponse> createGetUnemploymentByCountryNameAndYearResponse(GetUnemploymentByCountryNameAndYearResponse value) {
        return new JAXBElement<GetUnemploymentByCountryNameAndYearResponse>(_GetUnemploymentByCountryNameAndYearResponse_QNAME, GetUnemploymentByCountryNameAndYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getCountries")
    public JAXBElement<GetCountries> createGetCountries(GetCountries value) {
        return new JAXBElement<GetCountries>(_GetCountries_QNAME, GetCountries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountryDetailsByCountryCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getCountryDetailsByCountryCodeResponse")
    public JAXBElement<GetCountryDetailsByCountryCodeResponse> createGetCountryDetailsByCountryCodeResponse(GetCountryDetailsByCountryCodeResponse value) {
        return new JAXBElement<GetCountryDetailsByCountryCodeResponse>(_GetCountryDetailsByCountryCodeResponse_QNAME, GetCountryDetailsByCountryCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGprByCountryNameAndYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getGprByCountryNameAndYearResponse")
    public JAXBElement<GetGprByCountryNameAndYearResponse> createGetGprByCountryNameAndYearResponse(GetGprByCountryNameAndYearResponse value) {
        return new JAXBElement<GetGprByCountryNameAndYearResponse>(_GetGprByCountryNameAndYearResponse_QNAME, GetGprByCountryNameAndYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnemploymentByCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getUnemploymentByCountry")
    public JAXBElement<GetUnemploymentByCountry> createGetUnemploymentByCountry(GetUnemploymentByCountry value) {
        return new JAXBElement<GetUnemploymentByCountry>(_GetUnemploymentByCountry_QNAME, GetUnemploymentByCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getCountriesResponse")
    public JAXBElement<GetCountriesResponse> createGetCountriesResponse(GetCountriesResponse value) {
        return new JAXBElement<GetCountriesResponse>(_GetCountriesResponse_QNAME, GetCountriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getCountryByIdResponse")
    public JAXBElement<GetCountryByIdResponse> createGetCountryByIdResponse(GetCountryByIdResponse value) {
        return new JAXBElement<GetCountryByIdResponse>(_GetCountryByIdResponse_QNAME, GetCountryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnemploymentByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getUnemploymentByYear")
    public JAXBElement<GetUnemploymentByYear> createGetUnemploymentByYear(GetUnemploymentByYear value) {
        return new JAXBElement<GetUnemploymentByYear>(_GetUnemploymentByYear_QNAME, GetUnemploymentByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnemploymentByCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getUnemploymentByCountryResponse")
    public JAXBElement<GetUnemploymentByCountryResponse> createGetUnemploymentByCountryResponse(GetUnemploymentByCountryResponse value) {
        return new JAXBElement<GetUnemploymentByCountryResponse>(_GetUnemploymentByCountryResponse_QNAME, GetUnemploymentByCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnemploymentByCountryNameAndYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getUnemploymentByCountryNameAndYear")
    public JAXBElement<GetUnemploymentByCountryNameAndYear> createGetUnemploymentByCountryNameAndYear(GetUnemploymentByCountryNameAndYear value) {
        return new JAXBElement<GetUnemploymentByCountryNameAndYear>(_GetUnemploymentByCountryNameAndYear_QNAME, GetUnemploymentByCountryNameAndYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGdpByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getGdpByYear")
    public JAXBElement<GetGdpByYear> createGetGdpByYear(GetGdpByYear value) {
        return new JAXBElement<GetGdpByYear>(_GetGdpByYear_QNAME, GetGdpByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGdpByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getGdpByYearResponse")
    public JAXBElement<GetGdpByYearResponse> createGetGdpByYearResponse(GetGdpByYearResponse value) {
        return new JAXBElement<GetGdpByYearResponse>(_GetGdpByYearResponse_QNAME, GetGdpByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGprByCountryNameAndYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getGprByCountryNameAndYear")
    public JAXBElement<GetGprByCountryNameAndYear> createGetGprByCountryNameAndYear(GetGprByCountryNameAndYear value) {
        return new JAXBElement<GetGprByCountryNameAndYear>(_GetGprByCountryNameAndYear_QNAME, GetGprByCountryNameAndYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountryDetailsByCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getCountryDetailsByCountryCode")
    public JAXBElement<GetCountryDetailsByCountryCode> createGetCountryDetailsByCountryCode(GetCountryDetailsByCountryCode value) {
        return new JAXBElement<GetCountryDetailsByCountryCode>(_GetCountryDetailsByCountryCode_QNAME, GetCountryDetailsByCountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountryDetailsByCountryName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getCountryDetailsByCountryName")
    public JAXBElement<GetCountryDetailsByCountryName> createGetCountryDetailsByCountryName(GetCountryDetailsByCountryName value) {
        return new JAXBElement<GetCountryDetailsByCountryName>(_GetCountryDetailsByCountryName_QNAME, GetCountryDetailsByCountryName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountryDetailsByCountryNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.countries.com/", name = "getCountryDetailsByCountryNameResponse")
    public JAXBElement<GetCountryDetailsByCountryNameResponse> createGetCountryDetailsByCountryNameResponse(GetCountryDetailsByCountryNameResponse value) {
        return new JAXBElement<GetCountryDetailsByCountryNameResponse>(_GetCountryDetailsByCountryNameResponse_QNAME, GetCountryDetailsByCountryNameResponse.class, null, value);
    }

}
