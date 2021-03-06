
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gdpByCountryNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gdpByCountryNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdp" type="{http://soap.countries.com/}grosDomesticProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gdpByCountryNameResponse", propOrder = {
    "gdp"
})
public class GdpByCountryNameResponse {

    protected GrosDomesticProduct gdp;

    /**
     * Gets the value of the gdp property.
     * 
     * @return
     *     possible object is
     *     {@link GrosDomesticProduct }
     *     
     */
    public GrosDomesticProduct getGdp() {
        return gdp;
    }

    /**
     * Sets the value of the gdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrosDomesticProduct }
     *     
     */
    public void setGdp(GrosDomesticProduct value) {
        this.gdp = value;
    }

}
