package utilities;

import Pages.home_pom;
import Pages.login_pom;

public class logInFunction extends Readpropertiesfiles{
	
	public login_pom login;
	
	String eoUser = Readpropertiesfiles.Property.getProperty("eo");
	String eoPass = Readpropertiesfiles.Property.getProperty("eo_pass");
	
	public home_pom getloggedIn(String email, String password)
	{

		login = new login_pom();
		login.enterEmail(email);
		login.enterPass(password);
		return login.getHomePage();
		
		
	}
	
	public home_pom logInToApplication()
	{
		return getloggedIn(eoUser,eoPass );
	}
}
