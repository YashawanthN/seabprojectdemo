package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfiles {
	public Properties C_Property = new Properties();
	
	public FileReader configuration(String  fileName) throws IOException 
	{
		
		FileReader C_freader = new FileReader(
				//System.getProperty("user.dir") + "//src/test/resources/configure/" + fileName+".properties");
		System.getProperty("user.dir") + "//src/test/resources/configure//configuration.properties");
		C_Property.load(C_freader);
		return C_freader;
	}
	/*
	public FileReader locators() throws IOException 
	{
		
		FileReader L_freader = new FileReader(
				System.getProperty("user.dir") + "//src/test/resources/configure/locators.properties");
		C_Property.load(L_freader);
		return L_freader;
	}*/

}
