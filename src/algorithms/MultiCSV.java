package algorithms;

import java.io.File;
import file_format.CsvReader;
import gis.GIS_project;

public class MultiCSV {
public GIS_project project;

	public static void listFilesForFolder(final File folder) {
		CsvReader csvReader = new CsvReader();
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				String fileName=fileEntry.getName();
				if (fileName.substring(fileName.lastIndexOf('.') + 1, fileName.length()).equals("csv")) {
					csvReader.init(fileEntry.getPath(), ",");
					csvReader.read();
				}
			}
		}
	}

	public static void main(String[] args) {

		final File folder = new File("/home/you/Desktop");
		listFilesForFolder(folder);
	}
}
