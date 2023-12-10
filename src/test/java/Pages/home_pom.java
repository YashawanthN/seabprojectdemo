package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.support.FindBy;

public class home_pom  {
	
	WebDriver driver;
	public home_pom(WebDriver driver)
	{
		 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Moderation Service']")
	public static WebElement Mod_Service;
	
	
	public void getmodService()
	{
		Mod_Service.click();
			
	}
	
	

}
