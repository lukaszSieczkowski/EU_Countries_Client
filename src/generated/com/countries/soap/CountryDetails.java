
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countryDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="population" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gros_domestic_product" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="gros_domestic_product_per_person" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryDetails", propOrder = {
    "area",
    "population",
    "capital",
    "currency",
    "grosDomesticProduct",
    "grosDomesticProductPerPerson"
})
public class CountryDetails {

    protected long area;
    protected long population;
    protected String capital;
    protected String currency;
    @XmlElement(name = "gros_domestic_product")
    protected long grosDomesticProduct;
    @XmlElement(name = "gros_domestic_product_per_person")
    protected long grosDomesticProductPerPerson;

    /**
     * Gets the value of the area property.
     * 
     */
    public long getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     */
    public void setArea(long value) {
        this.area = value;
    }

    /**
     * Gets the value of the population property.
     * 
     */
    public long getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     * 
     */
    public void setPopulation(long value) {
        this.population = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the grosDomesticProduct property.
     * 
     */
    public long getGrosDomesticProduct() {
        return grosDomesticProduct;
    }

    /**
     * Sets the value of the grosDomesticProduct property.
     * 
     */
    public void setGrosDomesticProduct(long value) {
        this.grosDomesticProduct = value;
    }

    /**
     * Gets the value of the grosDomesticProductPerPerson property.
     * 
     */
    public long getGrosDomesticProductPerPerson() {
        return grosDomesticProductPerPerson;
    }

    /**
     * Sets the value of the grosDomesticProductPerPerson property.
     * 
     */
    public void setGrosDomesticProductPerPerson(long value) {
        this.grosDomesticProductPerPerson = value;
    }

}
