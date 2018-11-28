package file_format;

import java.text.ParseException;

public class Test {
	public static void main(String[] args) throws ParseException {
		String str = "C:\\wifi";
		Csv2Kml csv2kml=new Csv2Kml(str,true);
	}
}
