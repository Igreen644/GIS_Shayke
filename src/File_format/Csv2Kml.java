package file_format;

public class Csv2Kml {

	private CsvReader reader;

	public Csv2Kml(String filePath) {
		reader= new CsvReader();
		reader.init(filePath, ",");
		reader.read();
	}
}
