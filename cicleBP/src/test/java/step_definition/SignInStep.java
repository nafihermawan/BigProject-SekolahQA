package step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.HomePage;

@SuppressWarnings("deprecation")
public class SignInStep {

	private WebDriver webDriver;

	public SignInStep(WebDriver webDriver) {
		super();
		this.webDriver = Hooks.webDriver;
	}

	public SignInStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}

	@Given("user open the web page")
	public void openLoginPage() {

	}

	@When("user click sign in with google")
	public void signInGoogle() {

	}

	@Then("user enter the dashboard")
	public void signInSucces() throws Throwable {
		HomePage homePage = new HomePage(webDriver);
		Thread.sleep(5000);
		homePage.clickProfile();
		
		String actualTitle = "";
		actualTitle = webDriver.getTitle();
		
		Assert.assertEquals("Home", actualTitle);
		Assert.assertEquals("Soal C", homePage.getTeamsName());
		Assert.assertEquals("SQA", homePage.getCompanyName());
		Assert.assertEquals("Nafi Hermawan", homePage.getProfileName());
		System.out.println("Assert (Title) passed");
	}
	
	@Then("user click notification")
	public void clickNotif() throws Throwable {
		HomePage homePage = new HomePage(webDriver);
		Thread.sleep(5000);
		homePage.clickNotif();
		homePage.clickViewAllNotif();
		
//		String actualTitle = "";
//		actualTitle = webDriver.getTitle();
//		
//		Assert.assertEquals("Home", actualTitle);
//		Assert.assertEquals("Soal C", homePage.getTeamsName());
//		Assert.assertEquals("SQA", homePage.getCompanyName());
//		Assert.assertEquals("Nafi Hermawan", homePage.getProfileName());
//		System.out.println("Assert (Title) passed");
	}

}
