package Scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import popPages.AddToCart;
import popPages.LoginPage;
import popPages.SkillraryDemoApp;

public class TestCase1 extends BaseClass {
	
	@Test
	public void test1() throws InterruptedException
	{
		LoginPage lg = new LoginPage(driver);
		lg.gearsButton();
		lg.skillrarydemoapplication();
		
		SkillraryDemoApp sda= new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.mouseHover(driver,sda.getCoursetab());
		sda.seleniumTrainingBtn();
		
		AddToCart atc = new AddToCart(driver);
		driverUtilities.doubleClick(driver,atc.getAddbtn());
		atc.addTocart();
		Thread.sleep(2000);
		driverUtilities.alertPopup(driver);
		Thread.sleep(3000);
	}
}


