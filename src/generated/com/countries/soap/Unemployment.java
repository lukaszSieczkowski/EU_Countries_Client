
package com.countries.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unemployment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unemployment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unemployment_2003" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2004" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2005" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2006" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2007" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2008" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2009" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2010" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2011" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unemployment_2012" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unemployment", propOrder = {
    "unemployment2003",
    "unemployment2004",
    "unemployment2005",
    "unemployment2006",
    "unemployment2007",
    "unemployment2008",
    "unemployment2009",
    "unemployment2010",
    "unemployment2011",
    "unemployment2012"
})
public class Unemployment {

    @XmlElement(name = "unemployment_2003")
    protected double unemployment2003;
    @XmlElement(name = "unemployment_2004")
    protected double unemployment2004;
    @XmlElement(name = "unemployment_2005")
    protected double unemployment2005;
    @XmlElement(name = "unemployment_2006")
    protected double unemployment2006;
    @XmlElement(name = "unemployment_2007")
    protected double unemployment2007;
    @XmlElement(name = "unemployment_2008")
    protected double unemployment2008;
    @XmlElement(name = "unemployment_2009")
    protected double unemployment2009;
    @XmlElement(name = "unemployment_2010")
    protected double unemployment2010;
    @XmlElement(name = "unemployment_2011")
    protected double unemployment2011;
    @XmlElement(name = "unemployment_2012")
    protected double unemployment2012;

    /**
     * Gets the value of the unemployment2003 property.
     * 
     */
    public double getUnemployment2003() {
        return unemployment2003;
    }

    /**
     * Sets the value of the unemployment2003 property.
     * 
     */
    public void setUnemployment2003(double value) {
        this.unemployment2003 = value;
    }

    /**
     * Gets the value of the unemployment2004 property.
     * 
     */
    public double getUnemployment2004() {
        return unemployment2004;
    }

    /**
     * Sets the value of the unemployment2004 property.
     * 
     */
    public void setUnemployment2004(double value) {
        this.unemployment2004 = value;
    }

    /**
     * Gets the value of the unemployment2005 property.
     * 
     */
    public double getUnemployment2005() {
        return unemployment2005;
    }

    /**
     * Sets the value of the unemployment2005 property.
     * 
     */
    public void setUnemployment2005(double value) {
        this.unemployment2005 = value;
    }

    /**
     * Gets the value of the unemployment2006 property.
     * 
     */
    public double getUnemployment2006() {
        return unemployment2006;
    }

    /**
     * Sets the value of the unemployment2006 property.
     * 
     */
    public void setUnemployment2006(double value) {
        this.unemployment2006 = value;
    }

    /**
     * Gets the value of the unemployment2007 property.
     * 
     */
    public double getUnemployment2007() {
        return unemployment2007;
    }

    /**
     * Sets the value of the unemployment2007 property.
     * 
     */
    public void setUnemployment2007(double value) {
        this.unemployment2007 = value;
    }

    /**
     * Gets the value of the unemployment2008 property.
     * 
     */
    public double getUnemployment2008() {
        return unemployment2008;
    }

    /**
     * Sets the value of the unemployment2008 property.
     * 
     */
    public void setUnemployment2008(double value) {
        this.unemployment2008 = value;
    }

    /**
     * Gets the value of the unemployment2009 property.
     * 
     */
    public double getUnemployment2009() {
        return unemployment2009;
    }

    /**
     * Sets the value of the unemployment2009 property.
     * 
     */
    public void setUnemployment2009(double value) {
        this.unemployment2009 = value;
    }

    /**
     * Gets the value of the unemployment2010 property.
     * 
     */
    public double getUnemployment2010() {
        return unemployment2010;
    }

    /**
     * Sets the value of the unemployment2010 property.
     * 
     */
    public void setUnemployment2010(double value) {
        this.unemployment2010 = value;
    }

    /**
     * Gets the value of the unemployment2011 property.
     * 
     */
    public double getUnemployment2011() {
        return unemployment2011;
    }

    /**
     * Sets the value of the unemployment2011 property.
     * 
     */
    public void setUnemployment2011(double value) {
        this.unemployment2011 = value;
    }

    /**
     * Gets the value of the unemployment2012 property.
     * 
     */
    public double getUnemployment2012() {
        return unemployment2012;
    }

    /**
     * Sets the value of the unemployment2012 property.
     * 
     */
    public void setUnemployment2012(double value) {
        this.unemployment2012 = value;
    }

}
