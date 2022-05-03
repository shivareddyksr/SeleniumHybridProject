package popPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaSeleniumPage {

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playLink;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseLink;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closepopup;
	
	public JavaSeleniumPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void closeCookiesBtn()
	{
		closepopup.click();
	}
	
	public void videoPlay()
	{
		playLink.click();
	}
	
	public void videoPause()
	{
		pauseLink.click();
	}
}
