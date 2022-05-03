package Scripts;

import java.awt.Point;
import java.io.IOException;

import org.testng.annotations.Test;
import genericLib.BaseClass;
import popPages.LoginPage;
import popPages.SkillraryDemoApp;
import popPages.TestingPage;

public class TestCase2 extends BaseClass{

	@Test
	public void test1() throws InterruptedException
	{
		LoginPage lp =new LoginPage(driver);
		lp.gearsButton();
		lp.skillrarydemoapplication();
		
		SkillraryDemoApp sda = new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.dropDown(sda.getDropdownbtn(),"Testing");
		Thread.sleep(3000);
		
		TestingPage tp = new TestingPage(driver);
		driverUtilities.dragAndDrop(driver, tp.getSelTrainingImage(), tp.getCart());
		Thread.sleep(3000);
		
		org.openqa.selenium.Point p = tp.getFacebbok().getLocation();
		int x = p.getX();
		int y = p.getY();
		driverUtilities.scrollBar(driver, x, y);
		Thread.sleep(2000);
		tp.facebookBtn();
	}
}
