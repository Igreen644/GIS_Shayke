package file_format;

import gis.GisObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

	private String csvFile;
	private String cvsSplitBy;
	private BufferedReader br;
	private String line;

	public void init(String csvFilePath, String cvsSplitByChar) {
		csvFile = csvFilePath;
		br = null;
		line = "";
		cvsSplitBy = cvsSplitByChar;
	}

	public List<GisObject> read() {

		List gisLayer=new ArrayList<GisObject>();
		try {
			br = new BufferedReader(new FileReader(csvFile));
			int rowNum = 0;
			while ((line = br.readLine()) != null) {
				String[] element = line.split(cvsSplitBy);	
				if(rowNum!=0)
					gisLayer.add(element);
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
public static void main(String[] args) {
	String s="/wifi.csv";
	CsvReader csv=new CsvReader();
	csv.init(s,"'");
	csv.read();
	}
}

