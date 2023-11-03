package utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_pom {
	
	Readpropertiesfiles read = new Readpropertiesfiles();

	public login_pom(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public WebElement Email(WebDriver driver) throws InterruptedException, IOException {

		// river.get(C_Property.getProperty("demoui2_url"));
		read.locators();
		WebElement emailElement = driver.findElement(By.xpath(read.C_Property.getProperty("email")));

		return emailElement;
	}

	public WebElement Password(WebDriver driver) throws InterruptedException, IOException {
		read.locators();
		WebElement PasswordElement = driver.findElement(By.xpath(read.C_Property.getProperty("password")));
		return PasswordElement;
	}

	public WebElement signin(WebDriver driver) throws InterruptedException, IOException {
		read.locators();
		WebElement signInElement = driver.findElement(By.xpath(read.C_Property.getProperty("login_button")));
		return signInElement;
	}
}
