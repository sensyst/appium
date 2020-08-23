package com.gomachanic.utility;

import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.Status;
import com.gomachanic.resources.ExtentReport;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class PageUtils {
	AndroidDriver<AndroidElement> driver;

	public PageUtils(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public static void clickElement(WebElement ele) {
		try {
			ele.click();
			ExtentReport.test.log(Status.INFO, "Click on the element :" + ele);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void enterText(WebElement ele, String value) {
		try {
			ele.sendKeys(value);
			ExtentReport.test.log(Status.INFO, "Entering value in :" + ele + "as value :" + value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void swipeByEle(AndroidDriver<AndroidElement> driver, WebElement source, WebElement destination) {
		try {
			new TouchAction(driver)
					.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(1)))
					.moveTo(element(destination)).release().perform();
			ExtentReport.test.log(Status.INFO, "Swipe :" + source + "to destination :" + destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isElementDisplayed(WebElement ele) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ExtentReport.test.log(Status.INFO, "Element :" + ele + "is displayed on the screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
