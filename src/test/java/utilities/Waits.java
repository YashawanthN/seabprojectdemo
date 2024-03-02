package utilities;



import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.home_pom;

public class Waits {

	public static void waitImplicit(WebDriver driver, int seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		//driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public static void explicitWait(WebDriver driver, int seocnds)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(home_pom.Mod_Service));
	}

}
