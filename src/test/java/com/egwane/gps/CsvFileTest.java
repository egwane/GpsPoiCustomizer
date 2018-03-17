/**
 * 
 */
package com.egwane.gps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import com.egwane.gps.files.CsvFile;
import com.egwane.gps.files.PointOfInterest;

/**
 * @author Gw�na�l
 * 
 */
public class CsvFileTest extends TestCase {

    /**
     * Test method for
     * {@link com.egwane.gps.files.CsvFile#parseCsvFile(java.lang.String)}.
     * 
     * @throws IOException
     * @throws FileNotFoundException
     */
    public final void testParseCsvFile() throws FileNotFoundException, IOException {
	List<PointOfInterest> list = CsvFile
		.parseCsvFile("C:\\Users\\Gw�na�l\\Documents\\-= Gw�na�l =-\\GPS\\POI\\input\\Canada - Speed Traps.csv");
	assertNotNull(list);
    }

}
