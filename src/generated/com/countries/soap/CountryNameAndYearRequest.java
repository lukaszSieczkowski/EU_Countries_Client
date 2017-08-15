
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryNameAndYearRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countryNameAndYearRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country_name_and_year" type="{http://soap.countries.com/}countryNameAndYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryNameAndYearRequest", propOrder = {
    "countryNameAndYear"
})
public class CountryNameAndYearRequest {

    @XmlElement(name = "country_name_and_year")
    protected CountryNameAndYear countryNameAndYear;

    public CountryNameAndYearRequest() {
		super();
	}

	public CountryNameAndYearRequest(CountryNameAndYear countryNameAndYear) {
		this.countryNameAndYear = countryNameAndYear;
	}

	/**
     * Gets the value of the countryNameAndYear property.
     * 
     * @return
     *     possible object is
     *     {@link CountryNameAndYear }
     *     
     */
    public CountryNameAndYear getCountryNameAndYear() {
        return countryNameAndYear;
    }

    /**
     * Sets the value of the countryNameAndYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNameAndYear }
     *     
     */
    public void setCountryNameAndYear(CountryNameAndYear value) {
        this.countryNameAndYear = value;
    }

}
