package readpropertydata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		
		 FileInputStream fis = new FileInputStream("./data/config.properties");
		 
		 //read data from property file
		Properties prop = new Properties();
		
		//make the property file for read
		prop.load(fis);
		
		String data = prop.getProperty("username");
		System.out.println(data);
		
		
	}

}
 