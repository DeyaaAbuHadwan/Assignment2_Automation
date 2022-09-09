
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadCSV {
	static ArrayList<String[]> list;

	public static Object[][] readDataLineByLine(String file) {
		String[][] list = new String[12][];
		
		try {
			FileReader filereader = new FileReader(file);
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;
			int i = 0;
			while ((nextRecord = csvReader.readNext()) != null) {
				list[i++] = nextRecord;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
