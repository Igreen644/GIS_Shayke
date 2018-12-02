package file_format;

import java.io.IOException;
import java.text.ParseException;

import coords.MyCoords;
import geom.Point3D;

public class Test {
	public static void main(String[] args) throws ParseException, IOException {
		//String str = "E:\\wifi\\";
		//Csv2Kml csv2kml=new Csv2Kml(str,true);
		Point3D gps0=new Point3D(32.103315,35.209039,670);
		Point3D gps1=new Point3D(32.106352,35.205225,650);
		MyCoords mycoords=new MyCoords();
		System.out.println(mycoords.distance3d(gps0, gps1));
		double[] d=(mycoords.azimuth_elevation_dist(gps0, gps1));
		for(int i=0;i<d.length;i++)
			System.out.println(d[i]);
	}
}
