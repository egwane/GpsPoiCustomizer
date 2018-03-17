package com.egwane.gps;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.egwane.gps.files.GpxFile;
import com.egwane.gps.files.PointOfInterest;

public class GpxFileTest extends TestCase {

    public final void testWriteGpxFile() {
	List<PointOfInterest> list = new ArrayList<PointOfInterest>();

	PointOfInterest pointOfInterest = new PointOfInterest();
	pointOfInterest.setLongitude(-100);
	pointOfInterest.setLatitude(-40);
	pointOfInterest.setName("Test du Marshal");

	list.add(pointOfInterest);
	GpxFile gpxFile = new GpxFile(list,
		"C:\\Users\\Gwénaël\\Documents\\-= Gwénaël =-\\GPS\\POI\\output\\Gpx JUnit Test.gpx");

	gpxFile.writeGpxFile();
    }

}
