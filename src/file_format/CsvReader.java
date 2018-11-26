package file_format;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

	private String csvFile;
	private String cvsSplitBy;
	private BufferedReader br;
	private String line;

	public void init(String csvFilePath, String cvsSplitByChar) {
		csvFile = csvFilePath;// "/Users/mkyong/csv/country.csv";
		br = null;
		line = "";
		cvsSplitBy = cvsSplitByChar; // ",";
	}

	public void read() {

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				//System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

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

	}
public static void main(String[] args) {
	String s="/Users/owner/git/wifi.csv";
	CsvReader csv=new CsvReader();
	csv.init(s,"'");
	csv.read();
	}
}

