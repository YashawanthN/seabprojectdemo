package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.basefile;

public class login_pom extends basefile{
	
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

	

	public void enterEmail() throws IOException {
		configuration("configuration");
		emailElement.sendKeys(C_Property.getProperty("eo"));

	}

	public void enterPass() throws IOException {
		configuration("configuration");
		PasswordElement.sendKeys(C_Property.getProperty("eo_pass"));

	}

	public void clickLogin() {
		login_button.click();
	}
}
