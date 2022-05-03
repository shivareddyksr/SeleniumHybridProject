package popPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	
	@FindBy(id = "course")
	private WebElement coursetab;

	@FindBy(xpath = "//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(xpath = "//Select[@class='chosen-select']")
	private WebElement dropdownbtn;
	
	public SkillraryDemoApp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public WebElement getDropdownbtn() {
		return dropdownbtn;
	}


	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seleniumTrainingBtn()
	{
		seleniumtraining.click();
	}
}
