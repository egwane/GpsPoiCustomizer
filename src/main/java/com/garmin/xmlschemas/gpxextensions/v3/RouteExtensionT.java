//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.25 at 07:37:16 AM EDT 
//

package com.garmin.xmlschemas.gpxextensions.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * This type contains data fields available in Garmin GDB routes that cannot be
 * represented in routes in GPX 1.1 instances.
 * 
 * 
 * <p>
 * Java class for RouteExtension_t complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name=&quot;RouteExtension_t&quot;&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;IsAutoNamed&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}boolean&quot;/&gt;
 *         &lt;element name=&quot;DisplayColor&quot; type=&quot;{http://www.garmin.com/xmlschemas/GpxExtensions/v3}DisplayColor_t&quot; minOccurs=&quot;0&quot;/&gt;
 *         &lt;element name=&quot;Extensions&quot; type=&quot;{http://www.garmin.com/xmlschemas/GpxExtensions/v3}Extensions_t&quot; minOccurs=&quot;0&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteExtension_t", propOrder = { "isAutoNamed", "displayColor", "extensions" })
public class RouteExtensionT {

    @XmlElement(name = "IsAutoNamed")
    protected boolean isAutoNamed;
    @XmlElement(name = "DisplayColor")
    protected DisplayColorT displayColor;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Gets the value of the isAutoNamed property.
     * 
     */
    public boolean isIsAutoNamed() {
	return isAutoNamed;
    }

    /**
     * Sets the value of the isAutoNamed property.
     * 
     */
    public void setIsAutoNamed(boolean value) {
	this.isAutoNamed = value;
    }

    /**
     * Gets the value of the displayColor property.
     * 
     * @return possible object is {@link DisplayColorT }
     * 
     */
    public DisplayColorT getDisplayColor() {
	return displayColor;
    }

    /**
     * Sets the value of the displayColor property.
     * 
     * @param value
     *            allowed object is {@link DisplayColorT }
     * 
     */
    public void setDisplayColor(DisplayColorT value) {
	this.displayColor = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return possible object is {@link ExtensionsT }
     * 
     */
    public ExtensionsT getExtensions() {
	return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *            allowed object is {@link ExtensionsT }
     * 
     */
    public void setExtensions(ExtensionsT value) {
	this.extensions = value;
    }

}