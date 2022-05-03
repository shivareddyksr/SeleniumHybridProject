package genericLib;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo {

	public void getPhoto(WebDriver driver, String name) throws IOException
	{
		Date d = new Date(0);
		String CurrentDate = d.toString().replace(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.photoPath+CurrentDate+name+".png");
		FileUtils.copyFile(src, dest);
		
	}
}
