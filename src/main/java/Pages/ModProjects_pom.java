package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModProjects_pom {

	WebDriver driver;

	public ModProjects_pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* ----------------------- DOM Element locators------------------------ */

	@FindBy(xpath = "//button[normalize-space()='Import']")
	public static WebElement imports;

	@FindBy(xpath = "//label[normalize-space()='Setup in Progress']")
	public static WebElement setupInprogressHeader;

	@FindBy(xpath = "//tbody/tr[1]")
	public static WebElement cwProjectName;

	@FindBy(xpath = "//img[@alt = 'icon']")
	public static WebElement menuContextIcon;

	@FindBy(xpath = "//span[text()='Configure']")
	public static WebElement configuremenuContextOptions;

	@FindBy(id = "pills-Scdl-tab")
	private static WebElement schedulesTab;

	/* ------------------Actions ------------------------------------------ */

	public void getimportbutton() {
		imports.click();

	}

	public void getSetupInprogressHeader() {
		setupInprogressHeader.click();
	}

	public void getProjectName() {
		cwProjectName.click();
	}

	public void getmenuContexts() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", menuContextIcon);

	}

	public void getclickConfigure() {

		configuremenuContextOptions.click();

		/*
		 * try {
		 * 
		 * for (WebElement ele : menuContextOptions) { String options = ele.getText();
		 * // System.out.println(options);
		 * 
		 * 
		 * if (options.equals("Configure")) { System.out.println(options); break; } else
		 * { System.out.println("Not found"); }
		 * 
		 * }
		 * 
		 * } catch (StaleElementReferenceException e) {
		 * 
		 * }
		 */
	}

	public void clickSchedules() {
		schedulesTab.click();
	}

}
