package com.egwane.gps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.egwane.gps.common.Configuration;
import com.egwane.gps.common.CsvFile;
import com.egwane.gps.common.GpxFile;
import com.egwane.gps.common.PointOfInterest;

/**
 * 
 * @author Gwénaël
 *
 */
public class SpeedAlertsCustomizer implements CustomizerInterface {
	// Log4J configuration file is loaded from the classpath when there is no explicit command.
	static final Logger logger = Logger.getLogger(SpeedAlertsCustomizer.class);

	private static final int TIME_BEFORE_ALERT_POINT = Configuration.getInt("SpeedAlertsCustomizer.time.before.alert.point"); // In seconds
	private static final char SPEED_CHAR = '@';
	private static final String DEFAULT_SPEED_ALERT = Configuration.getString("SpeedAlertsCustomizer.default.speed.alert");
	private static final double DEFAULT_PROXIMITY = Configuration.getDouble("SpeedAlertsCustomizer.default.proximity"); // In meters
	private Set<Integer> speedLimits = new HashSet<Integer>();
	private String inputFilename;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			logger.debug("Begin main");
			
			SpeedAlertsCustomizer speedAlertsCustomizer = new SpeedAlertsCustomizer(args[0]);
			speedAlertsCustomizer.process();
			
		} catch (Exception e) {
			logger.fatal("Exception occured : ", e);
		} finally {
			logger.debug("End main");
		}
	}
	
	/**
	 * 
	 */
	public SpeedAlertsCustomizer() {
		super();
	}
	
	/**
	 * 
	 * @param inputFilename
	 */
	public SpeedAlertsCustomizer(String inputFilename) {
		super();
		this.inputFilename = inputFilename;
	}

	/* (non-Javadoc)
	 * @see com.egwane.gps.CustomizerInterface#process()
	 */
	public void process() {
		try {
			logger.debug("Begin process");
		
			// Parse CSV File
			List<PointOfInterest> list;
			list = CsvFile.parseCsvFile(Configuration.getString("FileProcessor.input.directory") + this.inputFilename);
			logger.info("Number of POIs : " + list.size());

			// Create GPX file with all the data read in CSV file
			GpxFile gpxFile = new GpxFile(this.customizePointsOfInterestList(list), createOutputFilename(this.inputFilename));
			gpxFile.writeGpxFile();
			
			// Display the speed limits found in the file
			logger.info("Speed limits found : " + createSortedSpeedLimits(this.speedLimits));
			
		} catch (Exception e) {
			logger.fatal("Exception occured : ", e);
		} finally {
			logger.debug("End process");
		}
	}
	
	/**
	 * 
	 * @param outputFilename
	 * @return
	 */
	private static String createOutputFilename(String inputFilename) {
		StringBuffer outputFilename = new StringBuffer(Configuration.getString("FileProcessor.output.directory"));
		
		int dotIndex = inputFilename.lastIndexOf('.');
		if (dotIndex > 0) {
			outputFilename.append(inputFilename.substring(0, dotIndex));
		}else{
			outputFilename.append(inputFilename);
		}
		outputFilename.append(Configuration.getString("SpeedAlertsCustomizer.output.file.extension"));
		return outputFilename.toString();
	}
	
	/**
	 * @param speedAlertsCustomizer
	 */
	private static List<Integer> createSortedSpeedLimits(Set<Integer> speedLimits) {
		List<Integer> sortedSpeedLimits = new ArrayList<Integer>(speedLimits);
		Collections.sort(sortedSpeedLimits);
		return sortedSpeedLimits;
	}
	
	/**
	 * 
	 * @param pointsOfInterestList
	 * @return
	 */
	private List<PointOfInterest> customizePointsOfInterestList(List<PointOfInterest> pointsOfInterestList) {
		logger.debug("Begin customizePointsOfInterestList");
		
		for (PointOfInterest pointOfInterest : pointsOfInterestList) {
			customizePointOfInterest (pointOfInterest);
		}
		
		logger.debug("End customizePointsOfInterestList");
		return pointsOfInterestList;
	}

	/**
	 * 
	 * @param pointOfInterest
	 */
	private void customizePointOfInterest(PointOfInterest pointOfInterest) {
		extractSpeed(pointOfInterest);
		
		pointOfInterest.setProximity(computeProximity(pointOfInterest.getSpeed()));
		customizeLink(pointOfInterest);
		// Remove quotes in name
		pointOfInterest.setName(pointOfInterest.getName().replaceAll("\"", ""));
	}

	/**
	 * 
	 * @param pointOfInterest
	 */
	private void extractSpeed(PointOfInterest pointOfInterest) {
		String speed = "0";
		int speedInformationIndex = pointOfInterest.getName().indexOf(SPEED_CHAR);
		if (speedInformationIndex > 0) {
			speed = pointOfInterest.getName().substring(speedInformationIndex + 1);
			pointOfInterest.setSpeed(Integer.parseInt(speed));
		}
		this.speedLimits.add(new Integer(speed));
	}
	
	/**
	 * Compute the proximity value in order that the alarm pops up
	 * TIME_BEFORE_ALERT_POINT seconds before arriving to the alert point.
	 * 
	 * @param speed
	 * @return
	 */
	private static double computeProximity(int speed) {
		if (speed > 0){
			return (speed * 1000 * TIME_BEFORE_ALERT_POINT)/3600;
		}else{
			return DEFAULT_PROXIMITY;
		}
	}

	/**
	 * 
	 * @param pointOfInterest
	 */
	private static void customizeLink(PointOfInterest pointOfInterest) {
		if (pointOfInterest.getSpeed() > 0) {
			pointOfInterest.setLink(DEFAULT_SPEED_ALERT + pointOfInterest.getSpeed());
		}else{
			pointOfInterest.setLink(DEFAULT_SPEED_ALERT);
		}
	}
}
