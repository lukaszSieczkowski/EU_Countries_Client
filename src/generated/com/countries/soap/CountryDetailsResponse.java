
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countryDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country_details" type="{http://soap.countries.com/}countryDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryDetailsResponse", propOrder = {
    "countryDetails"
})
public class CountryDetailsResponse {

    @XmlElement(name = "country_details")
    protected CountryDetails countryDetails;

    /**
     * Gets the value of the countryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CountryDetails }
     *     
     */
    public CountryDetails getCountryDetails() {
        return countryDetails;
    }

    /**
     * Sets the value of the countryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDetails }
     *     
     */
    public void setCountryDetails(CountryDetails value) {
        this.countryDetails = value;
    }

}
