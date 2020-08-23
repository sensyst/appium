package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PeriodicServiceScreen {
	/*
	 * Constructor of the page
	 */
	public PeriodicServiceScreen(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Elements of the page
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Basic Service']")
	public WebElement lblBasicService;

}
