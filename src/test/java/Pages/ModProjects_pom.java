package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ModProjects_pom  {

	WebDriver driver;
	public ModProjects_pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Import']")
	public static WebElement imports;

	public void getimportbutton() {
		imports.click();
		
	}

}
