package popPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchCourses;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitvalue;
	
	@FindBy(xpath="//a[@title='Core Java For Selenium Training']")
	private WebElement javaselvalue;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void javaselesrchBtn()
	{
		javaselvalue.click();
	}
	
	public void gearsButton()
	{
		gearsBtn.click();
	}
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	public void submitBtn()
	{
		submitvalue.submit();
	}
	
	public void searchCourseoption(String value)
	{
		searchCourses.sendKeys(value);
	}
}
