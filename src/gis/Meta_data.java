package gis;

import java.util.Date;

import geom.Point3D;

public interface Meta_data {
	/** returns the Universal Time Clock associated with this data; */
	public Date getUTC();
	/** return a String representing this data */
	public String toString();
	/**
	 * @return the orientation: yaw, pitch and roll associated with this data;
	 */
	public Point3D get_Orientation();
}
