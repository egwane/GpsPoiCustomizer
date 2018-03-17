/**
 * 
 */
package com.egwane.gps;

import java.util.Locale;
import java.util.ResourceBundle;

import com.egwane.gps.common.Configuration;

import junit.framework.TestCase;

/**
 * @author Gwénaël
 * 
 */
public class ConfigurationTest extends TestCase {

    public final void testConf1() {
	assertNotNull(Configuration.readString("SpeedAlertsCustomizer.default.speed.alert"));
    }

    public final void testConf2() {
	ResourceBundle bundle = ResourceBundle.getBundle("GpsPoiCustomizer", Locale.ENGLISH);
	assertNotNull(bundle.getString("SpeedAlertsCustomizer.default.speed.alert"));
    }
}
