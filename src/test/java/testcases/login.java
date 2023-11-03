package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.basefile;

public class login extends basefile {
	@Test(priority = 1)
	public void loginAo() throws InterruptedException {
		driver.get(C_Property.getProperty("demoui2_url"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(C_Property.getProperty("email"))).sendKeys(C_Property.getProperty("ao"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(C_Property.getProperty("password"))).sendKeys(C_Property.getProperty("ao_pass"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(C_Property.getProperty("login_button"))).click();

	}

}
