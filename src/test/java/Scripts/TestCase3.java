package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.PropertyFile;
import popPages.JavaSeleniumPage;
import popPages.LoginPage;

public class TestCase3 extends BaseClass {

	@Test
	public void test1() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		PropertyFile pf = new PropertyFile();
		lp.searchCourseoption(pf.getPropertyFileData("searchCourse"));
		lp.submitBtn();
		lp.javaselesrchBtn();
		Thread.sleep(2000);
		
		JavaSeleniumPage jsp = new JavaSeleniumPage(driver);
		jsp.closeCookiesBtn();
		driverUtilities.switchFrames(driver);
		jsp.videoPlay();
		Thread.sleep(4000);
		jsp.videoPause();
		
		driverUtilities.switchBackFrames(driver);
		
		Thread.sleep(3000);
	}
	
}
