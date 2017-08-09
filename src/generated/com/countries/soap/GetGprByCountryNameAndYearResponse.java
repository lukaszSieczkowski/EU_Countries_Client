
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGprByCountryNameAndYearResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGprByCountryNameAndYearResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://soap.countries.com/}gdpByCountryNameAndYearResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGprByCountryNameAndYearResponse", propOrder = {
    "_return"
})
public class GetGprByCountryNameAndYearResponse {

    @XmlElement(name = "return")
    protected GdpByCountryNameAndYearResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GdpByCountryNameAndYearResponse }
     *     
     */
    public GdpByCountryNameAndYearResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GdpByCountryNameAndYearResponse }
     *     
     */
    public void setReturn(GdpByCountryNameAndYearResponse value) {
        this._return = value;
    }

}
