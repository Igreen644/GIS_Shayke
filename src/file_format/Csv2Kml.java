package file_format;

import gis.GisLayer;
import gis.GisProject;

public class Csv2Kml {

	private CsvReader reader;
	private GisLayer gisLayer;
	private GisProject gisProject;
	
	public Csv2Kml(String filePath) {
		reader= new CsvReader();
		reader.init(filePath, ",");
		gisLayer.set=reader.read();

	}
}
