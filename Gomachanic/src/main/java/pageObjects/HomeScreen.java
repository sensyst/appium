package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.gomachanic.executor.BaseSetUp;
import com.gomachanic.utility.PageUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen extends BaseSetUp {
	/*
	 * Constructor of the page
	 */
	public HomeScreen(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public PeriodicServiceScreen clickPeriodicServiceLink() {
		PageUtils.clickElement(lnkPeriodicServices);
		return new PeriodicServiceScreen(driver);
	}

	/*
	 * Elements of the page
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Periodic Services']")
	public WebElement lnkPeriodicServices;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='AC Service & Repair']")
	public WebElement lnkAcServiceRepair;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tyres & Wheel Care']")
	public WebElement lnkTyresWheelCare;


}
