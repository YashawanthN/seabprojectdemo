package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mod_pom {
	WebDriver driver;
	
	public mod_pom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath= "//figcaption[text() = 'Projects']")
	public static WebElement ms_projects;
	
	public void getModprojects()
	{
		ms_projects.click();
		
	}
	
}
