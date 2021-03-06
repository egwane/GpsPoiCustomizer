//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.25 at 07:37:16 AM EDT 
//

package com.garmin.xmlschemas.gpxextensions.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DisplayColor_t.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name=&quot;DisplayColor_t&quot;&gt;
 *   &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}token&quot;&gt;
 *     &lt;enumeration value=&quot;Black&quot;/&gt;
 *     &lt;enumeration value=&quot;DarkRed&quot;/&gt;
 *     &lt;enumeration value=&quot;DarkGreen&quot;/&gt;
 *     &lt;enumeration value=&quot;DarkYellow&quot;/&gt;
 *     &lt;enumeration value=&quot;DarkBlue&quot;/&gt;
 *     &lt;enumeration value=&quot;DarkMagenta&quot;/&gt;
 *     &lt;enumeration value=&quot;DarkCyan&quot;/&gt;
 *     &lt;enumeration value=&quot;LightGray&quot;/&gt;
 *     &lt;enumeration value=&quot;DarkGray&quot;/&gt;
 *     &lt;enumeration value=&quot;Red&quot;/&gt;
 *     &lt;enumeration value=&quot;Green&quot;/&gt;
 *     &lt;enumeration value=&quot;Yellow&quot;/&gt;
 *     &lt;enumeration value=&quot;Blue&quot;/&gt;
 *     &lt;enumeration value=&quot;Magenta&quot;/&gt;
 *     &lt;enumeration value=&quot;Cyan&quot;/&gt;
 *     &lt;enumeration value=&quot;White&quot;/&gt;
 *     &lt;enumeration value=&quot;Transparent&quot;/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisplayColor_t")
@XmlEnum
public enum DisplayColorT {

    @XmlEnumValue("Black")
    BLACK("Black"), @XmlEnumValue("DarkRed")
    DARK_RED("DarkRed"), @XmlEnumValue("DarkGreen")
    DARK_GREEN("DarkGreen"), @XmlEnumValue("DarkYellow")
    DARK_YELLOW("DarkYellow"), @XmlEnumValue("DarkBlue")
    DARK_BLUE("DarkBlue"), @XmlEnumValue("DarkMagenta")
    DARK_MAGENTA("DarkMagenta"), @XmlEnumValue("DarkCyan")
    DARK_CYAN("DarkCyan"), @XmlEnumValue("LightGray")
    LIGHT_GRAY("LightGray"), @XmlEnumValue("DarkGray")
    DARK_GRAY("DarkGray"), @XmlEnumValue("Red")
    RED("Red"), @XmlEnumValue("Green")
    GREEN("Green"), @XmlEnumValue("Yellow")
    YELLOW("Yellow"), @XmlEnumValue("Blue")
    BLUE("Blue"), @XmlEnumValue("Magenta")
    MAGENTA("Magenta"), @XmlEnumValue("Cyan")
    CYAN("Cyan"), @XmlEnumValue("White")
    WHITE("White"), @XmlEnumValue("Transparent")
    TRANSPARENT("Transparent");
    private final String value;

    DisplayColorT(String v) {
	value = v;
    }

    public String value() {
	return value;
    }

    public static DisplayColorT fromValue(String v) {
	for (DisplayColorT c : DisplayColorT.values()) {
	    if (c.value.equals(v)) {
		return c;
	    }
	}
	throw new IllegalArgumentException(v);
    }

}
