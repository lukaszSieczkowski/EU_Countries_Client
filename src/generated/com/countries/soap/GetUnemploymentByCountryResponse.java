
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUnemploymentByCountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUnemploymentByCountryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://soap.countries.com/}unemploymentByCountryNameResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUnemploymentByCountryResponse", propOrder = {
    "_return"
})
public class GetUnemploymentByCountryResponse {

    @XmlElement(name = "return")
    protected UnemploymentByCountryNameResponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UnemploymentByCountryNameResponse }
     *     
     */
    public UnemploymentByCountryNameResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnemploymentByCountryNameResponse }
     *     
     */
    public void setReturn(UnemploymentByCountryNameResponse value) {
        this._return = value;
    }

}
