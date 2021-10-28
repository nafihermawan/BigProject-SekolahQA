package step_definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.CheckInCreatePage;
import page_object.CheckInsPage;
import page_object.HomePage;
import page_object.DashboardTeamsPage;
import page_object.QuestionPage;

@SuppressWarnings("deprecation")
public class CheckInsStep {

	public WebDriver webDriver;

	public CheckInsStep(WebDriver webDriver) {
		super();
		this.webDriver = Hooks.webDriver;
	}

	public CheckInsStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}

	@Given("I want to open the web page")
	public void userOpenPage() {

	}

	@And("i select group")
	public void and() throws InterruptedException {
		HomePage homePage = new HomePage(webDriver);
		Thread.sleep(2000);
		homePage.clickGroupC();
	}

	@And("i selects board")
	public void and2() throws InterruptedException {
		DashboardTeamsPage dashboardTeamsPage = new DashboardTeamsPage(webDriver);
//		dashboardTeamsPage.verifyElementTeams();
		Thread.sleep(2000);
		dashboardTeamsPage.clickChekIns();
	}

	@When("i click button add check ins")
	public void clickAddCheckIns() throws InterruptedException {
		CheckInsPage checkInsPage = new CheckInsPage(webDriver);
		Thread.sleep(2000);
		checkInsPage.clickBtnCreateCheckIns();
	}

	@And("i input \"(.*)\" as question, select day and click collecting answer")
	public void setCheckIns(String question) throws InterruptedException {
		CheckInCreatePage checkInCreatePage = new CheckInCreatePage(webDriver);
		Thread.sleep(2000);
		checkInCreatePage.inputQuestion(question);
		Thread.sleep(2000);
		checkInCreatePage.setWed();
		checkInCreatePage.clickBtnStartCollecting();
	}

	@Then("checkins already created")
	public void checkInsCreated() throws InterruptedException {
		CheckInsPage checkInsPage = new CheckInsPage(webDriver);
//		checkInsPage.verifyElementCheckIns();
//		Assert.assertTrue(checkInsPage.verifyElementCheckIns());
		Thread.sleep(2000);

		String actualTitle = "";
		actualTitle = webDriver.getTitle();

		Assert.assertEquals("Check-Ins", actualTitle);
		Assert.assertEquals(checkInsPage.getNotif(), checkInsPage.getNotif());
		Assert.assertEquals("Test CheckIns", checkInsPage.getnewQuestion());
	}

	@When("i click Question check ins")
	public void clickQuestionCheckIns() throws InterruptedException {
		CheckInsPage checkInsPage = new CheckInsPage(webDriver);
		Thread.sleep(2000);
		checkInsPage.clickCheckIns();
	}

	@And("i input \"(.*)\" as comment")
	public void inputComment(String comment) throws InterruptedException {
		QuestionPage questionPage = new QuestionPage(webDriver);
		Thread.sleep(2000);
		questionPage.clickBtnNewComment();
		Thread.sleep(2000);
		questionPage.inputComment(comment);
	}
	
	@Then("comment added")
	public void commentAdded() throws InterruptedException {
		QuestionPage questionPage = new QuestionPage(webDriver);
		
		String actualTitle = "";
		actualTitle = webDriver.getTitle();
		
		Assert.assertEquals("Test", actualTitle);
		Assert.assertEquals("Test Comment", questionPage.getNewCommentTxt());
		}
}
