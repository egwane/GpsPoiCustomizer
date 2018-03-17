package com.egwane.gps.common;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class Configuration {
    static final Logger logger = Logger.getLogger(Configuration.class);

    private static final String BUNDLE_NAME = "GpsPoiCustomizer";
    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, Locale.ENGLISH);

    private Configuration() {
    }

    public static String readString(String key) {
	try {
	    return RESOURCE_BUNDLE.getString(key);
	} catch (MissingResourceException mre) {
	    logger.fatal("\'" + key + "\' missing in properties file!");
	    logger.fatal("Exception occured : ", mre);
	    return "\'" + key + "\' missing in properties file!";
	}
    }

    public static int readInt(String key) {
	try {
	    return Integer.parseInt(RESOURCE_BUNDLE.getString(key));
	} catch (MissingResourceException mre) {
	    logger.fatal("\'" + key + "\' missing in properties file!");
	    logger.fatal("Exception occured : ", mre);
	    return -1;
	} catch (NumberFormatException nfe) {
	    logger.fatal("\'" + key + "\' is not a valid integer in properties file!");
	    logger.fatal("Exception occured : ", nfe);
	    return -1;
	}
    }

    public static double readDouble(String key) {
	try {
	    return Double.parseDouble(RESOURCE_BUNDLE.getString(key));
	} catch (MissingResourceException mre) {
	    logger.fatal("\'" + key + "\' missing in properties file!");
	    logger.fatal("Exception occured : ", mre);
	    return -1;
	} catch (NumberFormatException nfe) {
	    logger.fatal("\'" + key + "\' is not a valid double in properties file!");
	    logger.fatal("Exception occured : ", nfe);
	    return -1;
	}
    }
}
