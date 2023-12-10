package common;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

public class implicitWaits {
	WebDriver driver;
	
	public implicitWaits(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitImplicit() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
