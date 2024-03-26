package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfiles {
	
	public static Properties Property = new Properties();
	
	public static FileReader configuration() throws IOException 
	{
		
		FileReader C_freader = new FileReader(
				//System.getProperty("user.dir") + "//src/test/resources/configure/" + fileName+".properties");
		System.getProperty("user.dir") + "//src/main/java/configure//configuration.properties");
		Property.load(C_freader);
		return C_freader;
	}
	
	public static FileReader paths(String filepath) throws IOException 
	{
		
		FileReader P_paths = new FileReader(
				System.getProperty("user.dir") + "//src/main/java/configure//filePaths.properties");
		Property.load(P_paths);
		return P_paths;
	}
}
