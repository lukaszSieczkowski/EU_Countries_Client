
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unemploymentByCountryNameAndYearResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unemploymentByCountryNameAndYearResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unemployment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unemploymentByCountryNameAndYearResponse", propOrder = {
    "unemployment"
})
public class UnemploymentByCountryNameAndYearResponse {

    protected double unemployment;

    /**
     * Gets the value of the unemployment property.
     * 
     */
    public double getUnemployment() {
        return unemployment;
    }

    /**
     * Sets the value of the unemployment property.
     * 
     */
    public void setUnemployment(double value) {
        this.unemployment = value;
    }

}
