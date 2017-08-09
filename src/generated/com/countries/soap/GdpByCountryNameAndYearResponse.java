
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gdpByCountryNameAndYearResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gdpByCountryNameAndYearResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gdpByCountryNameAndYearResponse", propOrder = {
    "gdp"
})
public class GdpByCountryNameAndYearResponse {

    protected double gdp;

    /**
     * Gets the value of the gdp property.
     * 
     */
    public double getGdp() {
        return gdp;
    }

    /**
     * Sets the value of the gdp property.
     * 
     */
    public void setGdp(double value) {
        this.gdp = value;
    }

}
