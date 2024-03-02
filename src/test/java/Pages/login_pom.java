package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.basefile;
import utilities.readTestdata;

public class login_pom extends basefile {

	WebDriver driver;

	public login_pom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[3]/div/input")
	public WebElement emailElement;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[4]/div/input")
	public WebElement PasswordElement;

	@FindBy(xpath = "/html/body/app-root/div/div/app-login/div[1]/div[2]/form/div/div[3]/button[1]")
	public WebElement login_button;

	@Test(dataProvider = "testDataSeab", dataProviderClass = readTestdata.class)
	public void enterEmail(String email) {

		emailElement.sendKeys(email);

	}

	public void enterPass(String password) {

		PasswordElement.sendKeys(password);

	}

	public String clickLogin() throws InterruptedException {
		login_button.click();
		Thread.sleep(5000);
		String actualUrl = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String homePageUrl = "https://ecw.excelindia.com/TESTR3/home";
		return actualUrl;
		
		
	}
}
