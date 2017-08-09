
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unemploymentByCountryNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unemploymentByCountryNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unemployment" type="{http://soap.countries.com/}unemployment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unemploymentByCountryNameResponse", propOrder = {
    "unemployment"
})
public class UnemploymentByCountryNameResponse {

    protected Unemployment unemployment;

    /**
     * Gets the value of the unemployment property.
     * 
     * @return
     *     possible object is
     *     {@link Unemployment }
     *     
     */
    public Unemployment getUnemployment() {
        return unemployment;
    }

    /**
     * Sets the value of the unemployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unemployment }
     *     
     */
    public void setUnemployment(Unemployment value) {
        this.unemployment = value;
    }

}
