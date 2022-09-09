package Classes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadCSV {
	static ArrayList<String[]> list;
	public static ArrayList<String[]> readDataLineByLine(String file) {
	ArrayList<String[]> list = new ArrayList<String[]>();   
		try {
		        FileReader filereader = new FileReader(file);
		        CSVReader csvReader = new CSVReader(filereader);
		        String[] nextRecord;
		  
		        // we are going to read data line by line
		        while ((nextRecord = csvReader.readNext()) != null) {
		            list.add(nextRecord);
		        }
		    }
		    catch (Exception e) {
		        e.printStackTrace();
		    }
		
		list.remove(0);
		 	return list;
	}
	
	
}
