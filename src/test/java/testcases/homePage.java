package testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.home_pom;
import base.basefile;
import utilities.logInFunction;

public class homePage extends basefile{
	
	public home_pom home;
	public logInFunction logIn;
	
	public homePage()
	{
		super();
	}
	
	@BeforeMethod
	private void setup()
	{
		initialization();
		logIn = new logInFunction();
		home = new home_pom();
		logIn.logInToApplication(); // Menthod in utilities is used to log in to application
	}
	
	@Test(priority = 1)
	public void getUserName()
	{
		String userName = home.getUserName();
		
		String fullUser = "Welcome"+ " " +userName;
		
		Assert.assertTrue(fullUser.contains("eoy"));
		
	}
	
	@Test (priority = 2)
	public void getServices()
	{
		List<String> services = home.getServices();
		//System.out.println(services);
		for(String str: services )
		{
			if(str.contains("Coursework"))
			{
				System.out.println("Verification passed for: " + str);
			}
			else if(str.contains("Moderation"))
			{
				System.out.println("Verification passed for: " + str);
			}
			else if(str.contains("User Management"))
			{
				System.out.println("Verification passed for: " + str);
			}
			else
			{
				System.out.println("Verification failed for: " + str);
			}
		}
	}
	
	
}
