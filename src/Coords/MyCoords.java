package Coords;

import Geom.Point3D;

public class MyCoords implements Coords_converter {

	/**
	 * computes a new point which is the gps point transformed by a 3D vector (in meters)
	 * @param gps is the gps point given
	 * @param local_vector_in_meter is the cartezi point given
	 * @return new_point gps that its add of the two points
	 */
	public Point3D add(Point3D gps, Point3D local_vector_in_meter) {
		Point3D gpsConvertCartesi=gps.convertToCartesian();
		double x=gpsConvertCartesi.x()+local_vector_in_meter.x();
		double y=gpsConvertCartesi.y()+local_vector_in_meter.y();
		double z=gpsConvertCartesi.z()+local_vector_in_meter.z();
		return new Point3D(x,y,z).convertToGps();
	}

	/**
	 * computes the distance between 2 gps points
	 * @param gps0 is the first gps point given
	 * @param gps1 is the second gps point given
	 * @return distance between the two points
	 */
	public double distance3d(Point3D gps0, Point3D gps1) {
		Point3D gps0ConvertCartesi=gps0.convertToCartesian();
		Point3D gps1ConvertCartesi=gps1.convertToCartesian();
		return Math.abs(gps0ConvertCartesi.distance3D(gps1ConvertCartesi));
	}

	/**
	 * 
	 * computes the 3D vector (in meters) between two gps like points
	 * @param gps0 is the first gps point given
	 * @param gps1 is the second gps point given
	 * @return vector of the two points that one is 
	 */
	public Point3D vector3D(Point3D gps0, Point3D gps1) {
		Point3D gps0ConvertCartesi=gps0.convertToCartesian();
		Point3D gps1ConvertCartesi=gps1.convertToCartesian();
		Point3D vector=null;
		if(Math.abs(gps1ConvertCartesi.distance3D(0,0,0))>=Math.abs(gps0ConvertCartesi.distance3D(0,0,0)))
			vector=new Point3D(gps1ConvertCartesi.x()-gps0ConvertCartesi.x(),gps1ConvertCartesi.y()-gps0ConvertCartesi.y(),gps1ConvertCartesi.z()-gps0ConvertCartesi.z());
		else
			vector=new Point3D(gps0ConvertCartesi.x()-gps1ConvertCartesi.x(),gps0ConvertCartesi.y()-gps1ConvertCartesi.y(),gps0ConvertCartesi.z()-gps1ConvertCartesi.z());
		return vector;
	}

	@Override
	public double[] azimuth_elevation_dist(Point3D gps0, Point3D gps1) {
		return null;
	}

	@Override
	public boolean isValid_GPS_Point(Point3D p) {
		return false;
	}
	


}
