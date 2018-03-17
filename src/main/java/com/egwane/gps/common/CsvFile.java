/**
 * 
 */
package com.egwane.gps.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

/**
 * @author Gwénaël
 *
 */
public abstract class CsvFile {
	
	static final Logger logger = Logger.getLogger(CsvFile.class);

	/**
	 * 
	 */
	public CsvFile() {
	}
	
	/**
	 * 
	 * @return List of PointOfInterest objects
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static List<PointOfInterest> parseCsvFile(String file) throws FileNotFoundException, IOException {
		logger.debug("Begin parseCsvFile");
		
		CSVReader reader = new CSVReader(new FileReader(file));
		ColumnPositionMappingStrategy<PointOfInterest> columnPositionMappingStrategy = new ColumnPositionMappingStrategy<PointOfInterest>();
		columnPositionMappingStrategy.setType(PointOfInterest.class);
		String[] columns = new String[] {"longitude", "latitude", "name"}; // the fields to bind do in your JavaBean
		columnPositionMappingStrategy.setColumnMapping(columns);
		CsvToBean<PointOfInterest> csv = new CsvToBean<PointOfInterest>();
		List<PointOfInterest> pointsOfInterests = csv.parse(columnPositionMappingStrategy, reader);
		
		logger.debug("End parseCsvFile");
		return pointsOfInterests;
	}

}
