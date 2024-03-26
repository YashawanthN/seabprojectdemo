package Pages;


import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.basefile;

import org.openqa.selenium.support.FindBy;

public class home_pom  extends basefile{
	
	public home_pom() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()= 'Moderation Service']")
	public static WebElement Mod_Service;
	
	@FindBy (xpath = "//span[@class='user-name']")
	public static WebElement userName;
	
	@FindBy (xpath = "//div [@class='col-sm-4 ng-star-inserted']")
	public static List<WebElement> seabServices;
	
	public List<String> getServices()
	{
		List<String> stringList = new ArrayList<String>();
		seabServices.size();
		for(WebElement ele :seabServices )
		{
			String serviceName = ele.getText();
			stringList.add(serviceName);
			//System.out.println(serviceName);
		}
		return stringList;
		
	}
	
	public String getTitle() 
	{
		return driver.getTitle();
	}
	
	public String getUserName()
	{
		return userName.getText();
	}
	public void getmodService()
	{
		Mod_Service.click();
	}
	
	

}
