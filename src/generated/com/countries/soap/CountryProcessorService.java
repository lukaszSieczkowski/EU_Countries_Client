package com.countries.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-08-15T21:48:26.808+02:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "CountryProcessorService", 
                  wsdlLocation = "file:/D:/Łukasz/JAVA/MOJE%20PROJEKTY/EU_Countries_Client/src/main/resources/EU_Countries_Client.wsdl",
                  targetNamespace = "http://soap.countries.com/") 
public class CountryProcessorService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.countries.com/", "CountryProcessorService");
    public final static QName CountryProcessorPort = new QName("http://soap.countries.com/", "CountryProcessorPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Łukasz/JAVA/MOJE%20PROJEKTY/EU_Countries_Client/src/main/resources/EU_Countries_Client.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CountryProcessorService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/Łukasz/JAVA/MOJE%20PROJEKTY/EU_Countries_Client/src/main/resources/EU_Countries_Client.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CountryProcessorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CountryProcessorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountryProcessorService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CountryProcessorService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CountryProcessorService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CountryProcessorService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns CountryProcessor
     */
    @WebEndpoint(name = "CountryProcessorPort")
    public CountryProcessor getCountryProcessorPort() {
        return super.getPort(CountryProcessorPort, CountryProcessor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryProcessor
     */
    @WebEndpoint(name = "CountryProcessorPort")
    public CountryProcessor getCountryProcessorPort(WebServiceFeature... features) {
        return super.getPort(CountryProcessorPort, CountryProcessor.class, features);
    }

}
