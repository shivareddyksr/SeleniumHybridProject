package popPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement selTrainingImage;
	
	@FindBy(id="mycart")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public WebElement getFacebbok() {
		return facebook;
	}
	
	public void facebookBtn()
	{
		facebook.click();
	}

	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSelTrainingImage() {
		return selTrainingImage;
	}

	public WebElement getCart() {
		return cart;
	}
	
	
}
