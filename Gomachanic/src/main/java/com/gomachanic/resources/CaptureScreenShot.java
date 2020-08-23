package com.gomachanic.resources;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {
	public static String captureScreenShot(WebDriver driver, String screenShotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String sDestination = System.getProperty("user.dir") + File.separator + "Report" + File.separator
					+ "ScreenShot" + File.separator + screenShotName + ".png";
			File destination=new File(sDestination);
			FileUtils.copyFile(source, destination);
			System.out.println("Screen shot taken due to failure");
			return sDestination;
		} catch (Exception e) {
		System.out.println("exception while taking screenshot" + e.getMessage());
		return e.getMessage();
		}
	}
}
