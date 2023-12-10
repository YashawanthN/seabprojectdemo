package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProject_import_pom {

	WebDriver driver;

	public NewProject_import_pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='upCoverpaper']")
	WebElement paperdownload;

	public void getPaperInfo() {
		paperdownload.sendKeys(
				"D:\\Yash\\Yash_projects_Office\\SEAB\\Test Data\\Test data new\\UAT\\UAT R3\\9750\\9750-2023");
	}

}
