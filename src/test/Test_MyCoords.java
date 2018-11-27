package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import coords.MyCoords;
import geom.Point3D;
/**
 * Junit to test MyCoords class
 * @author Shayke Shok and Itay Grinblat
 */
class Test_MyCoords {
	MyCoords coords=new MyCoords();
	Point3D vec;
	Point3D gps0;
	Point3D gps1;
	

	@Before
	public void setup(){
		gps0=new Point3D(32.103315,35.209039,670);
		gps1=new Point3D(32.106352,35.205225,650);
		vec=new Point3D(48,210,450);
	}
	
	public void testAdd() {
		Point3D pNew=coords.add(gps0, vec);
		assertEquals("Add function is true", coords.add(gps0, vec), pNew);
	}
	
	public void testDistance3D() {
		Double distance=coords.distance3d(gps0, gps1);
		Double ans=493.052331832413;
		assertEquals("Distance3D function is true",ans, distance);
	}
	
	public void testVector3D() {
		Point3D distance=coords.vector3D(gps0, gps1);
		Point3D ans=;
		assertEquals("Vector3D function is true",ans, distance);
	}
	
	public void testAzimuth_elevation_dist() {
		double[] actual=coords.azimuth_elevation_dist(gps0, gps1);
		double[] ans=;
		assertArrayEquals("Azimuth_elevation_dist function is true",ans, actual);
	}
	
	public void testIsValid_GPS_Point() {
		assertTrue("IsValid_GPS_Point function is true", coords.isValid_GPS_Point(gps0)==true);
	}
	
	
/*
	@Test
	public void testGetPower() {
		assertEquals("GetPower function is fail", 6, m1.get_power());
		assertTrue("Add function is fail", m1.equals(m3));
	}
*/
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
