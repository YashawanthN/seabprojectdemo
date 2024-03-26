package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.basefile;

public class mod_pom extends basefile{

	
	public mod_pom()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath= "//figcaption[text() = 'Projects']")
	public WebElement ms_projects;
	
	public void getModprojects()
	{
		try {
			ms_projects.click();
		}
		
		catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", ms_projects);
		  }
	}
	
}
