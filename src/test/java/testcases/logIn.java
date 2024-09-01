package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.login_pom;
import base.basefile;
import utilities.Readpropertiesfiles;
import utilities.readTestdata;

public class logIn extends basefile {
	
	public login_pom login;

	public logIn() 
	{
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		login = new login_pom();
	}
	
	@Test (priority = 1)
	public void getSeabLogo()
	{
		boolean flag = login.getLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void getTitle()
	{
		String title = login.getTitle();
		System.out.println(title);
	}
	
	@Test(priority = 3)
	public void getheaderTitle()
	{
		String headerTitle = login.getheaderTitle();
		if(headerTitle.contains("eCW2 System"))
		{
			System.out.println("Header Title is correct");
		}
	}
	
	@Test(priority = 4)
	public void getemailfield()
	{
		boolean flag = login.getemailfield();
		Assert.assertTrue(flag);
	}
	
	@Test (priority = 5)
	public void getpasswordfield()
	{
		boolean flag = login.getpasswordfield();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 6, dataProvider = "testDataSeab", dataProviderClass = readTestdata.class)
	public void loginMultipleCredentials(String email, String password) {
		String actualhomepageUrl = null;
		login.enterEmail(email);
		login.enterPass(password);

		try {
			actualhomepageUrl = login.clickLogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals(actualhomepageUrl, Readpropertiesfiles.Property.getProperty("homePageUrl")+"/home");
		login.getHomePage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
