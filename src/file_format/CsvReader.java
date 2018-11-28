package file_format;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import gis.GIS_layer;
import gis.GisElement;

public class CsvReader {

	private String csvFile;
	private String csvSplitBy;
	private BufferedReader br;
	private String line;
	private GIS_layer gisLayer;

	public void init(String csvFilePath, String csvSplitByChar) {
		csvFile = csvFilePath;
		br = null;
		line = "";
		csvSplitBy = csvSplitByChar;
		gisLayer=null;
	}

	public GIS_layer read() throws ParseException {


		try {
			br = new BufferedReader(new FileReader(csvFile));
			int rowNum = 0;
			while ((line = br.readLine()) != null) {
				String[] element = line.split(",");
				if (rowNum > 1)
					gisLayer.add(new GisElement(element));
				rowNum++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return gisLayer;

	}

	public static void main(String[] args) throws ParseException {
		String s = "/wifi.csv";
		CsvReader csv = new CsvReader();
		csv.init(s, "'");
		csv.read();
	}
}
