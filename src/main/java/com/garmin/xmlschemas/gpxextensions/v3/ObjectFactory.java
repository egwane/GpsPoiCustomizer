//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.25 at 07:37:16 AM EDT 
//

package com.garmin.xmlschemas.gpxextensions.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.garmin.xmlschemas.gpxextensions.v3
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TrackPointExtension_QNAME = new QName(
	    "http://www.garmin.com/xmlschemas/GpxExtensions/v3", "TrackPointExtension");
    private final static QName _RouteExtension_QNAME = new QName("http://www.garmin.com/xmlschemas/GpxExtensions/v3",
	    "RouteExtension");
    private final static QName _WaypointExtension_QNAME = new QName(
	    "http://www.garmin.com/xmlschemas/GpxExtensions/v3", "WaypointExtension");
    private final static QName _TrackExtension_QNAME = new QName("http://www.garmin.com/xmlschemas/GpxExtensions/v3",
	    "TrackExtension");
    private final static QName _RoutePointExtension_QNAME = new QName(
	    "http://www.garmin.com/xmlschemas/GpxExtensions/v3", "RoutePointExtension");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.garmin.xmlschemas.gpxextensions.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtensionsT }
     * 
     */
    public ExtensionsT createExtensionsT() {
	return new ExtensionsT();
    }

    /**
     * Create an instance of {@link WaypointExtensionT }
     * 
     */
    public WaypointExtensionT createWaypointExtensionT() {
	return new WaypointExtensionT();
    }

    /**
     * Create an instance of {@link TrackPointExtensionT }
     * 
     */
    public TrackPointExtensionT createTrackPointExtensionT() {
	return new TrackPointExtensionT();
    }

    /**
     * Create an instance of {@link RouteExtensionT }
     * 
     */
    public RouteExtensionT createRouteExtensionT() {
	return new RouteExtensionT();
    }

    /**
     * Create an instance of {@link RoutePointExtensionT }
     * 
     */
    public RoutePointExtensionT createRoutePointExtensionT() {
	return new RoutePointExtensionT();
    }

    /**
     * Create an instance of {@link AutoroutePointT }
     * 
     */
    public AutoroutePointT createAutoroutePointT() {
	return new AutoroutePointT();
    }

    /**
     * Create an instance of {@link TrackExtensionT }
     * 
     */
    public TrackExtensionT createTrackExtensionT() {
	return new TrackExtensionT();
    }

    /**
     * Create an instance of {@link CategoriesT }
     * 
     */
    public CategoriesT createCategoriesT() {
	return new CategoriesT();
    }

    /**
     * Create an instance of {@link PhoneNumberT }
     * 
     */
    public PhoneNumberT createPhoneNumberT() {
	return new PhoneNumberT();
    }

    /**
     * Create an instance of {@link AddressT }
     * 
     */
    public AddressT createAddressT() {
	return new AddressT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link TrackPointExtensionT }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/GpxExtensions/v3", name = "TrackPointExtension")
    public JAXBElement<TrackPointExtensionT> createTrackPointExtension(TrackPointExtensionT value) {
	return new JAXBElement<TrackPointExtensionT>(_TrackPointExtension_QNAME, TrackPointExtensionT.class, null,
		value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteExtensionT }
     * {@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/GpxExtensions/v3", name = "RouteExtension")
    public JAXBElement<RouteExtensionT> createRouteExtension(RouteExtensionT value) {
	return new JAXBElement<RouteExtensionT>(_RouteExtension_QNAME, RouteExtensionT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link WaypointExtensionT }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/GpxExtensions/v3", name = "WaypointExtension")
    public JAXBElement<WaypointExtensionT> createWaypointExtension(WaypointExtensionT value) {
	return new JAXBElement<WaypointExtensionT>(_WaypointExtension_QNAME, WaypointExtensionT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackExtensionT }
     * {@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/GpxExtensions/v3", name = "TrackExtension")
    public JAXBElement<TrackExtensionT> createTrackExtension(TrackExtensionT value) {
	return new JAXBElement<TrackExtensionT>(_TrackExtension_QNAME, TrackExtensionT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link RoutePointExtensionT }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.garmin.com/xmlschemas/GpxExtensions/v3", name = "RoutePointExtension")
    public JAXBElement<RoutePointExtensionT> createRoutePointExtension(RoutePointExtensionT value) {
	return new JAXBElement<RoutePointExtensionT>(_RoutePointExtension_QNAME, RoutePointExtensionT.class, null,
		value);
    }

}
