package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.basefile;

public class login_pom extends basefile {

	public login_pom() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//div [@id = 'loginForm'] / div [@class = 'login-logo'] / img [@alt = 'icon' ]")
	public WebElement seabIcon;
	
	@FindBy (xpath = "//div [@class = 'login-head']")
	public WebElement hearTitle;
	
	@FindBy(xpath = "//input [@type ='email']")
	public WebElement emailElement;

	@FindBy(xpath = "//input [@type ='password']")
	public WebElement passwordElement;

	@FindBy(xpath = "//button [ text() ='Login']")
	public WebElement login_button;
	
	@FindBy (xpath ="//div[@role='alertdialog']")
	public WebElement validationMessage;

	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean getLogo()
	{
		return seabIcon.isDisplayed();
	}
	
	public String getheaderTitle()
	{
		return hearTitle.getText();
	}
	
	public  boolean getemailfield()
	{
		emailElement.isDisplayed();
		return emailElement.isEnabled();
	}
	
	public  boolean getpasswordfield()
	{
		passwordElement.isDisplayed();
		return emailElement.isEnabled();
	}
	public login_pom enterEmail(String email) {

		emailElement.sendKeys(email);
		return this;

	}

	public login_pom enterPass(String password) {

		passwordElement.sendKeys(password);
		return this;
	}

	public String clickLogin() throws InterruptedException {
		login_button.isDisplayed();
		login_button.isEnabled();
		login_button.click();
		Thread.sleep(3000);
		return driver.getCurrentUrl();

	}
	public home_pom getHomePage()
	{
		login_button.click();
		return new home_pom();
	}
}
