package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//button[.='Sign in with Google']")
	public WebElement btnSignWithGoogle;

	@FindBy(xpath = "//span[.='Sign in with Apple ID']")
	public WebElement btnSignWithApple;

	public boolean isDisplayed() {
		return false;

	}

	public void clickSignInGoogle() {
		btnSignWithGoogle.click();
	}

	public void clickSignInApple() {
		btnSignWithApple.click();
	}

}
