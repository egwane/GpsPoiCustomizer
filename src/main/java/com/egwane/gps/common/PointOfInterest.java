/**
 * 
 */
package com.egwane.gps.common;

/**
 * @author Gwénaël
 *
 */
public class PointOfInterest {

	private double latitude = 0.0;
	private double longitude = 0.0;
	private String name;
	private double proximity = 0.0;
	private String link;
	private int speed = 0;
	
	/**
	 * 
	 */
	public PointOfInterest() {
		super();
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the proximity
	 */
	public double getProximity() {
		return proximity;
	}

	/**
	 * @param proximity the proximity to set
	 */
	public void setProximity(double proximity) {
		this.proximity = proximity;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PointOfInterest [latitude=" + latitude + ", longitude="
				+ longitude + ", name=" + name + ", proximity=" + proximity
				+ ", link=" + link + ", speed=" + speed + "]";
	}

}
