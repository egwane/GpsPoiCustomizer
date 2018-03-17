/**
 * 
 */
package com.egwane.gps.files.processor;

import java.io.File;

import org.apache.log4j.Logger;

import com.egwane.gps.common.Configuration;
import com.egwane.gps.customizer.CustomizerInterface;
import com.egwane.gps.customizer.SpeedAlertsCustomizer;

/**
 * @author Gwénaël
 * 
 */
public class FileProcessor {
    static final Logger logger = Logger.getLogger(FileProcessor.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
	logger.debug("Begin main");

	for (File file : buildFilesList()) {
	    if (!file.isFile())
		continue; // If not a file

	    String fileName = file.getName();
	    logger.info("Processing file : " + fileName + "...");

	    // TODO créer un Factory
	    if (fileName.contains("Speed") && fileName.endsWith(".csv")) {
		CustomizerInterface customizer = new SpeedAlertsCustomizer(fileName);
		customizer.process();
	    } else {
		logger.warn("File " + fileName + " not processed.");
	    }
	}
	logger.debug("End main");
    }

    /**
     * @return
     */
    private static File[] buildFilesList() {
	File folder = new File(Configuration.readString("FileProcessor.input.directory"));
	return folder.listFiles();
    }
}
