package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.gomachanic.executor.BaseSetUp;
import com.gomachanic.utility.PageUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class LoginScreen  extends BaseSetUp{
	/*
	 * Constructor of the page
	 */
	public LoginScreen(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public HomeScreen login(String userName,String password)
	{
		PageUtils.enterText(textUserName,userName);
		PageUtils.enterText(textPassWord, password);
		PageUtils.clickElement(btnSignIn);
		return new HomeScreen(driver);
	}

	/*
	 * Elements of the page
	 */
	@AndroidFindBy(id = "com.sus.scm_mobile:id/et_userid")
	public WebElement textUserName;
	
	@AndroidFindBy(id = "com.sus.scm_mobile:id/et_userpassword")
	public WebElement textPassWord;
	
	@AndroidFindBy(id = "com.sus.scm_mobile:id/rel_login")
	public WebElement btnSignIn;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Open Drawer']")
	public WebElement openDrawer;
	
	
}
