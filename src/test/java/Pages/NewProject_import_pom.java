package Pages;

import static org.testng.Assert.assertEquals;
import java.util.List;


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
	WebElement paperDownload;

	@FindBy(xpath = "//*[@id = 'upCoverPersonnel']")
	WebElement personnelDownload;

	@FindBy(xpath = "//*[@id = 'upCoverCandidate']")
	WebElement candidateDownload;

	@FindBy(xpath = "//h5[text() = 'Project Import']")
	WebElement title;

	@FindBy(xpath = " //div[@class = 'pe-2']/ div[1]/div[2]/div[1]/span")
	WebElement uploadPaperInfo;

	@FindBy(xpath = "//button[@type = 'button' and text() = 'View Exam Centres' ]")
	WebElement viewExamCentres;

	@FindBy(xpath = " //table[@ class = 'table' ] / tbody[1]/ tr /td[1]")
	List<WebElement> code;
	
	@FindBy (xpath = "//ul[@class = 'pagination justify-content-center ng-star-inserted']/li")
	List<WebElement> pagination;
	
	@FindBy ( xpath = "//div [ @class = \"col-sm-12 pt-1\"] // button [text() = 'Download Import Template']")
	WebElement downloadExamcentre;
	
	public void downloadExamcentreTemplate()
	{
		downloadExamcentre.click();
		
		String  windows = driver.getWindowHandle();
		driver.switchTo().window(windows);
		 
		
	}
	
	public void gettitle() {
		String importsTitle = title.getText();
		String expectedTitle = "Project Import";
		assertEquals(importsTitle, expectedTitle);

	}

	public void viewExamCentre() {
		String expectedviewExamcentre = "View Exam Centres";
		if (viewExamCentres.getText().equalsIgnoreCase(expectedviewExamcentre)) {
			viewExamCentres.click();
		}

	}

	public void searchExamcentrebyCode() {
		System.out.println(code.size());
		for ( WebElement pages: pagination)
		{
			System.out.println(pages.getText());
		}

		for ( WebElement pages: pagination)
		{
			if(pages.isDisplayed())
			{
				for (WebElement value : code) {

					if (value.getText().equals("2011")) {
						System.out.println("Print the value" + value.getText());
						break;
					} 
					
					
					//pagination.iterator().hasNext();
			}
			
				
		}
		

		}

	}

	public void getPaperInfo() throws InterruptedException {
		String filepath = "D:\\\\Yash\\\\Yash_projects_Office\\\\SEAB\\\\Test Data\\\\Test data new\\\\UAT\\\\UAT R3\\\\9750\\\\9750-2023\\\\PaperInfo-9750-2023.xlsx";
		paperDownload.sendKeys(filepath);

		String actualFilename = "PaperInfo-9750-2023.xlsx";
		Thread.sleep(3000);
		String uplodedpaperInfoFileName = uploadPaperInfo.getText();
		assertEquals(uplodedpaperInfoFileName, actualFilename);
	}

	public void getPersonnelInfo() {
		personnelDownload.sendKeys(
				"D:\\Yash\\Yash_projects_Office\\SEAB\\Test Data\\Test data new\\UAT\\UAT R3\\9750\\9750-2023\\PersonnelInfo-9750-2023.xlsx");
	}

	public void getCandidateInfo() {
		candidateDownload.sendKeys(
				"D:\\Yash\\Yash_projects_Office\\SEAB\\Test Data\\Test data new\\UAT\\UAT R3\\9750\\9750-2023\\CandidateInfo-9750-2023.xlsx");
	}
}
