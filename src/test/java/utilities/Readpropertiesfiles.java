package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfiles {
	public static Properties C_Property = new Properties();
	
	public FileReader configuration(String  fileName) throws IOException 
	{
		
		FileReader C_freader = new FileReader(
				//System.getProperty("user.dir") + "//src/test/resources/configure/" + fileName+".properties");
		System.getProperty("user.dir") + "//src/test/resources/configure//configuration.properties");
		C_Property.load(C_freader);
		return C_freader;
	}
	
	public static FileReader paths(String filepath) throws IOException 
	{
		
		FileReader P_paths = new FileReader(
				System.getProperty("user.dir") + "//src/test/resources/configure/filePaths.properties");
		C_Property.load(P_paths);
		return P_paths;
	}
}
