package base;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Readpropertiesfiles;

public class basefile extends Readpropertiesfiles{
	public  WebDriver driver = null;
	
	@BeforeSuite
	public void launchurl() throws IOException {
		configuration("configuration");
		if (C_Property.getProperty("browser").equalsIgnoreCase("chrome")) {
			//login_pom login = new login_pom(driver);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(C_Property.getProperty("demoui2_url"));
		}

		else if (C_Property.getProperty("browser").equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(C_Property.getProperty("demoui2_url"));
		} else if (C_Property.getProperty("browser").equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(C_Property.getProperty("demoui2_url"));
		}
	}
}
