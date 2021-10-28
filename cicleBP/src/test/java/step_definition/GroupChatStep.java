package step_definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.HomePage;
import page_object.DashboardTeamsPage;
import page_object.GroupChatsPage;

@SuppressWarnings("deprecation")
public class GroupChatStep {

	private WebDriver webDriver;

	public GroupChatStep(WebDriver webDriver) {
		super();
		this.webDriver = Hooks.webDriver;
	}

	public GroupChatStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}

	@Given("i open the web page")
	public void openLoginPage() {
		String actualTitle = "";

		actualTitle = webDriver.getTitle();
		Assert.assertEquals("Home", actualTitle);
		System.out.println("Assert (Title) passed");		
	}

	@And("i select teams")
	public void clickGroup() throws InterruptedException {
		HomePage dashboardPage = new HomePage(webDriver);
		Thread.sleep(5000);
		dashboardPage.clickGroupC();
	}

	@And("i click group chat")
	public void clickGroupChat() throws InterruptedException {
		DashboardTeamsPage dashboardTeamsPage = new DashboardTeamsPage(webDriver);
		Thread.sleep(2000);
		dashboardTeamsPage.clickGoupChat();
		
//		String actualTitle = "";
//
//		actualTitle = webDriver.getTitle();
//		Assert.assertEquals("Soal C", actualTitle);		
	}

	@When("i Input \"(.*)\" in the chat field")
	public void test(String text) throws InterruptedException {
		GroupChatsPage groupChatPage = new GroupChatsPage(webDriver);
		Thread.sleep(2000);
		groupChatPage.inputTxt(text);
		
		String actualTitle = "";
		
		actualTitle = webDriver.getTitle();
		Assert.assertEquals("Group Chat Soal C", actualTitle);
	}

	@Then("messages sent")
	public void messageSent() {
		
	}
	
	@When("i click button attach file and select file \"(.*)\"")
	public void attachFile(String file) throws InterruptedException {
		GroupChatsPage groupChatPage = new GroupChatsPage(webDriver);
		Thread.sleep(3000);
		groupChatPage.clickAttach();
	}
	
	@Then("file sent")
	public void statusUpload() {
		GroupChatsPage groupChatsPage = new GroupChatsPage(webDriver);
		
		Assert.assertEquals("Test Hallo", groupChatsPage.getChatText());
	}
	
}
