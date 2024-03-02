package base;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Readpropertiesfiles;


public class basefile extends Readpropertiesfiles{
	public  WebDriver driver = null;
	
	@BeforeMethod
	public void launchurl() throws IOException {
		configuration("configuration");
		if (C_Property.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(C_Property.getProperty("testr3"));
		}

		else if (C_Property.getProperty("browser").equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(C_Property.getProperty("testr3Url"));
		} else if (C_Property.getProperty("browser").equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(C_Property.getProperty("testr3Url"));
		}
	}
	//@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
