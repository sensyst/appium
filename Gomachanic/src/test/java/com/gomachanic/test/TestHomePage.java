package com.gomachanic.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.gomachanic.executor.BaseSetUp;
import com.gomachanic.utility.PageUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomeScreen;
import pageObjects.PeriodicServiceScreen;

public class TestHomePage extends BaseSetUp {
	@Test
	public void verifyLaunchApp() throws InterruptedException {
		test = extent.createTest("Verify Home Page", "This Page is used to verify the home page");
		AndroidDriver<AndroidElement> driver = setcapabilities("generalstore");
		HomeScreen hs = new HomeScreen(driver);
		Assert.assertTrue(PageUtils.isElementDisplayed(hs.lnkPeriodicServices),
				"The periodic service link is not present on the screen");
		Thread.sleep(5000);
		Assert.assertTrue(PageUtils.isElementDisplayed(hs.lnkAcServiceRepair),
				"The Ac service link is not present on the screen");
		Thread.sleep(5000);
		Assert.assertTrue(PageUtils.isElementDisplayed(hs.lnkTyresWheelCare),
				"The Tyres and wheels service link is not present on the screen");
		Thread.sleep(5000);
		PeriodicServiceScreen pss = hs.clickPeriodicServiceLink();
		Assert.assertTrue(PageUtils.isElementDisplayed(pss.lblBasicService),
				"The Basic service lbl is not present on the screen");
	}
}
