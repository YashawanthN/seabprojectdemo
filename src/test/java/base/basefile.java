package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basefile {
	Properties config_property = new Properties();
	public static FileReader freader = null;

	@Test
	public void setup() throws IOException {

		freader = new FileReader(
				System.getProperty("user.dir") + "//src/test/resources/configure/configuration.properties");
		config_property.load(freader);

		if (config_property.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (config_property.getProperty("browser").equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			WebDriver driver1 = new EdgeDriver();
			driver1.manage().window().maximize();
		} else if (config_property.getProperty("browser").equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			WebDriver driver1 = new FirefoxDriver();
			driver1.manage().window().maximize();
		}
	}
}
