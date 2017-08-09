
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUnemploymentByCountryNameAndYearResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUnemploymentByCountryNameAndYearResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://soap.countries.com/}unemploymentByCountryNameAndYearResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUnemploymentByCountryNameAndYearResponse", propOrder = {
    "_return"
})
public class GetUnemploymentByCountryNameAndYearResponse {

    @XmlElement(name = "return")
    protected UnemploymentByCountryNameAndYearResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UnemploymentByCountryNameAndYearResponse }
     *     
     */
    public UnemploymentByCountryNameAndYearResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnemploymentByCountryNameAndYearResponse }
     *     
     */
    public void setReturn(UnemploymentByCountryNameAndYearResponse value) {
        this._return = value;
    }

}
