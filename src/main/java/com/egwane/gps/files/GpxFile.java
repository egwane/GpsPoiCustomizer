/**
 * 
 */
package com.egwane.gps.files;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;

import com.garmin.xmlschemas.gpxextensions.v3.WaypointExtensionT;
import com.topografix.gpx._1._1.ExtensionsType;
import com.topografix.gpx._1._1.GpxType;
import com.topografix.gpx._1._1.LinkType;
import com.topografix.gpx._1._1.ObjectFactory;
import com.topografix.gpx._1._1.WptType;

/**
 * @author Gwénaël
 * 
 */
public class GpxFile {

    static final Logger logger = Logger.getLogger(GpxFile.class);

    private static final String VERSION = "1.1";
    private static final String CREATOR = "eGwane";
    private List<PointOfInterest> pointsOfInteretList;
    private String fullPathFileName;
    private ObjectFactory objectFactory;
    private GpxType gpx;

    /**
	 * 
	 */
    public GpxFile(List<PointOfInterest> pointsOfInteretList, String fullPathFileName) {
	this.pointsOfInteretList = pointsOfInteretList;
	this.fullPathFileName = fullPathFileName;

	objectFactory = new ObjectFactory();
	gpx = objectFactory.createGpxType();
    }

    public void writeGpxFile() {
	logger.debug("Begin writeGpxFile");
	this.fillGpxSchemaComponents();
	this.marshal();
	logger.debug("End writeGpxFile");
    }

    private void fillGpxSchemaComponents() {
	logger.debug("Begin fillGpxSchemaComponents");
	this.gpx.setVersion(VERSION);
	this.gpx.setCreator(CREATOR);

	for (PointOfInterest pointOfInterest : this.pointsOfInteretList) {
	    this.gpx.getWpt().add(createWpt(pointOfInterest));
	}
	logger.debug("End fillGpxSchemaComponents");
    }

    private WptType createWpt(PointOfInterest pointOfInterest) {
	WptType wpt = new WptType();
	wpt.setLon(BigDecimal.valueOf(pointOfInterest.getLongitude()));
	wpt.setLat(BigDecimal.valueOf(pointOfInterest.getLatitude()));
	wpt.setName(pointOfInterest.getName());
	wpt.getLink().add(createLink(pointOfInterest, wpt));
	wpt.setExtensions(createExtensions(pointOfInterest));
	return wpt;
    }

    private LinkType createLink(PointOfInterest pointOfInterest, WptType wpt) {
	LinkType link = new LinkType();
	link.setHref(pointOfInterest.getLink());
	return link;
    }

    /**
     * Create extensions for a way point
     * 
     * @param pointOfInterest
     * @return
     */
    private ExtensionsType createExtensions(PointOfInterest pointOfInterest) {
	ExtensionsType extensions = new ExtensionsType();

	// Extension data
	WaypointExtensionT waypointExtension = new WaypointExtensionT();
	waypointExtension.setProximity(pointOfInterest.getProximity());

	extensions.getAny().add(waypointExtension);
	return extensions;
    }

    private void marshal() {
	logger.debug("Begin marshal");
	try {
	    JAXBElement<GpxType> gpxXmlElement = objectFactory.createGpx(this.gpx);
	    JAXBContext jc = JAXBContext.newInstance("com.topografix.gpx._1._1:com.garmin.xmlschemas.gpxextensions.v3");
	    Marshaller m = jc.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    m.marshal(gpxXmlElement, new File(this.fullPathFileName));

	} catch (JAXBException jbe) {
	    jbe.printStackTrace();
	} finally {
	    logger.debug("End marshal");
	}
    }
}
